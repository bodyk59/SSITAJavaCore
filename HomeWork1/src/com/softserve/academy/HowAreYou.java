package com.softserve.academy;

import java.util.Scanner;

public class HowAreYou {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nHow are you?");

        String answer = input.next();

        System.out.printf("I am %s!", answer);
    }

}