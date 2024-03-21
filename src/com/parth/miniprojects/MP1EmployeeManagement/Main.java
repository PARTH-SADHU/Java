package com.parth.miniprojects.MP1EmployeeManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> employeeDetailsArray = new ArrayList<>();
        EmployeeDetails employeeDetails;
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to Employee-Management-System");
        System.out.println("EMS Menu:-");
        System.out.println("Press 1 : To Display the Employee details | Press 2 : To Add a New Employee");
        System.out.println("Press 3 : To Delete the Employees details | Press 4 : To Exit");
        System.out.print("Select any one options from the menu:-");
        int userMenuInput = Integer.parseInt(scan.next());


        while(true){

            if(userMenuInput == 1){
                System.out.println("Disply menu");
            } else if (userMenuInput == 2) {
                System.out.println("Add menu");

            } else if (userMenuInput == 3) {
                System.out.println("Delete menu");
            } else if (userMenuInput == 4) {
                System.out.println("Exitted from the Loop");
                break;
            }else {
                System.out.println("Enter a valid input from the above 4 menu options");
                userMenuInput = scan.nextInt();
            }

        }

    }
}
