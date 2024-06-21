package creating_methods;

import java.util.Scanner;

public class methods {
    public static void main(String[] args){
        greetUser();
    }

    // Anatomy of a method:
    // First line is called a header.

    // First word is the "access modifier", indicate who is allowed to access the method (not required)
    // if the access modifier is not specified it means that is only accessible by classes in the same package

    // The second word is a "non-access modifier", they include static, final, abstract and synchronized
    // not every method requires this modifiers

    // The third is the "return type", every method is required to specify a return type, even if the method
    // is not expected to return anything, it should be specified by using "void" return type

    // A method can only return one value and a method is not executed unless it is called.

    // All methods must be contained within the scope of a class.

    public static void greetUser(){
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hi there, " + name);
    }


}
