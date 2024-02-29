package com.parth.basics;

import java.util.ArrayList;

public class B16ArrayLists2D {
    public static void main(String[] args) {

//    2D ArraysList = a dynamic list of lists:
//    We can change the size of these lists during runtime.

//        Initializing arraylists of lists.
        ArrayList<ArrayList<String>> grocery = new ArrayList<ArrayList<String>>();

        ArrayList<String> bakery = new ArrayList<String>();
        bakery.add("Cakes");
        bakery.add("Muffins");
        bakery.add("Garlic Breads");

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mangoes");
        fruits.add("Chickus");

        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Orange Juices");
        drinks.add("Gatorade");
        drinks.add("Monster");

        grocery.add(drinks);
        grocery.add(bakery);
        grocery.add(fruits);

        for(int i =0; i<grocery.size();i++){
            System.out.println(grocery.get(i));
        }


    }
}
