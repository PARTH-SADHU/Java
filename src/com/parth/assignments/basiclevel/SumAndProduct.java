package com.parth.assignments.basiclevel;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
//        * Subtract the product and sum of a given number:

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number you want to calculate the sum and product of that number");

        int inputNumber = scan.nextInt();
        int sum =0;
        int product = 1;


        while(inputNumber>0){
            int temp = inputNumber % 10;
            inputNumber = inputNumber /10;
            sum = sum + temp;
            product = product * temp;
        }
        System.out.println("The Sum of the number is : "+sum);
        System.out.println("The Product of the number is : "+product);
        System.out.println("Their subtraction is : "+(product-sum) );


        scan.close();
    }
}
