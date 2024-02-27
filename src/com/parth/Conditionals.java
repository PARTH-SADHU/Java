package com.parth;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Looping:-
            if looop:
            if(boolean expressions condition true or false){
                body
            }
            else{
                if condition is not true then execute this
            }
        */


//        int salary = 23000;

        Scanner sc = new Scanner(System.in);

        int salary = Integer.parseInt(sc.next());
        String menuOption = sc.next();

        System.out.println("Welcome to the system");
        System.out.println("Enter your salary so that we'll let you know if you're eligible for the bonus or not:-");

        while (menuOption != "exit") {

            if (salary > 10000) {
                System.out.println("Youre eligible for the bonus of 2500 rupees");
                salary = salary + 2500;
                System.out.println("Your total salary is :-" + salary);
            } else {
                System.out.println("You're eligible for the basic bonus");
                salary = salary + 1200;
                System.out.println("With basic salary bonus your total salary becomes:-" + salary);
            }
        }
    }
}