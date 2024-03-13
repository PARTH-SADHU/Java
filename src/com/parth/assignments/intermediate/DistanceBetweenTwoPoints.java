package com.parth.assignments.intermediate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

//    Calculate Distance Between Two Points

//    Formula For finding distance between two points  d=√((x2 – x1)² + (y2 – y1)²).
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double distance;

        System.out.println("Enter the X and Y coordinates for two points to find the distance between them");

        System.out.println("Enter the x,y coordinates of point-1");
        System.out.print("x1 : ");
        double x1 = scan.nextDouble();
        System.out.print("y1 : ");
        double y1 = scan.nextDouble();

        System.out.println("Enter the x,y coordinates of point-2");
        System.out.print("x2 : ");
        double x2 = scan.nextDouble();
        System.out.print("y2 : ");
        double y2 = scan.nextDouble();

//        d=√((x2 – x1)² + (y2 – y1)²)

        double d = ((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)) ;
        distance = Math.sqrt(d);
        System.out.print("The distance between two points is :");

        DecimalFormat df = new DecimalFormat("#.###");
        System.out.print(df.format(distance));


        scan.close();
    }
}
