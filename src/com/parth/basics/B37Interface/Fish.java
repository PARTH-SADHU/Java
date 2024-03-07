package com.parth.basics.B37Interface;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("Fish is hunting the other smaller fishes");
    }

    @Override
    public void flee() {
        System.out.println("Fishes generally flee from another big fishes");

    }
}
