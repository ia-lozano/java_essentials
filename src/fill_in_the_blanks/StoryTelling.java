package fill_in_the_blanks;

import java.util.Scanner;

public class StoryTelling {

    public static void main(String[] args) {
        // Opening Scanner method
        Scanner scanner = new Scanner(System.in);

        //1. First prompt
        String season = "";
        System.out.println("Enter a season of the year: ");
        season = scanner.next();

        //2. Second prompt
        int number = 0;
        System.out.println("Enter an INTEGER number: ");
        number = scanner.nextInt();

        //3. Third prompt
        String adjective = "";
        System.out.println("Enter an adjective: ");
        adjective = scanner.next();

        scanner.close();

        System.out.println(season + " has " + number + " sons and they all are " + adjective);

    }
}
