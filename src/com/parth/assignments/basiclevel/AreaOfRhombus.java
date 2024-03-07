package com.parth.assignments.basiclevel;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of diagonal-1 and diagonal-2");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        if(d1>0 && d2>0){
            double area = 0.5 * d1 * d2;
            System.out.println(area);
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
