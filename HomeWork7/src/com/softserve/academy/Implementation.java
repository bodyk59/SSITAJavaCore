package com.softserve.academy;

import java.util.Arrays;

public class Implementation{
    public static void main(String[] args) {

        Employee[] employees = {                                       //Entering new records
                new SalariedEmployee("Petro",
                        "IF-A-001",
                        30,
                        160,
                        "111-11-1111"),

                new SalariedEmployee("Igor",
                        "L-B-002",
                        45,
                        80,
                        "222-22-2222"),

                new SalariedEmployee("Mykola",
                        "K-C-003",
                        28,
                        180,
                        "333-33-3333"),

                new ContractEmployee("Maria",
                        "IF-A-002",
                        "22-2222222",
                        4500),

                new ContractEmployee("Anna",
                        "L-B-001",
                        "11-1111111",
                        3800),

                new ContractEmployee("Ivan",
                        "K-C-004",
                        "44-4444444",
                        4200),

        };

        for (Employee employee : employees){                       //Calculating salary for SalariedEmployee
            if (employee instanceof SalariedEmployee){
                ((SalariedEmployee) employee).calculatePay();
            }
            if (employee instanceof ContractEmployee){             //Calculating salary for ContractEmployee
                ((ContractEmployee) employee).calculatePay();
            }
        }

        Arrays.sort(employees);                                    //Sorting our records

        for (Employee employee : employees){
            System.out.println(employee);                          //Displaying results
        }
    }
}