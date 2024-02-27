package com.parth.questions;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the numbers and you'll get the sum of all numbers you enter & enter 0 to exit:-");
        int number = scan.nextInt();
        int sumOfNumbers = 0;

        while(number != 0){
            sumOfNumbers = sumOfNumbers + number;
            System.out.println("Enter the next int or 0 if you want to exit");
            number = scan.nextInt();
        }

        System.out.println(sumOfNumbers);
    }
}
