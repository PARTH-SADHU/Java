package com.parth.assignments.intermediate;

import java.util.Scanner;

public class DepreciationValue {

    public static void main(String[] args) {
//        Depreciation Value :- It can be calculated with this formula i.e. it cost at time minus  the salvage value divided by its lifecycle.
//        Depreciation value = (Cost at time - salvage value) / useful life

        try{

            Scanner scan = new Scanner(System.in);
            double cost;
            double salvageValue;
            double usefulLifeCycle;
            double depreciationValue =0 ;

            System.out.println("Depreciation Value: ");

            System.out.print("Enter the cost of the product to calculate its depreciation value: ");
            cost = scan.nextDouble();

            System.out.println("Enter the Salvage value of the product");
            salvageValue = scan.nextDouble();

            System.out.println("Useful Life Cycle ");
            usefulLifeCycle = scan.nextDouble();

            if(usefulLifeCycle >= 0) {
                depreciationValue = (cost - salvageValue) / usefulLifeCycle;

            }
            else {
                System.out.println("The Useful life cycle of your product is over");
            }
            System.out.println("Depreciation value: "+depreciationValue);


        }catch (Exception e){
            System.out.println("Exception"+e);
        }

    }
}
