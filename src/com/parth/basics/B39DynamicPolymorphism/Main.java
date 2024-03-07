package com.parth.basics.B39DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Animal animal;

        System.out.println("Which animal do you want?");
        System.out.print("Press - (1 for Dog) & (2 for Cat):");

        int userChoice = scan.nextInt();
        if(userChoice == 1){
            animal = new Dog();
            animal.speak();
        } else if (userChoice == 2) {
            animal = new Cat();
            animal.speak();
        }else {
            System.out.println("Your choice was Invalid");
            animal = new Animal();
            animal.speak();
        }
        scan.close();
    }
}
