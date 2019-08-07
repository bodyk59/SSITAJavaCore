package com.softserve.academy;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        System.out.println("\nApp for division of 2 numbers!");
        System.out.print("\nEnter a: ");

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();

        System.out.print("Enter b: ");

        double b = input.nextDouble();
        double result = a / b;

        System.out.printf("%.2f / %.2f = %.3f", a, b, result);

    }

}
