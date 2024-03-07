package com.parth.basics.B35Encapsulations;

public class Main {
    public static void main(String[] args) {

//        Encapsulation :- Attribute of a class will be hidden or private
//                         Can be accessed only through methods(getters to get the private value)
//                                                             (setters to set or to change the private value).
//        The only condition is to make the attributes private

        Car car = new Car("Dodge","Challenger Hellcat",2019);

//        Now if we want to access any of the attributes we cannot do that directly,
//        we have to set methods for getting and setting the values i.e. we can get and modify
//        the values of those methods using gettters and setters.

        System.out.println("This is car makers name: "+car.getMaker());
        System.out.println("This is cars model name: "+car.getModel());
        System.out.println("This is car manufacturers year: "+car.getYear());

        car.setModel("charger");
        System.out.println(car.getModel());
    }
}
