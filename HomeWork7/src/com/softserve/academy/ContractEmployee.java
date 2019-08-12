package com.softserve.academy;

public class ContractEmployee extends Employee implements IPay {
    private String federalTaxIdMember;
    private int fixedMonthlyPayment;

    public ContractEmployee(String name,                            //Constructor for ContractEmployee
                            String employeeID,
                            String federalTaxIdMember,
                            int fixedMonthlyPayment) {

        super(name, employeeID);
        this.federalTaxIdMember = federalTaxIdMember;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {                      //Getter for FederalTaxIdMember
        return federalTaxIdMember;
    }

    public int getFixedMonthlyPayment() {                      //Getter for FixedMonthlyPayment
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(int fixedMonthlyPayment) {         //Setter for FixedMonthlyPayment
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public int calculatePay(){                                       //Defining salary
        return averageMonthlySalary = getFixedMonthlyPayment();
    }

    @Override
    public String toString() {
        return "ContractEmployee [" +
                "name= '" + name + '\'' +
                ", employee ID= '" + employeeID + '\'' +
                ", Federal Tax Id Member= '" + federalTaxIdMember + '\'' +
                ", fixed monthly payment= " + fixedMonthlyPayment +
                ", average monthly salary= " + averageMonthlySalary +
                ']';
    }
}