package com.parth.basics.B36CopyingObjects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Dodge","Hellcat",1999);

//        Method-1 for copying object constructor overloading.
//        Another way of doing this is on the time of constructor calling or instance creation.

        Car car2 = new Car(car1);

//        Method-2 Second method for copying objects.
//        Car car2 = new Car("Ford","Shelby Cobra",1995);
//        car2.copyObject(car1);


        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.getMaker());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        System.out.println(car2.getMaker());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());


    }
}
