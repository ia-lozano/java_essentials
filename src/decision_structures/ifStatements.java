package decision_structures;

import java.util.Scanner;

public class ifStatements {

    public static void main(String[] args) {
        // initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("Number of sales this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
        if (sales >= quota){
            salary = salary + bonus;
            System.out.println("Congrats! You've met your quota");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short");
        }

        // Determine rank based on sales
        char rank;
        if (sales < 6){
            rank = 'F';
        }
        else if (sales < 7){
            rank = 'D';
        }
        else if (sales < 8){
            rank = 'C';
        }
        else if (sales < 9){
            rank = 'B';
        }
        else {
            rank = 'A';
        }

        // Output
        System.out.println("The total pay is $" + salary);
        System.out.println(("Your global rank is: " + rank));
    }

}
