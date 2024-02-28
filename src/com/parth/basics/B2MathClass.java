package com.parth.basics;

import java.util.Scanner;

public class B2MathClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the value of a:-");
        double a = scan.nextDouble();

        System.out.println("Enter the value of b:-");
        double b = scan.nextDouble();

//      max function from math class to find max value from the two:-
        double max = Math.max(a,b);
        System.out.println("Max value from the two is:- "+max);

//      min function from the math class to find minimum value from the two values entered.
        double min = Math.min(a,b);
        System.out.println("Min value from the two is:-"+min);

//      sqrt from math class to find the square root of the entered number:-

        System.out.println("Enter the value of c:-");
        double c = scan.nextDouble();
        double sqrt = Math.sqrt(c);
        System.out.println("Square Root of the given number is: "+sqrt);

    }
}
