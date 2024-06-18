package decision_structures;

import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args){

        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        // Switch Statements
        String message;
        switch(grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Nice Job";
                break;
            case "C":
                message = "Mnehhh";
                break;
            case "D":
                message = "Keep trying";
                break;
            case "E":
                message = "dude....";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }
        System.out.println(message);

        System.out.println("Enter your rank: ");
        String rank = scanner.next();
        scanner.close();

        // Switch Expressions
        String fallThrough = switch(rank){
            case "SSS" -> "OMG";
            case "SS" -> "Nice!";
            case "S" -> "not bad at all...";
            case "A" -> "try again...";
            case "B" -> "oh god...";
            default -> "Invalid rank";
        };
        System.out.println(fallThrough);
    }
}
