package com.parth.basics;

import java.util.Scanner;

public class B4SwitchCases {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name of a day:-");
        String day = scan.next().toLowerCase();

        switch(day){
            case "monday" :
                System.out.println("It is Monday");
                break;
            case "tuesday" :
                System.out.println("It is Tuesday");
                break;
            case "wednesday" :
                System.out.println("It is Wednesday");
                break;
            case "thrusday" :
                System.out.println("It is Thrusday");
                break;
            case "friday" :
                System.out.println("It is Friday");
                break;
            case "saturday" :
                System.out.println("It is Saturday");
                break;
            case "sunday" :
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Invalid input please enter name of days");
        }
    }
}
