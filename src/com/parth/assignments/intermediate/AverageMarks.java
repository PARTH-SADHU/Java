package com.parth.assignments.intermediate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {

//        Calculate Average Marks
        try{

            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("Average Calculator");
            System.out.print("Enter the total number of subject that you have : ");
            int size = scan.nextInt();
            double[] marks = new double[size];
            double averageMarks = 0;

            for(int i=0; i <size; i++){
                System.out.println("Enter your marks for subject:"+(i+1));
                marks[i] = scan.nextDouble();
                averageMarks = averageMarks + marks[i];
            }
            averageMarks = averageMarks / size;
            System.out.println(averageMarks);



            scan.close();
        }catch (Exception e){
            System.out.println("Some exception encountered : "+e);
        }
    }
}
