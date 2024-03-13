package com.parth.assignments.intermediate;

import java.util.Scanner;

public class ElectricityBill {

//   Q - Calculate Electricity Bill
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tarrifRate = 6;
        System.out.println("Electricity Bill Calculator:-");
        System.out.println("Enter the Value of your Previous and Current reading in kWh (Kilo Watt Hour)");
        System.out.println("Tarrif Rate:- 6 Rs");

        System.out.println();

        System.out.println("Enter the Previous Reading of your meter");
        double previousReading = scan.nextDouble();
        System.out.println("Enter the Current Reading of your meter");
        double currentReading = scan.nextDouble();

        double electricityBill = (currentReading - previousReading) * tarrifRate;

        System.out.println(electricityBill);

        scan.close();
    }
}
