package com.parth.basics;

import java.util.Scanner;

public class B11Arrays {
    public static void main(String[] args) {

//        Arrays :- used to store multiple values in a single variable:

        Scanner scan = new Scanner(System.in);

//        String[] cars = {"","","","","",""};
        String[] cars = new String[4];

        System.out.println("Enter the name of a car1");
        cars[0] = scan.next();

        System.out.println("Enter the name of a car2");
        cars[1] = scan.next();

        System.out.println("Enter the name of a car3");
        cars[2] = scan.next();

        System.out.println("Enter the name of a car4");
        cars[3] = scan.next();



        for(int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }


    }
}
