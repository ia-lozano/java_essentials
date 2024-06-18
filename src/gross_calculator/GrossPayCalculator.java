// First we begin with the package declaration
package gross_calculator;

// Import classes here
import java.util.Scanner;

// Then we declarate the class
public class GrossPayCalculator {
    // Declare global variables here

    // The next thing is to declare a method
    public static void main(String[] args){
        System.out.println("Hello World");

        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();

        //3. Multiply hours and pay rate
        double grossPay = hours*payRate;

        //4. Display result
        System.out.println("Gross Pay: " + grossPay);

        // We can declare a variable as var, use only with local variables
        var isWaterWet = true;
    }
}
