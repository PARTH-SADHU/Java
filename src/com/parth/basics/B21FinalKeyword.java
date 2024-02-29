package com.parth.basics;

public class B21FinalKeyword {
    public static void main(String[] args) {

        double pi = 3.14;

        pi = 5;
        System.out.println(pi);
//        As we can see here the value of pi is unique so for such unique value or the values
//        which dont need any changes we use final for those values.

        final double pie = 3.14;

//        Now if i try to change the value of pie i wont le me as we set the value of pie as final which means the value is unique
//        pie = 20;
    }
}
