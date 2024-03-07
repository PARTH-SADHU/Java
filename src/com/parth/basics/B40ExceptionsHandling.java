package com.parth.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class B40ExceptionsHandling {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        Handling exceptions in the Calculator Program:
        try{
            double number1;
            double number2;

            System.out.println("Calculator");
            System.out.println();
            System.out.println("Select the operator you want to select from-");
            System.out.println("(1-'+' for Addition)," +
                    "(2-'-' for Subtraction)," +
                    "(3-'/' for Division)," +
                    "(4-'*' for Multiplication)," +
                    "(5-'%' for Modulo)-");

            int operator = scan.nextInt();

            System.out.print("Enter the value of Number-1 :");
            number1 = scan.nextDouble();
            System.out.print("Enter the value of Number-2 :");
            number2 = scan.nextDouble();
            double answer = 0;
            if(operator == 1){
                answer = number1 + number2;
            } else if (operator == 2) {
                answer = number1 - number2;
            } else if (operator == 3) {
                answer = number1 / number2;
            } else if (operator == 4) {
                answer = number1 * number2;
            } else if (operator == 5) {
                answer = number1 % number2;
            }else {
                System.out.println("Invalid input");
            }
            System.out.println("Answer:"+answer);


        }catch (InputMismatchException e){
            System.out.println("InputMismatchException from the class:-"+e);
        }
        catch (Exception e){
            System.out.println("Something's wrong "+e);

        }
        finally {
            scan.close();
        }
    }
}
