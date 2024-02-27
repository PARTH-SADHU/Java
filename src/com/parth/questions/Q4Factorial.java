package com.parth.questions;

import java.util.Scanner;

public class Q4Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which you want its factorials:-");

        int number = scan.nextInt();

        for (int i=1; i<=number;i++){
            if(number%i == 0){
                System.out.println(i);
            }
        }
    }
}
