package com.parth.basics.B23OOPs1;

public class Human {

    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age=age;
        this.weight= weight;
    }

    void eating(){
        System.out.println(this.name+"is eating food and is aged"+this.age+" healthy.");
    }

    void drinking(){
        if(this.age>18){
            System.out.println(this.name+"is eligible to drink wine as he/she is aged greater than 18.");
        }else {
            System.out.println(this.name+"is not eligible as her/his age is less than 18");
        }
    }
}
