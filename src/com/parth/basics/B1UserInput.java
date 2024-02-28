package com.parth.basics;

import java.util.Scanner;

public class B1UserInput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.nextLine();
    /*
    *   scan.nextLine()- What this does is scanner reads the input till new line(\n) character
    *   scan.nextInt()- What this does is scanner reads only till integer values after that if we press it reads \n new line character
    *   That is the reason if we use any nextline after nextint then the userinput for nextline is skipped as the scanner still holds the value of \n and when pressed enter it takes input of nextLine as newline character(\n) thats the reason why the last input is skipped.
    *
    *   Solution for this is :- To add a scan.nextLine() what it does is scanner will take it as a character and will allow user to add the input
    *  */

        System.out.println("Enter your age:-");
        int age = scan.nextInt();

        System.out.println("Enter your place of birrth:-");
        String city = scan.nextLine();
    }
}
