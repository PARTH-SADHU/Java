package com.parth;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        /*Question: Find the largest of three Numbers-*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of First Number a ");
        int a = sc.nextInt();

        System.out.println("Enter the value of Second Number b ");
        int b = sc.nextInt();

        System.out.println("Enter the value of Third Number c ");
        int c = sc.nextInt();


        //Solution-1


//        if(a>b && a>c){
//            System.out.println("The greatest of all the three is: a-"+a);
//        } else if (b>c &&b>a) {
//            System.out.println("The greatest of all the three is: b-"+b);
//        }
//        else{
//            System.out.println("The greatest of all the three is: c-"+c);
//        }


//        Solution-2
        int max = a;
        if(b>max){
//            System.out.println("B is the largest b:- "+b);
            max = b;
        }else if (c > max) {
//            System.out.println("C is the largest c:- "+c);
            max = c;
        }
        System.out.println("The largest entered variable is :-"+max);


        //Solution-3:

        int maxOfThree = Math.max(c,Math.max(a,b));
        System.out.println(maxOfThree);


    }
}
