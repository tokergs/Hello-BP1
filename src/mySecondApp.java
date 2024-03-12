/*package pl.pp;
import java.util.Scanner;

public class mysecondapp {
    public static void main(String[] args) {
        double x = 10;
        double y = 2;
        Scanner scanner = new Scanner(System.in);

        var result = x+y;
        System.out.println("x + y = " + result);

        result = x-y;
        System.out.println("x -y = " + result);

        result = x*y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("enter two numbers separated by the key: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y=" + (first + second));

    }

} */

import java.util.Scanner;

public class mysecondapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        int x = 10;
        int doubleOfX = 2 * x;
        int squareOfX = x * x;

        System.out.println("x = " + x);
        System.out.println("Double of x = " + doubleOfX);
        System.out.println("Square of x = " + squareOfX);

        // Task 2
        System.out.print("\nEnter your age in years: ");
        int ageInYears = scanner.nextInt();

        int ageInSeconds = ageInYears * 365 * 24 * 60 * 60;

        System.out.println("My age in seconds: " + ageInSeconds);
    }
}