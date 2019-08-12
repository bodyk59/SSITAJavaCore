package com.softserve.academy;

public class Employee implements Comparable<Employee> {
    protected String name;
    protected String employeeID;
    protected int averageMonthlySalary;

    public Employee(String name,                  //Constructor for Employee
                    String employeeID) {

        this.name = name;
        this.employeeID = employeeID;
    }

    public String getName() {                //Getter for Name
        return name;
    }

    public void setName(String name) {       //Setter for Name
        this.name = name;
    }

    public String getEmployeeID() {        //Getter for EmployeeID
        return employeeID;
    }

    public int getAverageMonthlySalary() {   //Getter for AverageMonthlySalary
        return averageMonthlySalary;
    }

    public int compareTo(Employee compareEmployee) {                      //Method for sorting elements
        int compareSalary = (compareEmployee).getAverageMonthlySalary();
        return compareSalary - this.getAverageMonthlySalary();
    }
}