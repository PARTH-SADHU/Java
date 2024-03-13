package com.parth.assignments.intermediate;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

//        Compound Interest Java Program

//        P (1 + R/n)^(nt) - P
//        Here,
    //        P is principal amount.
    //        R is the annual interest rate.
    //        t is the time the money is invested or borrowed for.
//            n is the number of times that interest is compounded per unit t,
//        for example if interest is compounded monthly and t is in years then
//        the value of n would be 12. If interest is compounded quarterly and t
//        is in years then the value of n would be 4.

        try{

            System.out.println("Compound Interest Calculator:");
            Scanner scan = new Scanner(System.in);
            double  principalAmount;
            double annualInterestRate;
            double time;
            double numberOfTimesInterestCompounded;

            System.out.println("Enter the Following Data to calculate the compound interest");
            System.out.print("Principal Amount : P =");
            principalAmount = scan.nextDouble();

            System.out.print("Annual Interest Rate : R =");
            annualInterestRate = scan.nextDouble()/100;

            System.out.print("Time : t =");
            time = scan.nextDouble();

            System.out.print("Number of times that interest is compounded per unit t : n =");
            numberOfTimesInterestCompounded = scan.nextDouble();

            if(numberOfTimesInterestCompounded != 0){
//                P (1 + R/n)^(nt) - P
                double compoundInterest = principalAmount *
                                                            (Math.pow
                                                                    ((1 +
                                                                            (annualInterestRate / numberOfTimesInterestCompounded))
                                                                            ,(numberOfTimesInterestCompounded * time)));
                double interestRate = compoundInterest - principalAmount;
                System.out.println(interestRate);
                System.out.println(compoundInterest);

            }else {
                System.out.println("Invalid input for n as it cannot be zero");
            }


            scan.close();
        }catch (Exception e){
            System.out.println("Some exception occured: "+e );
        }
    }

}
