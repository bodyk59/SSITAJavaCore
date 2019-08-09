package com.softserve.academy;

import java.util.Objects;
import java.util.Scanner;

class Employee {                                              //New class Employee
    private String name;
    private String department;
    private int salary;

    public Employee() {                                       //Default constructor
        super();
    }


    public Employee(String name, String department, int salary) {      //Constructor with 3 parameters
        super();
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {                               //Getter for Name
        return this.name;
    }

    public void setName(String name) {                       //Setter for name
        this.name = name;
    }

    public String getDepartment() {                                   //Getter for Rate
        return this.department;
    }

    public void setDepartment(String department) {                          //Setter for Rate
        this.department = department;
    }

    public int getSalary() {                                  //Getter for Hours
        return this.salary;
    }

    public void setSalary(int salary) {                        //Setter for Hours
        this.salary = salary;
    }

    public static void line() {                               //This method printing a long line
        for (int line = 1; line <= 80; ++line) {
            System.out.print("\u2500");
        }
    }

    @Override
    public String toString() {                               //toString method
        return "Employee [" +
                "name= '" + name + '\'' +
                ", department= " + department +
                ", salary= " + salary +
                ']';
    }
    @Override
    public boolean equals(Object obj) {             //Overriding new definition for method equals
        if (obj == null) return false;
        if (this == obj || getClass() != obj.getClass()) return true;

        Employee employee = (Employee) obj;
        return Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department) &&
                salary == employee.salary;
    }

    private static int ASC(Employee[] employees, int begin, int end) {             //Quick sort algorithm for ASC
        Employee pivot = employees[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (employees[j].getSalary() <= pivot.getSalary()) {
                i++;

                Employee swapTemp = employees[i];
                employees[i] = employees[j];
                employees[j] = swapTemp;
            }
        }

        Employee swapTemp = employees[i+1];
        employees[i+1] = employees[end];
        employees[end] = swapTemp;

        return i+1;
    }

    private static int DESC(Employee[] employees, int begin, int end) {            //Quick sort algorithm for DESC
        Employee pivot = employees[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (employees[j].getSalary() >= pivot.getSalary()) {
                i++;

                Employee swapTemp = employees[i];
                employees[i] = employees[j];
                employees[j] = swapTemp;
            }
        }

        Employee swapTemp = employees[i+1];
        employees[i+1] = employees[end];
        employees[end] = swapTemp;

        return i+1;
    }

    public static void quickSortASC(Employee[] employees, int begin, int end) {       //ASC method
        if (begin < end) {
            int partitionIndex = ASC(employees, begin, end);

            quickSortASC(employees, begin, partitionIndex-1);
            quickSortASC(employees, partitionIndex+1, end);
        }
    }

    public static void quickSortDESC(Employee[] employees, int begin, int end) {      //DESC method
        if (begin < end) {
            int partitionIndex = DESC(employees, begin, end);
            quickSortDESC(employees, begin, partitionIndex-1);
            quickSortDESC(employees, partitionIndex+1, end);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIn this app you can store information about employee and do some operations with them!");
        System.out.println("\nHow many employees you have?");

        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];                 //Declaration of objects array

        for (int i = 0; i < n; i++) {

            Employee.line();                                   //Method line()

            System.out.printf("\nEmployee #%d", i + 1);
            employees[i] = new Employee();                     //Creating new object from array

            System.out.print("\nName: ");
            employees[i].setName(scanner.next());              //Setting name

            System.out.print("Department: ");
            employees[i].setDepartment(scanner.next());           //Setting department

            System.out.print("Salary: ");
            employees[i].setSalary(scanner.nextInt());         //Setting salary

        }

        Employee.line();

        int answer;
        do {
            System.out.println();
            System.out.println("Choose action:");

            System.out.println("\n0> Exit from app");
            System.out.println("1> Display employee with max salary");
            System.out.println("2> Display employee with min salary");
            System.out.println("3> Arrange workers by the field salary in the asc order");
            System.out.println("4> Arrange workers by the field salary in the desc order");
            System.out.println("5> Check if exist two or more identical employees\n");
            answer = scanner.nextInt();
            Employee.line();
            System.out.println();

            int position;

            //Task 1: Display employee with max and min salary
            if (answer == 1){
                int max = employees[0].getSalary();                    //Firstly we can set max value to employee[0]
                int maxPosition = 0;

                for (position = 0; position < employees.length; position++){
                    if (employees[position].getSalary() > max){
                        max = employees[position].getSalary();         //Finding max value and its position
                        maxPosition = position;
                    }
                }

                System.out.println("Employee with max salary is: \n");
                System.out.println((maxPosition + 1) + ". " + employees[maxPosition]);  //Printing result

                Employee.line();
            }

            // Task 2: Arrange workers by the field salary in the ascending and descending order.
            if (answer == 2){
                int min = employees[0].getSalary();
                int minPosition = 0;

                for (position = 0; position < employees.length; position++){
                    if (employees[position].getSalary() < min){
                        min = employees[position].getSalary();         //Finding min value and its position
                        minPosition = position;
                    }
                }
                System.out.println("Employee with min salary is: \n");
                System.out.println((minPosition + 1) + ". " + employees[minPosition]);   //Printing result

                Employee.line();
            }

            //Task 3: Arrange workers by the field salary in the asc order
            if (answer == 3){
                quickSortASC(employees, 0, n - 1);

                System.out.println("Ascending arranging:\n");

                for (position = 0; position < employees.length; position++){
                    System.out.println((position + 1) + ". " + employees[position]);   //Printing result
                }

                Employee.line();
            }

            //Task 4: Arrange workers by the field salary in the desc order
            if (answer == 4){
                quickSortDESC(employees, 0, n - 1);

                System.out.println("Descending arranging:\n");

                for (position = 0; position < employees.length; position++){
                    System.out.println((position + 1) + ". " + employees[position]);   //Printing result
                }

                Employee.line();
            }

            //Task 5: Check if exist two or more identical employees
            if (answer == 5){
                System.out.println("We have the same following records:\n");

                int samePosition = 0;
                int nextPosition = 1;

                //In each iteration we move from one objects comparing to another
                for (position = 1; position < employees.length; position++){

                    //Loop for moving between objects
                    for (int i = nextPosition; nextPosition < employees.length; nextPosition ++){

                        //If condition for comparing objects
                        if (employees[samePosition].equals(employees[nextPosition])) {

                            //Displaying results
                            System.out.println((samePosition + 1) + ". " + employees[samePosition]);
                            System.out.println((nextPosition + 1) + ". " + employees[nextPosition]);
                            System.out.println();
                        }
                    }
                    //In each iteration we need to add one point
                    //if we want to compare objects with folowing objects
                    //but not with previous
                    samePosition++;

                    //nextPosition always must be bigger than samePosition
                    //even not equal because our records will double
                    nextPosition = samePosition + 1;
                }
                Employee.line();
            }

        } while (answer != 0);    //Exit
    }
}