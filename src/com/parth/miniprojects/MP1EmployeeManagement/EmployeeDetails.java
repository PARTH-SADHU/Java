package com.parth.miniprojects.MP1EmployeeManagement;

public class EmployeeDetails {

    private String fullName;
    private String jobTitle;
    private String phoneNumber;
    private String salary;

    EmployeeDetails(String fullName, String jobTitle, String phoneNumber, String salary){
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getFullName(){
        return fullName;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getSalary(){
        return salary;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setSalary(String salary){
        this.salary = salary;
    }
}
