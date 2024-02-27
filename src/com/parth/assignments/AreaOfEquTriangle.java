package com.parth.assignments;

import java.util.Scanner;

public class AreaOfEquTriangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double sqRootOfThree = Math.sqrt(3);
        System.out.println("Enter the value of a side of equilateral triangle:");
        int sideOfTriangle = scan.nextInt();


            if (sideOfTriangle > 0) {
                double AreaOfEquTriangle = (sqRootOfThree * (sideOfTriangle * sideOfTriangle)) / 4;
                System.out.println(AreaOfEquTriangle);
            }else {
                System.out.println("Enter a side greater than 0, or you entered amn invalid output");
            }




    }
}
