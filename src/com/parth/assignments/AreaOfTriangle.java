package com.parth.assignments;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();
        int base = scan.nextInt();

        double area = 0.5 * height * base;
        System.out.println(area);
    }
}
