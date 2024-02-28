package com.parth.basics;

import java.util.Scanner;

public class B7DecisionMaking {
    public static void main(String[] args) {

//        if statement:- performs a block of code if the condition is true:
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();

        if(age>18){
            System.out.println("You're eligible to buy lotttery and smokes as you're not a teenager now");

        } else if (age>100) {
            System.out.println("This is not possible can you please show me some relevant id");
        }
        else{
            System.out.println("Sorry but you're not eligible");
        }
        scan.close();

    }
}
