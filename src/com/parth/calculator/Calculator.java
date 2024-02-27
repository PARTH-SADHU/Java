package com.parth.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int answer = 0;
        System.out.println("Calculator Program");



        while(true){
            System.out.println("Enter an operator");
            char operator = scan.next().trim().charAt(0);

            if( operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){

                System.out.println("Enter First Number:-");
                int num1 = scan.nextInt();
                System.out.println("Enter Second Number:-");
                int num2 = scan.nextInt();

                if(operator == '+'){
                    answer = num1 + num2;
                    System.out.println("Answer after adding two numbers:- "+answer);
                }
                if(operator == '-'){
                    answer = num1 - num2;
                    System.out.println("Answer after subtracting two numbers:- "+answer);
                }
                if(operator == '*'){
                    answer = num1 * num2;
                    System.out.println("Answer after multiplying two numbers:- "+answer);
                }
                if(operator == '/'){
                    if(num2 !=0){
                        answer = num1 / num2;
                        System.out.println("Answer after dividing two numbers:- "+answer);
                    }
                }
                if(operator == '%'){
                    answer = num1 % num2;
                    System.out.println("Answer after modulating two numbers:- "+answer);
                }

            }else if(operator == 'x' || operator== 'X'){
                System.out.println("Thank you for using the calculator program");
                break;
            }
            else {
                System.out.println("Entered unknown operator or invalid operator....");
            }
        }
    }
}
