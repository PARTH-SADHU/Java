package com.parth.basics.B36CopyingObjects;

public class Car {

    private String maker;
    private String model;
    private int year;

    Car(String maker, String model, int year){

        this.setMaker(maker);
        this.setModel(model);
        this.setYear(year);

    }


//      Another way of doing this is constructor overloading by creating the same  copy method and giving values of one instance to another.

    Car(Car x){
        this.copyObject(x);
    }

    public String getMaker(){
        return maker;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }


    public void setMaker(String maker){
        this.maker = maker;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

//    Copy method that takes car object as an argument and copes all the attribute values of one object to another with different addresses.

    public void copyObject(Car x){
        this.setMaker(x.getMaker());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }}





