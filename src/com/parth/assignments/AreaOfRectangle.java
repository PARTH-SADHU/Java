package com.parth.assignments;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
//      Area of rectangle is Area = length * Width
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the values of length and width of rectangle:");
        double length = scan.nextDouble();
        double width = scan.nextDouble();

        double area = length * width;
        System.out.println(area);
    }
}
