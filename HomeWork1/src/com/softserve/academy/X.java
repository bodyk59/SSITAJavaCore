package com.softserve.academy;

import java.util.Scanner;

public class X {

    public static void main(String[] args) {

        System.out.println("\nApp to define x\u00B2 and \u221Ax!");
        System.out.print("Enter x: ");

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();

        System.out.printf("%.1f\u00B2 = %.2f\n", x, x * x);
        System.out.printf("\u221A%.1f = %.2f", x, Math.sqrt(x));
    }

}