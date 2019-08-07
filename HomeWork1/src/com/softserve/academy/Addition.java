package com.softserve.academy;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        System.out.println("\nApp for adding 2 numbers!");
        System.out.print("\nEnter a: ");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        System.out.print("Enter b: ");

        int b = input.nextInt();
        int result = a + b;

        System.out.printf("%d + %d = %d", a, b, result);

    }

}