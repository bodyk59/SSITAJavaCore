package com.softserve.academy;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat is your name?");
        String name = input.next();

        System.out.println("How old are you?");
        int year = input.nextInt();

        System.out.printf("Your name is %s and you are %d years old!", name, year);

    }

}