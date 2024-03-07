package com.parth.basics.B38Polymorphism;

public class Main {
    public static void main(String[] args) {
//        Polymorphism:- it means "many forms" , The ability of an object to identify
//                       as more than one type.
//                       We can say that polymorphism has occured when there is inheritance
//                       between classes
//                       For example, think of a superclass called Animal that has a method called animalSound().
//                       Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have
//                       their own implementation of an animal sound (the pig oinks, and the cat
//                       meows, etc.):

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat };
//        for(int i =0; i<racers.length; i++){
//            System.out.println(racers[i]);
//        }

        for(Vehicle i : racers){
            i.go();
        }
    }
}
