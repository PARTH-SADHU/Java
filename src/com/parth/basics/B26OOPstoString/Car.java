package com.parth.basics.B26OOPstoString;

public class Car {
    String make = "Ford";
    String model = "Shelby GT650";
    String color = "black";
    int year = 2022;

    public String toString(){
        String myString = make+"\n"+model+"\n"+color+"\n"+year;
        return myString;
    }
}
