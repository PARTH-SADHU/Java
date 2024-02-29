package com.parth.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class B15ArrayLists {
    public static void main(String[] args) {

//        ArrayLists :- a resizable array.
//                      Elements can be added or removed after compilation phase
//                      Store reference datatypes.

        ArrayList<String> favCars = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to your Dream Garage");
        System.out.println();

        while(true){
            System.out.println("Press :1-Display your Dream Garage");
            System.out.println("Press :2-Add new monsters to your Garage");
            System.out.println("Press :3-Sell and Delete any car from the Garage");
            System.out.println("Press :4-To exit from the Garage");

            int userInput = scan.nextInt();


            if(userInput == 1){
                System.out.println("pressed 1");

                if(!favCars.isEmpty()){
                    System.out.println("Your Dream car Garage:-");
                    for(int i=0; i<favCars.size();i++){
                        System.out.println((i+1)+" "+favCars.get(i));
                    }
                }else {
                    System.out.println("Your Dream Garage is empty right now\nAdd cars to your garage");
                }
            } else if (userInput == 2) {
                System.out.println("pressed 2");
                System.out.println("Enter the Name of your new Car:-");
                String newAddition = scan.next();
                favCars.add(newAddition);
                System.out.println("New Arrivals, car added ");

            } else if (userInput==3) {
                System.out.println("pressed 3");
                System.out.print("Please enter the number of car you want to sell or remove from your  Dream Garage:-");
                int carNumber = scan.nextInt();
                if(carNumber<=favCars.size()){
                    favCars.remove(carNumber-1);
                }else {
                    System.out.println("Please verify if you have the entered car in your garage");
                }
            }
            else {
                System.out.println("You exitted");
                break;
            }
        }

    }
}
