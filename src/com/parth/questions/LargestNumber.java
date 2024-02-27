package com.parth.questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int largestNumber=0;
        System.out.println("Enter the numbers:-");
        int number = scan.nextInt();

        while(number !=0){
            largestNumber = number;
            if(number> largestNumber){
                largestNumber = number;
            }
            System.out.println("Enter next number or enter 0 to exit");
            number = scan.nextInt();
        }

        System.out.println(largestNumber);

    }
}
