package com.parth.basics.B42FileWriter;

import java.io.FileWriter;

public class B42FileWriter {
    public static void main(String[] args) {

        try{
            FileWriter fileWriter = new FileWriter("poem.txt");
            fileWriter.write("Roses are red, whites are lily \n Sunflower are yellow \n So are the mogras");
            fileWriter.append("(A poem by Author)");
            fileWriter.close();
        }catch (Exception e){
            System.out.println("There's something wrong with this :( "+e);
        }
    }
}
