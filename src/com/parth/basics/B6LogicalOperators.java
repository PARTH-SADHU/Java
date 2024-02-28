package com.parth.basics;

import java.util.Scanner;

public class B6LogicalOperators {
    public static void main(String[] args) {

//        Logical Operators : used to connect two or more operators:

        Scanner scan = new Scanner(System.in);
//        && = (AND) both conditions must be true in order to make the statement true

        System.out.println("Enter the temperature to check whether its hot,warm or cold out there");
        int temp = scan.nextInt();

        if(temp>14 && temp<28){
            System.out.println("Its warm out there");
        } else if (temp>29) {
            System.out.println("Its hot out there");
        }
        else {
            System.out.println("Its cold out there");
        }


//        || = (OR) any one of the conditions must be true to make the statement true

        System.out.println("You're playing a game, press 'q' or 'Q' if you want to quit:");
        String response = scan.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit!!!!!");
        }
        else {
            System.out.println("the game is still on");
        }
//        ! = (Not)

        System.out.println("Press 0 to quit");
        int userInput = scan.nextInt();

        if(userInput != 0){
            System.out.println("Press quit to exit");
        }else {
            System.out.println("You pressed quit");
        }

    }
}
