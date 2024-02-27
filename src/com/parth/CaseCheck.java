package com.parth;

import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // .next()-just prints the next word.
        // .trim()-just removes the extra spaces or extra white spaces from the string.
        // .charAt()- gives the character at the given particular index.

        char character = scan.next().trim().charAt(0);

        //while(){
        if (character >= 'a' && character <= 'z') {
            System.out.println("Entered character is Lower Case - " + character);
        } else if (character >= 'A' || character <= 'Z') {
            System.out.println("Entered character is Upper Case - " + character);
        } else {
            System.out.println("Entered character is neither Lower Case nor Upper Case");
        }

        //  }
    }
}
