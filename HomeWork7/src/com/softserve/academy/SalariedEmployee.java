package com.softserve.academy;

public class SalariedEmployee extends Employee implements IPay {
    private int hourlyRate;
    private int hoursOfWork;
    private String socialSecurityNumber;

    public SalariedEmployee(String name,                         //Constructor for SalariedEmployee
                            String employeeID,
                            int hourlyRate,
                            int hoursOfWork,
                            String socialSecurityNumber) {

        super(name, employeeID);
        this.hourlyRate = hourlyRate;
        this.hoursOfWork = hoursOfWork;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getHourlyRate() {                                 //Getter for HourlyRate
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {                    //Setter for HourlyRate
        this.hourlyRate = hourlyRate;
    }

    public int getHoursOfWork() {                                   //Getter for HoursOfWork
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {                    //Setter for HoursOfWork
        this.hoursOfWork = hoursOfWork;
    }

    public String getSocialSecurityNumber() {                    //Getter for SocialSecurityNumber
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {                                            //Defining salary
        return averageMonthlySalary = getHourlyRate()* getHoursOfWork();
    }

    @Override
    public String toString() {
        return  "Salaried Employee [" +
                "name= '" + name + '\'' +
                ", employee ID= '" + employeeID + '\'' +
                ", Social Security Number= '" + socialSecurityNumber + '\'' +
                ", hourly rate= " + hourlyRate +
                ", hours of work= " + hoursOfWork +
                ", average monthly salary= " + averageMonthlySalary +
                ']';
    }
}