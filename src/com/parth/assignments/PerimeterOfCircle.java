package com.parth.assignments;

import java.util.Scanner;

public class PerimeterOfCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Perimeter Calculator:");
        System.out.println("You can calculate perimeter using diameter or radius please press 'r' if you've radius and\n press 'd' if you have diameter of a circle ");
        String userInput = scan.next();
        double perimeter;
        double pie = 314;
        double radius;
        double diameter;

        if(userInput.equals("r")){
            System.out.println("Please enter the value of radius : ");
            radius = scan.nextDouble();
            perimeter = (2 * pie * radius) / 100;
            System.out.println("Perimeter is : "+perimeter);

        } else if (userInput.equals("d")) {
            System.out.println("Please enter the value of diameter : ");
            diameter = scan.nextDouble();
            perimeter = (pie * diameter) / 100;
            System.out.println("Perimeter is : "+perimeter);


        }
        else{
            System.out.println("Invalid character entered, please enter either r for radius and d for diameter");
        }


    }

}
