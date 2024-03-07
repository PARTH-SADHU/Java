package com.parth.basics;

import java.io.File;

public class B41FileClassPaths {
    public static void main(String[] args) {

//        Java File class is a class in java that allows us to do several functions
//        on the paths provided and also we can perform several operations on that.

        File file = new File("D:\\intellij_projects\\Java-DSA\\src\\com\\parth\\basics\\B41FileClass\\file.txt");
        if(file.exists()){
            System.out.println("File exists :0");
            System.out.println(file.getPath());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.isFile());
            file.delete();

        }else {
            System.out.println("File doesn't exists :(");
        }
    }
}
