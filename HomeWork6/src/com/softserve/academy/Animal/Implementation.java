package com.softserve.academy.Animal;

public class Implementation {

    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Fluffy", 20, "meat"),
                new Cat("Musia", 24, "fish"),
                new Dog("Adolf", 36, "chicken"),
                new Dog("Jack", 28, "fruits")
        };

        System.out.println("We have a few new animals:\n");

        for (int position = 0; position < animals.length; position++){
            System.out.println(animals[position].voice());
            System.out.println(animals[position].feed());
            System.out.println();
        }
    }
}
