package com.parth.basics.B28OOpsObjectPassing;

public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage("Home Parking");

        Car car = new Car("HellCat Demon");

        garage.park(car);
    }
}
