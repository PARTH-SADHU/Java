package com.parth.basics;

public class B14WrapperClass {
    public static void main(String[] args) {

//        Wrapper class :- They are the classes that provides a way to use primitive datatypes as an object,
//        it provides a way to use primitive data types as reference datatypes, as reference datatypes contains
//        useful methods which can be used with the collections.
        /*
            * Primitive Data Type	Wrapper Class
                    byte	            Byte
                    short	            Short
                    int	                Integer
                    long	            Long
                    float	            Float
                    double	            Double
                    boolean         	Boolean
                    char	            Character
        * */

//        Autoboxing :- Automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper class.
//        Unboxing :- Reverse of autoboxing . Automatic conversion of wrapper class to primitive.

//        This is autoboxing giving primitive values directly to the wrapper class or reference datatypes
        Boolean a= true;
        Character b='A';
        Integer c = 3243;


//      using unboxing i.e. treating the reference data-types of the wrapper class as a primitive data types.

        if(a==true){
            System.out.println("This is true");
        }
    }
}
