package com.parth.questions;

import java.util.Scanner;

public class Q3Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int reverse = 0;
        while (number > 0) {
            int moduloNumbers = number % 10;
            number = number / 10;
            reverse = reverse * 10 + moduloNumbers;



        }
        System.out.println(reverse);
    }
}
