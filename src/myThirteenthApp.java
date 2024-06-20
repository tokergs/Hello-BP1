import java.io.*;
import java.nio.file.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "";
        String outputFilePath = "";

        // Get input file path from the user
        while (true) {
            System.out.println("Please provide the path for the input text file:");
            inputFilePath = scanner.nextLine();
            if (Files.exists(Paths.get(inputFilePath))) {
                break;
            } else {
                System.out.println("The input file does not exist. Please try again.");
            }
        }

        // Get output file path from the user
        System.out.println("Please provide the path for the output file:");
        outputFilePath = scanner.nextLine();

        // Read the input file and process the content
        Map<String, Integer> wordCountMap = new HashMap<>();
        int totalWords = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                totalWords += words.length;
                for (String word : words) {
                    word = word.toLowerCase();
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the input file: " + e.getMessage());
            return;
        }

        // Display the results to the user
        System.out.println("Total number of words: " + totalWords);
        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Write the results to the output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("Filename: " + inputFilePath + "\n");
            writer.write("Total number of words: " + totalWords + "\n");
            writer.write("Word occurrences:\n");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to the output file: " + e.getMessage());
        }
    }
}
