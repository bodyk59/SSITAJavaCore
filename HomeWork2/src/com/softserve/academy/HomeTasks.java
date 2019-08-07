package com.softserve.academy;

import java.util.Scanner;

public class HomeTasks {

    public static void main(String[] args) {
        //Task 1: Define integer variable m and set the value of variable n is 1 when
        //m is larger than 0, 0 when m is 0 and -1 when m is less than 0.
        System.out.println("\nApp #1\nDefines variable n:");
        System.out.println("n = 1 if m > 0\nn = 0 if m = 0\nn = -1 if m < 0");
        System.out.print("Enter m: ");

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = m > 0 ? 1 : (m == 0 ? 0 : -1);                    //Finding correct result

        System.out.printf("n = %d\n", n);

        // Task 2: Write the code to check whether a given number is even or odd.
        System.out.println("\nApp #2\nDefines whether a given number is even or odd.");
        System.out.print("Enter number: ");

        int GivenNumber = input.nextInt();

        if (GivenNumber == 0) {
            System.out.println("It is 0!\n");
        } else if (GivenNumber % 2 == 0) {
            System.out.printf("%d is even!\n", GivenNumber);
        } else {
            System.out.printf("%d is odd!\n", GivenNumber);
        }

        //Task 3: Write the code to check whether a given number is positive or negative
        System.out.println("\nApp #3\nDefines whether a given number is positive or negative.");
        System.out.print("Enter number: ");

        int GivenNumber2 = input.nextInt();

        if (GivenNumber2 > 0) {
            System.out.printf("%d is positive!\n", GivenNumber2);
        } else if (GivenNumber2 == 0) {
            System.out.println("It is 0!\n");
        } else {
            System.out.printf("%d is negative!\n", GivenNumber2);
        }

        //Task 4: Write the code to find the sum and product of first 10 natural numbers.
        System.out.println("\nApp #4\nDefines the sum the product of first 10 natural numbers.");

        int sum = 0;
        int product = 1;
        int i;

        for(i = 1; i < 11; ++i) {
            sum += i;
        }

        for(i = 2; i < 11; ++i) {
            product *= i;
        }

        System.out.printf("The sum is %d\n", sum);
        System.out.printf("The product is %d\n", product);

        //Task 5: Write the code to display the pattern like right angle triangle using an asterisk.
        System.out.println("\nApp #5\nDisplays right angle triangle.");
        System.out.print("Enter number of floors: ");

        n = input.nextInt();

        char asterisk = '*';

        for(i = 1; i <= n; ++i) {

            for(int j = 1; j <= i; ++j) {
                System.out.print(asterisk);                       //Printing the pyramid
            }

            System.out.print("\n");
        }
    }
}