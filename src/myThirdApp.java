/*package pl.pp;
import java.util.Scanner;

public class myThirdApp{public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number greater than 100:");

    // WHILEloop(https://introcs.cs.princeton.edu/java/11cheatsheet/images/while.png)

    var number1 = scanner.nextDouble();
    while (number1 <= 100) 
    {
        System.out.println("The number is not greater than 100, enter again:");
        number1 = scanner.nextDouble();
    }
    System.out.println("Thank you! You’ve entered: " + number1);

    // DO..WHILE loop (https://introcs.cs.princeton.edu/java/11cheatsheet/images/do-while.png)
    double number2;
    do {
        System.out.println("Enter a number greater than200:");
        number2 = scanner.nextDouble();
    } 
    while (number2 <= 200);
    System.out.println("Thank you! You’ve entered: " + number2);

    // FORloop(https://introcs.cs.princeton.edu/java/11cheatsheet/images/for.png)
    int wynik = 0;
    for (var i = 1; i <= 10; i++) {
        wynik = wynik + i;
        System.out.println("Iteration no." + i + " in the for loop, and the result(wynik)= " + wynik);
    }

    //IF..ELSE conditional statements(https://introcs.cs.princeton.edu/java/11cheatsheet/images/if.png)

    System.out.println("Enter the value ofx: ");
    var x = scanner.nextDouble();
    System.out.println("Enter the value ofy: ");
    var y = scanner.nextDouble();
    
    if(x > y){
        System.out.println("x is greater thany");
    } else if (x < y) {
        System.out.println("x is smaller thany");
    } else {
        System.out.println("x equalsy");
    }

    //terminating the program by pressing a specific key

    while(true)
    {
        System.out.println("Enter-1 to exit the program");
        var input = scanner.nextDouble();
        if(input == -1) {
            System.out.println("Exit...");
            break;
            }
        }scanner.close();
    }
}
*/

import java.util.Scanner;

public class myThirdApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1:
        while (true) {
            System.out.print("Enter the number of days: ");
            int days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Exiting program...");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;

            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.");


            scanner.nextLine();
        }

        // Task 2
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Temperature in Fahrenheit: " + (1.8 * celsius + 32.0));
        System.out.println("Temperature in Kelvin: " + (celsius + 273.16));

        scanner.close();
    }
}
