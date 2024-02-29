package com.parth.basics;

public class B19MethodOverloading {
    public static void main(String[] args) {

//        Method Overloading:- Methods that are having same method name but have multiple parameters.
//        Method Name + Parameters = Method Signature.

        int Addition = add(2,4);
        int Addition1 = add(2,4,6);
        System.out.println(Addition);
        System.out.println(Addition1);
    }
    static int add(int a , int b){
        int c = a + b;
        return c;
    }
    static int add(int a, int b,  int c){
        int d = a + b + c;
        return d;
    }
}
