package com.softserve.academy;

import java.util.Calendar;

public class Person {
    private String name;
    private int birthYear;
    private static int counter;

    static {                                       //Initialize static variable
        counter = 0;
    }

    public Person() {                              //Default constructor
        counter++;
    }

    public Person(String name, int birthYear) {    //Constructor with 2 parameters
        this.name = name;
        this.birthYear = birthYear;
        counter++;
    }

    public String getName() {                      //Getters for Name
        return this.name;
    }

    public void setName(String name) {             //Setters for name
        this.name = name;
    }

    public int getBirthYear() {                     //Getters for BirthDay
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {       //Setters for BirthDay
        this.birthYear = birthYear;
    }

    public int age() {                                               //Method for counting age of person
        int currentYear = Calendar.getInstance().getWeekYear();      //To set current year
        return currentYear - this.getBirthYear();
    }

    public String info() {                                           //This method printing info about person
        return "This person name is " + getName() + " and he(she) is " + age() + " years old!";
    }

    public String toString() {                     //toString method
        return getName() + ", " + age();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Bogdan", 1969);     //Creating 1st person

        Person person2 = new Person("Ivan", 2014);       //Creating 2nd person

        Person person3 = new Person("Nina", 1945);       //Creating 3rd person

        Person person4 = new Person("Inna", 1995);       //Creating 4th person

        Person person5 = new Person();                                   //Creating 5th person
        person5.setName("Maria");
        person5.setBirthYear(1948);

        System.out.println("We have " + counter + " new records:");       //Printing results for all records

        System.out.println(person1.info());
        System.out.println(person2.info());
        System.out.println(person3.info());
        System.out.println(person4.info());

        System.out.println("Information about this person: " + person5);
    }
}