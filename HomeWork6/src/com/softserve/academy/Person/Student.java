package com.softserve.academy.Person;

public class Student extends abstractPerson {

    public Student(String name){
        super(name);
    }

    @Override
    public String print(){
        return "I am a student and my name is " + name + " !";
    }
}