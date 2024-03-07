package com.parth.basics.B37Interface;

public class Main {
    public static void main(String[] args) {
//        Interface : a template that can be applied to a class,
//                    similar to inheritance but the methods in these type of class,
//                    don't have bodies and specifies what a class must do.
//                    classes can apply more than one interface, inheritance is only limited
//                    to only one super class.

        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}
