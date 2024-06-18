package decision_structures;

import java.util.Scanner;

public class ChangeForDollar {
    public static void main(String[] args){
        // Change for a dollar.
        // If change == 1 dollar -> Win
        // If change > 1 dollar -> Ask how much they were over
        // If change < 1 dollar -> Ask how much they were under

        // 1 penny = 1 cent
        double penny = 0.01;
        // 1 nickel = 5 cents
        double nickel = 0.05;
        // 1 dime = 20 cents
        double dime = 0.2;
        // quarter = 25 cents
        double quarter = 0.25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.println("Enter your number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.println("Enter your number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.println("Enter your number of quarters: ");
        int quarters = scanner.nextInt();

        scanner.close();

        double dollars = penny*pennies + nickel*nickels + dimes*dime + quarters*quarter;

        if (dollars == 1.){
            System.out.println("Yay! That's exactly $1.00! You Win!");
        }
        else if (dollars < 1){
            double amountShort = 1 - dollars;
            System.out.println("Sorry, you went " + amountShort + " under");
        }
        else {
            double amountOver = dollars - 1;
            System.out.println("Sorry, you went " + amountOver + " over");
        }
    }
}
