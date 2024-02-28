package com.parth.basics;

import java.util.Scanner;

public class B10NestedLoops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int noOfRows;
        int noOfColumns;
        String symbol = "";

        System.out.println("Enter the number of Rows");
        noOfRows = scan.nextInt();
        System.out.println("Enter the number of Columns");
        noOfColumns = scan.nextInt();
        System.out.println("Enter the Symbol you want to print");
        symbol = scan.next();

        for(int i=1; i<=noOfRows; i++){
            System.out.println();
            for(int j=1; j<=noOfColumns; j++){
                System.out.print(symbol);
            }
        }
        scan.close();
    }
}
