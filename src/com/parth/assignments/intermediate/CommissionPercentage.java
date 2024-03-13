package com.parth.assignments.intermediate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {

//      Q- Calculate Commission Percentage:

        Scanner scan = new Scanner(System.in);
        double commission;
        double commissionRate;
        double sales;
        DecimalFormat df = new DecimalFormat("#.##");



        System.out.println("Enter the Total Sales of your company: ");
        sales = scan.nextDouble();

        System.out.println("Enter the Commission Rate you'll get int %: ");
        commissionRate = scan.nextDouble();


        commission = sales * (commissionRate / 100);

        System.out.println(commission);



    }
}
