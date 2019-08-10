package com.softserve.academy.Animal;

public class Cat extends Animal{
    private String name;
    private int ageInMonth;
    private String feed;

    public Cat(){

    }

    public Cat(String name, int ageInMonth, String feed){
        this.name = name;
        this.ageInMonth = ageInMonth;
        this.feed = feed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeInMonth() {
        return ageInMonth;
    }

    public void setAgeInMonth(int ageInMonth) {
        this.ageInMonth = ageInMonth;
    }

    public String getFeed(){
        return feed;
    }

    public void setFeed(String feed){
        this.feed = feed;
    }

    @Override
    public String voice(){
        return "Meow! My name is " + name + " and my I am " + ageInMonth + " month old!";
    }

    @Override
    public String feed(){
        return "I prefer eating " + feed + " !";
    }
}