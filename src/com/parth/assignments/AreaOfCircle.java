package com.parth.assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Circle Area Calculator");
        double pie = 3.14;

        System.out.println("Enter the value of Radius of Circle");
        double radius = scan.nextDouble();

        double area = pie * (radius*radius);

        System.out.println("Area of the Circle given by you is: "+area);

    }
}
