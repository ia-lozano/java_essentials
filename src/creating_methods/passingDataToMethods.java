package creating_methods;

import java.util.Scanner;

public class passingDataToMethods {
    public static void main(String[] args){

        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        // Check if the user is qualified
        // Note that the variables can have the same name
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
    }

    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredScore = 700;

        if(salary >= requiredSalary && creditScore >= requiredScore){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("You're qualified!");
        }
        else{
            System.out.println("Not qualified");
        }
    }
}
