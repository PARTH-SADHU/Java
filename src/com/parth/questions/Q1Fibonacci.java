package com.parth.questions;

import java.util.Scanner;

public class Q1Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        int a =0;
        int b =1;
        int count = 2;

        while(count<=userInput){
            int temp = b;
            b = b + a;
            a= temp;
            count++;
        }
        System.out.println(b);
    }
}
