package com.parth.basics;

import java.util.Scanner;

public class B13Strings {
    public static void main(String[] args) {

//        String :- it is a reference datatype that can store one or more character.
//        This reference datatype have access to useful methods.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:-");
        String name = scan.next();

//        .equals - checks for two strings if they are equal or not.
        boolean result = name.equals("name");
        System.out.println(result);

//        .equalsIgnoreCase() - checks for equality and ignores the uppercase.
        boolean result1 = name.equalsIgnoreCase("parth");
        System.out.println(result1);
        String result2 = name.toLowerCase();
        String result3 = name.toUpperCase();

//        .length() - returns length of the string.
        int length =name.length();
        System.out.println(length);

//        charAt(i) - returns particular character at the provided index.

        char character = name.charAt(2);
        System.out.println(character);


    }
}
