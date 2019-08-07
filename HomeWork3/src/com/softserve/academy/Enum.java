package com.softserve.academy;

import java.util.Scanner;

public class Enum {

    public enum Continent{
        Eurasia, Africa, NorthAmerica, SouthAmerica, Antarctica, Australia       //Declaration Continent with type enum
    }

    static void enumContinent(Continent continent){       //Method witch describes our continents

        Scanner input = new Scanner(System.in);

        int countriesAmount;                           //Declaration variables for all 'switch' expression
        int position;

        switch (continent) {                      //For other continent this solution is the same
            case Eurasia:
                System.out.println("How many countries you want to enter?");

                countriesAmount = input.nextInt();

                /*The amount of countries can`t be smaller
                 * or equal to 0 and bigger than the amount of countries this continent has
                 **/

                if (countriesAmount > 0 && countriesAmount <= 93) {

                    String[] Eurasia = new String[countriesAmount];

                    System.out.println();
                    for (position = 0; position < countriesAmount; position++) {    //Creating the record in the array
                        System.out.print("Enter country: ");
                        Eurasia[position] = input.next();
                    }

                    System.out.println();
                    System.out.printf("This continent includes %d followsing countries:", countriesAmount);
                    System.out.println();

                    for (int line = 1; line <= 15; line++){            //Printing long line
                        System.out.print("\u2500");
                    }

                    for (position = 0; position < Eurasia.length; position++){     //Reading the records from the array
                        System.out.println("\n" + Eurasia[position]);

                        for (int line = 1; line <= 15; line++){
                            System.out.print("\u2500");
                        }
                    }

                    System.out.println();

                } else {                            //If the amount of countries doesn`t meet the condition
                    System.out.println();
                    System.out.println("Invalid input!");
                }
                break;

            case Africa:
                System.out.println("How many countries you want to enter?");

                countriesAmount = input.nextInt();

                if (countriesAmount > 0 && countriesAmount <= 54) {

                    String[] Africa = new String[countriesAmount];

                    System.out.println();
                    for (position = 0; position < countriesAmount; position++) {
                        System.out.print("Enter country: ");
                        Africa[position] = input.next();
                    }

                    System.out.println();
                    System.out.printf("This continent includes %d followsing countries:", countriesAmount);
                    System.out.println();

                    for (int line = 1; line <= 15; line++){
                        System.out.print("\u2500");
                    }

                    for (position = 0; position < Africa.length; position++){
                        System.out.println("\n" + Africa[position]);

                        for (int line = 1; line <= 15; line++){
                            System.out.print("\u2500");
                        }
                    }

                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("Invalid input!");
                }
                break;

            case NorthAmerica:
                System.out.println("How many countries you want to enter?");

                countriesAmount = input.nextInt();

                if (countriesAmount > 0 && countriesAmount <= 23) {

                    String[] NorthAmerica = new String[countriesAmount];

                    System.out.println();
                    for (position = 0; position < countriesAmount; position++) {
                        System.out.print("Enter country: ");
                        NorthAmerica[position] = input.next();
                    }

                    System.out.println();
                    System.out.printf("This continent includes %d followsing countries:", countriesAmount);
                    System.out.println();

                    for (int line = 1; line <= 15; line++){
                        System.out.print("\u2500");
                    }

                    for (position = 0; position < NorthAmerica.length; position++){
                        System.out.println("\n" + NorthAmerica[position]);

                        for (int line = 1; line <= 15; line++){
                            System.out.print("\u2500");
                        }
                    }

                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("Invalid input!");
                }
                break;

            case SouthAmerica:
                System.out.println("How many countries you want to enter?");

                countriesAmount = input.nextInt();

                if (countriesAmount > 0 && countriesAmount <= 12) {

                    String[] SouthAmerica = new String[countriesAmount];

                    System.out.println();
                    for (position = 0; position < countriesAmount; position++) {
                        System.out.print("Enter country: ");
                        SouthAmerica[position] = input.next();
                    }

                    System.out.println();
                    System.out.printf("This continent includes %d followsing countries:", countriesAmount);
                    System.out.println();

                    for (int line = 1; line <= 15; line++){
                        System.out.print("\u2500");
                    }

                    for (position = 0; position < SouthAmerica.length; position++){
                        System.out.println("\n" + SouthAmerica[position]);

                        for (int line = 1; line <= 15; line++){
                            System.out.print("\u2500");
                        }
                    }

                    System.out.println();

                } else {
                    System.out.println();
                    System.out.println("Invalid input!");
                }
                break;
            //It is true for following continents
            case Australia:
                System.out.println("Australians feel happy with only one country!");
                break;

            case Antarctica:
                System.out.println("Penguins are pleased with the situation so they don`t need anybody else!");
                break;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Choosing the continent

        System.out.println("\nIn this app you can store information about continents and their countries!");
        System.out.print("\nYou have next continent: ");
        System.out.println("Eurasia, Africa, NorthAmerica, SouthAmerica, Antarctica, Australia");
        System.out.print("\nChoose one: ");

        String continent = input.next();

        switch (continent){
            case "Eurasia":
                enumContinent(Continent.Eurasia);
                break;
            case "Africa":
                enumContinent(Continent.Africa);
                break;
            case "NorthAmerica":
                enumContinent(Continent.NorthAmerica);
                break;
            case "SouthAmerica":
                enumContinent(Continent.SouthAmerica);
                break;
            case "Antarctica":
                enumContinent(Continent.Antarctica);
                break;
            case "Australia":
                enumContinent(Continent.Australia);
                break;
                default:
                    System.out.println("Invalid input!");
                    break;
        }

        System.out.println("\nInserting completed successful!");
    }
}