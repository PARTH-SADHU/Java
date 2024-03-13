package com.parth.assignments.intermediate;

import java.util.Scanner;

public class AverageOfNNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfElements;
        int sum = 0;
        double average;

        System.out.println("Enter the Number of elements you want:-");
        numberOfElements = scan.nextInt();

        for(int i =1; i <= numberOfElements; i++){
            sum = sum + i;
        }
        average = sum / numberOfElements ;
        System.out.println("Average of N numbers = "+average);

        scan.close();
    }
}
