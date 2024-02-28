package com.parth.basics;

public class B3SwitchVariables {

    public static void main(String[] args) {

        String a =  "Value a";
        String b =  "Value b";
        String temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of A="+a);
        System.out.println("Value of B="+b);
    }
}
