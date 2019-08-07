package com.softserve.academy;

import java.util.Scanner;

public class Array10Int {

    public static void main(String[] args) {

        for(int line = 0; line <= 60; ++line) {     //Printing long line
            System.out.print("\u2500");
        }

        System.out.println("\nIn this app you can store and make some actions with numbers!\n");

        Scanner input = new Scanner(System.in);

        int[] storage = new int[10];               //Creating an array of 10 integers
        int position;

        for(position = 0; position < 10; position++) {         //Entering numbers in array
            System.out.print("Enter number: ");
            storage[position] = input.nextInt();
        }

        System.out.println("\nYou entered next numbers:");

        System.out.print("\u007C");                              //Printing vertical line

        for(position = 0; position < storage.length; position++) {
            System.out.printf(" %d \u007c", storage[position]);     //Printing numbers from array
        }

        System.out.println("\n");

        for(int line = 0; line <= 13; line++) {                //Printing line
            System.out.print("\u2500");
        }

        System.out.println("\nThe main menu:");                //Menu for choosing needful options

        for(int line = 0; line <= 60; line++) {
            System.out.print("\u2500");
        }

        System.out.println("\n0> Press to exit");
        System.out.println("1> To find out the biggest number from array");
        System.out.println("2> To find out the sum of all positive numbers");
        System.out.println("3> To find out the amount of positive and negative numbers");


        for(int line = 0; line <= 60; line++) {
            System.out.print("\u2500");
        }

        int answer;
        do {
            System.out.print("\n\nChoose your number: ");

            answer = input.nextInt();

            //Task 1: Displaying the biggest of these numbers
            if (answer == 1) {
                int max = storage[0];
                int maxPosition = 0;

                for(position = 1; position < 10; position++) {             //Comparison of numbers
                    if (storage[position] > max) {
                        max = storage[position];
                        maxPosition = position;
                    }
                }

                System.out.print("\nThe biggest of these numbers is: ");
                System.out.printf("%d in position #%d\n", max, maxPosition + 1);     //Printing results

                for(int line = 0; line <= 60; ++line) {
                    System.out.print("\u2500");
                }
            }
            //Task 2: Displaying the sum of positive numbers in the array
            if (answer == 2) {
                int CounterForPositive = 0;

                for(position = 0; position < 10; position++) {                  //Counting the sum of positive numbers
                    if (storage[position] > 0) {
                        CounterForPositive += storage[position];
                    }
                }
                //Printing results
                System.out.printf("\nThe sum of all positive numbers in array is: %d\n", CounterForPositive);

                for(int line = 0; line <= 60; line++) {
                    System.out.print("\u2500");
                }
            }
            //Task 3: Displaying the amount of negative and positive numbers in the array
            if (answer == 3) {
                int CounterForPositive = 0;
                int CounterForNegative = 0;

                for(position = 0; position < 10; ++position) {          //Counting positive numbers
                    if (storage[position] > 0) {
                        CounterForPositive++;
                    }

                    if (storage[position] < 0) {          //Counting negative numbers
                        CounterForNegative++;
                    }
                }
                //Printing results
                System.out.printf("\nThe amount of positive numbers is: %d\n", CounterForPositive);
                System.out.printf("The amount of negative numbers is: %d\n", CounterForNegative);

                //Which amount is bigger
                if (CounterForPositive > CounterForNegative) {
                    System.out.println("\nThe amount of positive numbers is bigger!");
                } else if (CounterForPositive == CounterForNegative) {
                    System.out.println("\nThe amount of positive numbers is equal to the amount of negative numbers!");
                } else {
                    System.out.println("\nThe amount of negative numbers is bigger!");
                }

                for(int line = 0; line <= 60; ++line) {
                    System.out.print("\u2500");
                }
            }
        } while(answer != 0);     //Exit
    }
}