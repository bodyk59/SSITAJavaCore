package com.softserve.academy.Person;

public class Implementation {

    public static void main(String[] args) {
        abstractPerson[] persons = {
                new Teacher("Maria", 100, 35),
                new Teacher("Iryna", 98, 40),
                new Cleaner("Petro", 120, 40),
                new Cleaner("Igor", 122, 40),
                new Student("Taras"),
                new Student("Andriy")
        };

        for (int position = 0; position < persons.length; position++){
            abstractPerson person = persons[position];
            System.out.println(person.print());
            if (person instanceof Teacher || person instanceof Cleaner){
                System.out.println("Salary is " + ((Staff) person).salary());
            }
            System.out.println();
        }
    }
}