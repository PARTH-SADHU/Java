package com.parth.basics.B24OOpsVariableScope;

public class Main {
    public static void main(String[] args) {

//        local = declared inside a method visibile only to that method only.
//                Scope is only inside the method or class.

//        global = declared outside a method within class visible to all parts of a class.
//                 scope is outside the class or method.

        DiceRoller diceRoller = new DiceRoller();
        diceRoller.roll();



    }
}
