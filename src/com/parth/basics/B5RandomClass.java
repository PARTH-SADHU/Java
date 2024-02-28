package com.parth.basics;

import java.util.Random;

public class B5RandomClass {
    public static void main(String[] args) {

        Random random = new Random();
//        Random class generates pseudo random values

//        values for random integers will be from just negative 2 billion and just over positive 2 billion
        int x = random.nextInt(6)+1;
        System.out.println(x);

//        Random double will generates values between 0 and 1.
        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);


    }
}
