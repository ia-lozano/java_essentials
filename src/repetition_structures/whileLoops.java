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

        scanner.close();

        // Calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
