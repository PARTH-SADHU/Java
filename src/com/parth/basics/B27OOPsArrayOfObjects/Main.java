package com.parth.basics.B27OOPsArrayOfObjects;

public class Main {
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Rice");
        Food food3 = new Food("Paneer");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);
        for(int i =0; i< refrigerator.length;i++){
            System.out.println(refrigerator[i]);
            System.out.println(refrigerator[i].name);
        }
    }
}
