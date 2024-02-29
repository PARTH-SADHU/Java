package com.parth.basics.B25OOPsOverloadedConstructors;

public class Main {
    public static void main(String[] args) {

//        OverLoaded constuctors:- multiple constructors within a class with the same name,
//                                 but have different parameters.
//        Name + Parameters = Signature

//        object with all its properties from the constructor
        Pizza myPizza = new Pizza("Thin Crust","Tomato","Thumbsup","Cheeze");

        System.out.println(myPizza.type);
        System.out.println(myPizza.sauce);
        System.out.println(myPizza.drink);
        System.out.println(myPizza.toppings);

//        Now what if we dont want drinks atttribute so for this we can create overloaded
//        constructors which enables us to ignore some of the properties

        Pizza myPizzaWithoutDrink = new Pizza("Margareta","Chilly","Cheddar cheese");
        System.out.println();

        System.out.println("Pizza Without drink");
        System.out.println(myPizzaWithoutDrink.type);
        System.out.println(myPizzaWithoutDrink.sauce);
        System.out.println(myPizzaWithoutDrink.toppings);
        System.out.println(myPizzaWithoutDrink.drink);
    }
}
