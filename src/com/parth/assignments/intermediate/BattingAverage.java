package com.parth.assignments.intermediate;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {

//        Calculate Batting Average and Bowling Average

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        double battingAverage=0;
        double bowlingAverage=0;
        double runsScored;
        double totalNoOfTimesOut;
        double runsConceded;
        double totalNoOfWicketsTaken;

        System.out.println("Welcome to batting and balling Average calculator");

        System.out.println("Enter 1-Batting Average | Enter 2-Balling Average | Enter 0-Exit from the App");
        int userInput = scan.nextInt();
        while(true){
            if(userInput == 1){
                System.out.println("Batting Average Calculator");
                System.out.println("Enter the values of the Following:");
                System.out.print("Runs Scored:");
                runsScored = scan.nextDouble();

                System.out.print("Enter the No of times the Batsmen got out:");
                totalNoOfTimesOut = scan.nextDouble();

                if(totalNoOfTimesOut == 0){
                    System.out.println("0 cannot be considered as the answer will be infinite so enter a valid answer other than o of Total Times Out");
                }
                else {
                    battingAverage = runsScored / totalNoOfTimesOut;
                    System.out.println("Batting Average as per your inputs is: "+df.format(battingAverage));
                    System.out.println();
                }
                System.out.println("Enter 1-Batting Average | Enter 2-Bowling Average | Enter 0-Exit from the App");
                System.out.println();
                userInput = scan.nextInt();

            } else if (userInput == 2) {
                {
                    System.out.println("Balling Average Calculator");
                    System.out.println("Enter the values of the Following:");
                    System.out.print("Runs Conceded:");
                     runsConceded = scan.nextDouble();

                    System.out.print("Enter the No of wickets taken by the bowler:");
                    totalNoOfWicketsTaken = scan.nextDouble();

                    if(totalNoOfWicketsTaken == 0){
                        System.out.println("0 cannot be considered as the answer will be infinite so enter a valid answer other than o of Total Wickets taken");
                    }
                    else {
                        bowlingAverage = runsConceded / totalNoOfWicketsTaken;
                        System.out.println("Batting Average as per your inputs is: "+df.format(bowlingAverage));
                        System.out.println();
                    }
                    System.out.println("Enter 1-Batting Average | Enter 2-Bowling Average | Enter 0-Exit from the App");
                    System.out.println();
                    userInput = scan.nextInt();

                }



            } else if (userInput == 0) {
                System.out.println("Thank you");
                break;
            }else {
                System.out.println("Ahhh Invalid Input detected!!!,Please enter a valid input");
            }


        }


    }
}
