package com.parth.basics.B22OOPs;

public class Main {
    public static void main(String[] args) {

        Cars myCar = new Cars();

        System.out.println(myCar.makers);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.year);

        myCar.drive();
        myCar.brake();
    }
}
