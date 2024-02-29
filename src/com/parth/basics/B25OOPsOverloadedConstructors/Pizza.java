package com.parth.basics.B25OOPsOverloadedConstructors;

public class Pizza {

    String type;
    String sauce;
    String drink;
    String toppings;

    Pizza(String type, String sauce,String toppings){
        this.type = type;
        this.sauce = sauce;
        this.toppings = toppings;
    }
    Pizza(String type, String sauce, String drink,String toppings){
        this.type = type;
        this.sauce = sauce;
        this.drink = drink;
        this.toppings = toppings;
    }

}
