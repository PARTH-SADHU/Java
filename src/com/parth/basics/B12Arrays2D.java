package com.parth.basics;

public class B12Arrays2D {
    public static void main(String[] args) {
//        One way to define elements and 2Darray.
//        String [][] cars = new String[3][3];

//        cars[0][0] = "";
//        cars[0][1] = "";
//        cars[0][2] = "";
//        cars[1][0] = "";
//        cars[1][1] = "";
//        cars[1][2] = "";
//        cars[2][0] = "";
//        cars[2][1] = "";
//        cars[2][2] = "";

//        Another way:-
        String [][] cars = {
                {"Dodge","Tata","Mahindra"},
                {"VW","BMW","Toyota"},
                {"Porsche","Mithubishi","Honda"}
        };

        for (int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }
        }

    }
}
