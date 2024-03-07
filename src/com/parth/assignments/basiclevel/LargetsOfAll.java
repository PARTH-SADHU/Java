package com.parth.assignments.basiclevel;

import java.util.Scanner;

public class LargetsOfAll {
    public static void main(String[] args) {

//       Q : Take integer inputs till the user enters 0 and print the largest number from all.

        System.out.println("Welcome");
        System.out.println("Please enter number or Press '0' if you want to quit, and you'll get the largest of all numbers entered");

        Scanner scan = new Scanner(System.in);
        int userInput;
        int largestNumber = 0;

        while(true){
            userInput = scan.nextInt();

            if( userInput > largestNumber ){
                largestNumber = userInput ;
            } else if (userInput == 0) {
                System.out.println("Thank-you for playing");
                break;
            }
            System.out.println("Please enter the next number of your choice");

        }
        System.out.println("The largest number from all the entered numbers is");
        System.out.println(largestNumber);
    }
}
