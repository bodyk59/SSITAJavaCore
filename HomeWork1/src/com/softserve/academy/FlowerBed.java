package com.softserve.academy;

import java.util.Scanner;

public class FlowerBed {

    public static void main(String[] args) {

        System.out.println("\nApp to define perimeter and area of a circle!");
        System.out.print("Enter radius: ");

        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();

         while (radius <= 0){
            System.out.print("\nInvalid value!\nRadius can`t be less or equal to 0.");
            System.out.print("\nEnter radius: ");
            radius = input.nextDouble();
         }

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("\nP = 2πr = %.2f\n", perimeter);
        System.out.printf("A = πr² = %.2f", area);

    }

}