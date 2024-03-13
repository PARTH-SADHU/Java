package com.parth.assignments.intermediate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CGPACaculator {
    public static void main(String[] args) {
//        CGPA ( Cumulative Grade Point Average ) is the systematic arrangement in the
//          educational stream to get average of grade points. And the CGPA percentage
//          is 9.5 times the CGPA.
//          CGPA = (Grades in all Subjects) / (Total Number of Subjects).
//          So, CGPA= 9.5 × CGPA

        try{
            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.##");
            double cgpa;
            double totalMarks = 0;
            double average;

            System.out.println("Welcome to the CGPA calculator: ");
            System.out.print("Enter the No of Subjects you have:");
            int noOfSubjects = scan.nextInt();


            for(int i=1; i<=noOfSubjects; i++){
                System.out.println("Enter the marks of Subject:"+i);
                double subjectMarks = scan.nextDouble();
                totalMarks = totalMarks + subjectMarks;
            }
            System.out.println("total marks: "+totalMarks);
            average = totalMarks / noOfSubjects;
            cgpa = average;

            System.out.println("Average: "+average);

            scan.close();
        }
        catch (Exception e){
            System.out.println("Encountered an Exception: "+e);
        }
    }
}
