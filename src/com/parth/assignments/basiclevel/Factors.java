package com.parth.assignments.basiclevel;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number whose factors you want-");
        int userInput = scan.nextInt();
        int factors = 0;

        if(userInput>0){

            for(int i=1; i<userInput;i++){
                if(userInput % i ==0){
                    System.out.print(i+",");
                }
            }

        }
        else {
            System.out.println("Enter a value greater than 0 or the Invalid Input entered");
        }
        scan.close();
    }
}
