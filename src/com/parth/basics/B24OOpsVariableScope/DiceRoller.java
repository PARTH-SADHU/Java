package com.parth.basics.B24OOpsVariableScope;

import java.util.Random;

public class DiceRoller {

    int number;
    Random random;
    DiceRoller(){
        random = new Random();
    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
