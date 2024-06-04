import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = null;
        String outputFilePath = null;
        boolean validInputFile = false;

        // Specify the directory to check for sample_text.txt
        String directoryPath = System.getProperty("C:\\GIT PL\\AEH_BP24L_Bilets_53222\\src"); // Current working directory
        inputFilePath = Paths.get(directoryPath, "sample_text.txt").toString();
        File inputFile = new File(inputFilePath);

        // Check if sample_text.txt exists in the specified directory
        if (inputFile.exists() && !inputFile.isDirectory()) {
            validInputFile = true;
            System.out.println("Using default input file: " + inputFilePath);
        } else {
            System.out.println("Default input file 'sample_text.txt' does not exist in the directory: " + directoryPath);
            while (!validInputFile) {
                System.out.print("Please enter the path to the input text file: ");
                inputFilePath = scanner.nextLine();
                inputFile = new File(inputFilePath);

                if (inputFile.exists() && !inputFile.isDirectory()) {
                    validInputFile = true;
                } else {
                    System.out.println("The file does not exist. Please try again.");
                }
            }
        }

        System.out.print("Please enter the path to the output text file: ");
        outputFilePath = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();

            System.out.println("The number of lines in the file: " + lineCount);

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("File name: " + inputFilePath);
            writer.newLine();
            writer.write("Number of lines: " + lineCount);
            writer.close();

            System.out.println("The results have been written to " + outputFilePath);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
