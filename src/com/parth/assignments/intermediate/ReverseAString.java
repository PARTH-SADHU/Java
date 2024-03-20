package com.parth.assignments.intermediate;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {

        try{

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the string: ");
            String userString = scan.next();

            scan.close();
        }catch (Exception e ){
            System.out.println("Some Exception encountered -"+e);
        }
    }
}
