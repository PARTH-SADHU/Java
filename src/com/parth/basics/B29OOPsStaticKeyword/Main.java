package com.parth.basics.B29OOPsStaticKeyword;


import java.util.ArrayList;

//Static Keyword :- It is the variable or method that is same for every instance of the class,
//                  A single copy of variable /method that can be shared or created.
public class Main {

    public static void main(String[] args) {

        Friend[] listOfFriends = new Friend[4];

        Friend friend1 =  new Friend("Meet");
        Friend friend2 =  new Friend("Harit");
        Friend friend3 =  new Friend("Prashant");
        Friend friend4 =  new Friend("Jay");

        listOfFriends[0]= friend1;
        listOfFriends[1]= friend2;
        listOfFriends[2]= friend3;
        listOfFriends[3]= friend4;

        for(int i=0;i<listOfFriends.length;i++){
            System.out.println(listOfFriends[i].name);
        }
        Friend.NoOfFriends();
//        System.out.println("Total Friends you have:"+Friend.noOfFriends);


//        So as we can see in this example it doesnt matter how many times the constructor is called 4
//        the value of the static variable remains the same for every instance created.
    }

    

}
