package com.softserve.academy.Person;

abstract class abstractPerson {
    protected String name;

    public abstractPerson() {
    }

    public abstractPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String print();
}