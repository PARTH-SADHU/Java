package com.parth.assignments.intermediate;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
//        Q - Factorial Program In Java
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to find its factorial");
        int userInput = scan.nextInt();
        int factorialOfNumbers = 1;
        for(int i = 1; i <= userInput; i++ ){
            factorialOfNumbers = factorialOfNumbers * i;
        }
        System.out.println("Factorial of the given number is:"+factorialOfNumbers);

        scan.close();
    }
}
