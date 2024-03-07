package com.parth.assignments.basiclevel;

import java.util.Scanner;

public class SumOfAllNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to calculate the sum:");
        int userInput = scan.nextInt();
        int sumOfAllNumbers = 0;

        while(userInput > 0){
            if (userInput!=0){
                sumOfAllNumbers = sumOfAllNumbers + userInput;
                userInput = scan.nextInt();


            }else if(userInput==0) {
                System.out.println("Invalid Input, please enter a valid input grater than zero");
            }
        }
        System.out.println("Sum of all the numbers are: "+sumOfAllNumbers);
        scan.close();
    }
}
