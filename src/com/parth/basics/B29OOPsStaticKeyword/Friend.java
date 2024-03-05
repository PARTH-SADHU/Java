package com.parth.basics.B29OOPsStaticKeyword;

public class Friend {
    String name;
    static int noOfFriends;

    Friend(String name){

        this.name=name;
        noOfFriends++;
    }

    static void NoOfFriends(){
        System.out.println("You have "+noOfFriends+" Friends");
    }
}
