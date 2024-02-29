package com.parth.basics.B23OOPs1;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Parth",23,75);
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);

        human.eating();
        human.drinking();
    }
}
