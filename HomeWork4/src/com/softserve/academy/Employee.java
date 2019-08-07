package com.softserve.academy;

import java.util.Scanner;

class Employee {                                              //New class Employee
    private String name;
    private int rate;
    private int hours;
    private int bonuses;
    private static int TotalHours;
    private static int counter;

    static {                                                  //Initialize static variables
        counter = 0;
        TotalHours = 0;
    }

    public Employee() {                                       //Default constructor
        counter++;
    }

    public Employee(String name, int rate) {                  //Constructor with 2 parameters
        this.name = name;
        this.rate = rate;
        counter++;
    }

    public Employee(String name, int rate, int hours) {      //Constructor with 3 parameters
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        TotalHours += hours;
        counter++;
    }

    public String getName() {                               //Getter for Name
        return this.name;
    }

    public void setName(String name) {                       //Setter for name
        this.name = name;
    }

    public int getRate() {                                   //Getter for Rate
        return this.rate;
    }

    public void setRate(int rate) {                          //Setter for Rate
        this.rate = rate;
    }

    public int getHours() {                                  //Getter for Hours
        return this.hours;
    }

    public void setHours(int hours) {                        //Setter for Hours
        this.hours = hours;
    }

    public int getBonuses() {                               //Getter for Bonuses
        return bonuses;
    }

    public void setBonuses(int bonuses) {                    //Setter for bonuses
        this.bonuses = this.salary() * bonuses / 100;
    }

    public int salary() {                                    //In this method we can find out value of the salary
        return this.getRate() * this.getHours() + this.bonuses;
    }

    public void changeRate(int newRate) {                    //With this method we can change value of the rate
        this.rate = newRate;
    }

    public static void line(){                               //This method printing a long line
        for (int line = 1; line <= 80; ++line) {
            System.out.print("\u2500");
        }
    }

    @Override
    public String toString() {                               //toString method
        return "Employee [" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", bonuses=" + bonuses +
                ", salary=" + salary() +
                ']';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIn this app you can store information about your employee!");
        System.out.println("\nHow many employees you have?");

        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];                 //Declaration of objects array

        for (int i = 0; i < n; i++) {

            Employee.line();                                   //Method line()

            System.out.printf("\nEmployee #%d", i + 1);
            employees[i] = new Employee();                     //Creating new object from array

            System.out.print("\nName: ");
            employees[i].setName(scanner.next());              //Setting name

            System.out.print("Rate: ");
            employees[i].setRate(scanner.nextInt());           //Setting rate

            System.out.print("Hours: ");
            employees[i].setHours(scanner.nextInt());         //Setting hours

            System.out.printf("His(her) salary is: %d!\n", employees[i].salary());

            System.out.print("\nHas he(she) got bonuses? 1> Yes / 0> No: ");

            int answer = scanner.nextInt();

            if (answer == 1) {                               //Press 1 for set bonuses, and 0 if you don`t want do it
                System.out.println("What is the value of the bonus?");

                int bonus = scanner.nextInt();

                employees[i].setBonuses(bonus);               //Setting bonuses

                System.out.printf(" + %d bonuses to salary. ", employees[i].getBonuses());
                System.out.printf("New salary is %d!\n", employees[i].salary());
            }

            TotalHours += employees[i].getHours();            //Counting TotalHours
        }

        Employee.line();

        System.out.println("\nInserting successfully completed!");
        System.out.printf("\nYou have %d following records: \n", counter);

        Employee.line();

        System.out.println();

        for (int i = 0; i < counter; i++) {
            System.out.println((i + 1) + ". " + employees[i]);         //Printing records from array
        }

        System.out.printf("\nTotal hours of all employees: %d\n", TotalHours);

        Employee.line();

        int answer;                        //To continue or to end the next loop
        int counterForUpdating = 0;        //To count how many records was updated

        do {
            System.out.println("\n\nDo you need to change the rate? 1> Yes / 0> No: ");

            answer = scanner.nextInt();

            counterForUpdating++;

            switch (answer){
                case 1:
                    System.out.println("Who do you want to change the rate for?\n/choose the employee`s number/");

                    int record = scanner.nextInt();

                    System.out.println("What is the value of the new rate?");

                    int newRate = scanner.nextInt();

                    employees[record - 1].changeRate(newRate);               //Changing the rate
                    employees[record - 1].salary();                          //Setting new value of salary

                    System.out.printf("\nYou have %d change(s) in the following record(s):\n", counterForUpdating);

                    Employee.line();

                    System.out.println();

                    for (int i = 0; i < counter; i++) {                   //Printing records from array after updating
                        System.out.println((i + 1) + ". " + employees[i]);
                    }

                    System.out.printf("\nTotal hours of all employees: %d\n", TotalHours);  //Printing TotalHours

                    Employee.line();

                    break;

                case 0:
                    System.out.println("\nNo records were updated!");
                    System.out.printf("\nTotal hours of all employees: %d\n", TotalHours);

                    break;
            }
        } while(answer == 1);
    }
}