package com.parth.assignments.intermediate;

import java.util.Scanner;

public class DiscountOfProduct {

//    Calculate Discount Of Product
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double finalAmount = 0;
        double discountedAmount = 0;
        int discount;
        double totalBillingAmount;

        System.out.println("Welcome to Discount Calculator");
        System.out.println("Enter the Total Amount of your Bill, and the discount you are getting");

        System.out.print("Total Billing Amount:");
        totalBillingAmount = scan.nextDouble();

        System.out.print("Enter the discount you're getting");
        discount = scan.nextInt();

        if(totalBillingAmount > 0){
            discountedAmount = (totalBillingAmount * discount) / 100;
            finalAmount = totalBillingAmount - discountedAmount ;

        } else if (discount == 0) {
            finalAmount = finalAmount + totalBillingAmount;
            System.out.println("You got no discount so your Final-Amount will be same as Billing-Amount");
        }else {
            System.out.println("Please enter a valid input or you entered BillingAmount - 0");
        }
        System.out.println("Amount before Discount ="+totalBillingAmount);
        System.out.println("Your Final Amount after applying the Discount is :"+finalAmount);


        scan.close();

    }
}
