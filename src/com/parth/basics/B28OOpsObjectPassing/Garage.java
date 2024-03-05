package com.parth.basics.B28OOpsObjectPassing;

public class Garage {
    String parkingName;
    Garage(String parkingName){
        this.parkingName = parkingName;
    }
    void park(Car car){
        System.out.println(car.carName+"-is parked in your parking:-"+parkingName);
    }
}
