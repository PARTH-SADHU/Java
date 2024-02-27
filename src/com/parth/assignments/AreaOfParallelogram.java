package com.parth.assignments;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {

//        Area of Parallelogram is Area = (Base * height)
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the values of height and base:");

        double height = scan.nextDouble();
        double base = scan.nextDouble();

        if (height>0 && base >0){
            double area = base * height;
            System.out.println("Area = "+area);
        }
        else {
            System.out.println("Invalid output");
        }



    }
}
