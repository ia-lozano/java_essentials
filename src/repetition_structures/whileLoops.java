package repetition_structures;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args){
        // Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did the employee work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 0 and 40");
            hoursWorked = scanner.nextDouble();
        }

        // Calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);

        // Do while loop executes the code block at least one time
        int runAgain = 0;

        do{
            System.out.println("Enter the first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double number2 = scanner.nextDouble();

            double sum = number2 + number1;
            System.out.println("The sum is " + sum);

            System.out.println("Wanna start over?");
            runAgain = scanner.nextInt();

        } while(runAgain == 1);

        scanner.close();
    }
}
