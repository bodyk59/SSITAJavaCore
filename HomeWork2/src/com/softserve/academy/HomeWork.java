package com.softserve.academy;

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        //Task 1: Take previous example about leap year and rewrite it using one
        //condition if together with logical operators.
        System.out.println("\nApp #1\nDefines whether a given year is leap.");
        System.out.print("Enter year: ");

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        if ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0))) {       //Finding the leap year
            System.out.printf("%d is a leap year!\n", year);
        } else {
            System.out.printf("%d is not a leap year!\n", year);
        }

        //Task 2: Write the code to display the pattern like a pyramid using asterisk and each row
        //contain an odd number of asterisks.
        System.out.println("\nApp #2\nDisplays a pyramid made of asterisk.");
        System.out.print("Enter number of floors: ");

        int NumbersOfFloors = input.nextInt();
        char asterisk = '*';
        char space = ' ';

        for(int i = 1; i < NumbersOfFloors + 1; ++i) {             //Creating the floors

            for(int j = i + 1; j <= NumbersOfFloors; ++j) {        //Creating a free space before the pyramid
                System.out.print(space);
            }

            for(int k = 1; k <= i; ++k) {                          //Creating 1st part of the pyramid
                System.out.print(asterisk);
            }

            for(int k = 1; k <= i - 1; ++k) {                      //Creating 2nd part of the pyramid
                System.out.print(asterisk);
            }

            System.out.print("\n");
        }

        //Task 3: Write the code to find the sum of the series 1+11+111+1111 + .. n terms.
        System.out.println("\nApp #3\nDisplays the sum of the series 1+11+111+1111 + .. n terms.");
        System.out.print("Enter n: ");

        int n = input.nextInt();
        int sum = 0;
        int result = 0;

        for(int i = 0; i < n; ++i) {

            for(int j = i + 1; j <= n; ++j) {                       //Creating a free space before numbers
                System.out.print(space);
            }

            result += Math.pow(10, i);                             //Finding needful numbers
            sum += result;                                         //Calculating the sum
            System.out.printf("%d|%d\n", result, sum);             //Printing results in the pyramid
        }

        for(int i = 1; i <= n + 1; ++i) {                          //Printing the line under the pyramid
            System.out.print("\u2500");
        }

        System.out.printf("\n %d", sum);                           //Printing the sum
    }
}