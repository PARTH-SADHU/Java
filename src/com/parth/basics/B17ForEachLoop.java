package com.parth.basics;

import java.util.ArrayList;

public class B17ForEachLoop {
    public static void main(String[] args) {

//        for-each - traversing technique to iterate through the elements in an array/colletion.
//        less steps more readable.
//        less flexible.


//        For simple arrays:-
        String[] animals = {"Cat","Dog","Lions","Tigers","Hippos"};

        for (String i: animals) {
            System.out.println(i);
        }

//        For arrayLists:-

        ArrayList<String> animalsLists = new ArrayList<String>();

        animalsLists.add("cats");
        animalsLists.add("Dogs");
        animalsLists.add("Tigers");
        animalsLists.add("Lions");
        animalsLists.add("Donkeys");

//        System.out.println(animalsLists);

        for (String i:animalsLists) {
            System.out.println(i);

        }

    }

}
