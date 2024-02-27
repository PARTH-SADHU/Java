package com.parth.questions;

import java.util.Scanner;

public class Q2Repitition {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number from which you want to find repeated number:-");
        int randomNumber = scan.nextInt();

        System.out.println("Enter the number who's repitition you want:-");
        int repititionNumber = scan.nextInt();

        int count = 0;
        while(randomNumber>0){
                int temp = randomNumber % 10;
                if (repititionNumber == temp){
                    count++;
                }
            randomNumber = randomNumber / 10;
        }
        System.out.println("Count:-"+count);
    }
}
