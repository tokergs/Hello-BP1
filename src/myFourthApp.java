import java.util.Scanner;

public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the lower limit: ");
            int lowerLimit = scanner.nextInt();

            System.out.print("Enter the upper limit: ");
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Upper limit should be greater than the lower limit. Please try again.");
                continue;
            }

            int sum = 0;
            for (int i = lowerLimit; i <= upperLimit; i++) {
                sum += i * i; // Square each number and add to the sum
            }

            System.out.println("The sum of squares from " + lowerLimit + " to " + upperLimit + " is: " + sum);
        }
    }
}
