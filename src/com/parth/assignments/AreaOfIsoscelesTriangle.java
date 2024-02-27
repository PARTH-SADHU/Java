package com.parth.assignments;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {

//        Area of Isosceles triangle is:- Area  = (0.5 * height * base)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of Height greater than 0:");
        double height = scan.nextDouble();
        System.out.println("Enter the value of Base greater than 0:");
        double base = scan.nextDouble();

        if(height > 0 && base > 0){

            double areaOfIsoTriangle = (0.5 * height * base);
            System.out.println(areaOfIsoTriangle);

        }
        else if (height <0 || base<0){
            System.out.println("You entered value of either height of base less than 0 ");
        }
        else {
            System.out.println("Invalid Output");
        }
    }
}
