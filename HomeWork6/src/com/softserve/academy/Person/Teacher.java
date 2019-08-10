package com.softserve.academy.Person;

public class Teacher extends Staff {
    private int hours;
    private int rate;

    public Teacher() {
    }

    public Teacher(String name, int hours, int rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String print(){
        return "I am a teacher and my is " + name + ", I worked  " + hours + " hours, my rate is " + rate + "$.";
    }

    @Override
    public int salary(){
        return hours * rate;
    }
}