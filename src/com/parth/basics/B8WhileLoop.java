package com.parth.basics;

import java.util.Scanner;

public class B8WhileLoop {
    public static void main(String[] args) {

//        while loop = executes the block of code till the condition remains true

        Scanner scan = new Scanner(System.in);
        String name = "" ;

        while(name.isBlank()){
            System.out.print("Please enter your name:-");
            name = scan.nextLine();
        }
        System.out.println("Hello "+name);
    }
}
