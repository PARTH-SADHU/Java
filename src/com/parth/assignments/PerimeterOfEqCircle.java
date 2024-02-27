package com.parth.assignments;

import java.util.Scanner;

public class PerimeterOfEqCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter side of the triangle to calculate its perimeter:-");
        double sideOfTriangle = scan.nextDouble();

        double perimeter = 3 * sideOfTriangle;
        System.out.println(perimeter);

    }
}
