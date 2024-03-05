package com.parth.basics.B31MethodOverriding;

public class Main {
    public static void main(String[] args) {

//        Method Overriding :- Declaring the method in the sub class, which is
//                             already present in parent class done so that a child
//                             class can give its own implementation.
        Animal animal = new Animal();
        Dog dog = new Dog();

/*
* Both the methods have same name but the method created in the dog class will be more
* specific to dog class.
*  */
        animal.speak();
        dog.speak();
    }
}
