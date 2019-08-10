package com.softserve.academy.Person;

abstract class Staff extends abstractPerson {

    public Staff() {
    }

    public Staff(String name) {
        super(name);
    }

    abstract public int salary();
}