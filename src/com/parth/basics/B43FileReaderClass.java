package com.parth.basics;

import java.io.FileReader;

public class B43FileReaderClass {
    public static void main(String[] args){

//        FileReader -  Reads the contents of the file as a stream of characters.One by one
//                      read() returns an int value which contains the byte value.
//                      When read() returns -1, there is no more data to be read.

       try{
           FileReader fileReader = new FileReader("poem.txt");
           int data = fileReader.read();

           while(data != -1){
               System.out.print((char)data);
               data = fileReader.read();
           }
           fileReader.close();

       }catch(Exception e){
           System.out.println("There's something wrong with this "+e);
       }

    }
}
