package com.parth;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        /*Syntax for loop:
          for(initialization, conditions, increment/decrement){
               -body
        }
         */

        for(int i=0; i<=10; i++){
            System.out.println(i);
        }

        /*
            While loop:
            syntax:
            while(condition){
                body
            }
        */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a<=10){
            System.out.println("Your entered number is:"+a);
            a++;
        }
    }
}
