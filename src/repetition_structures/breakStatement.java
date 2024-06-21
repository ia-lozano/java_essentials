package repetition_structures;

import java.util.Scanner;

public class breakStatement {
    public static void main(String[] args){
        // Search a string to determine if it contains the letter A
        // Get text
        System.out.println("Enter text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);

            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                System.out.println("A found");
                break;
            }
        }
    }
}
