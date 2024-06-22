package objects;

import java.util.Scanner;

public class objectsAsMethodParameters {
    // Home area calculator with methods

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        rectangle kitchen = getRoom();
        rectangle bathroom = getRoom();
        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);

        scanner.close();
    }

    public static double calculateTotalArea(rectangle rectangle1, rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        return new rectangle(length, width);
    }
}
