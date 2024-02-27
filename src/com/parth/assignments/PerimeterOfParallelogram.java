package com.parth.assignments;

import java.util.Scanner;

public class PerimeterOfParallelogram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Perimeter of Parallelogram");
        System.out.println("Enter the values of side and base to calculate ");

        double perimeter;
        System.out.println("Enter the value of side :-");
        double side = scan.nextDouble();
        System.out.println("Enter the value of base :-");
        double base = scan.nextDouble();

        perimeter = 2 * (side + base);
        System.out.println(perimeter);
    }
}
