package com.parth.basics;

public class B20Printf {
    public static void main(String[] args) {
//        Printf - an optional method to control, format and display text to the console window
//                 two arguments = format strings +(object/variable/value)
//                 %[flags][precision][width][conversion-character]

//        [Conversion- character]
        int myInt = 104;
        System.out.printf("%d is my lucky number \n",myInt);

        boolean myBoolean = true;
        System.out.printf("%b this is the value of myboolean\n",myBoolean);

        char myChar = '@';
        System.out.printf("%c this is the value of mycharacter\n",myChar);

        String myStr = "Parth";
        System.out.printf("%s this is the value of mystring",myStr);

        double myDouble = 100.0;
        System.out.printf("%f is the value of mydouble value\n",myDouble);

//        [Width]
//        Minimum number of character to be written as output.
        System.out.printf("Hello boss %15s\n",myStr);
        System.out.printf("Hello boss %-5s",myStr);

//        [precision]
//        sets the number of digits of precision when outfitting floating-point values.

        System.out.printf("You have this much money: %.2f",myDouble);
    }
}
