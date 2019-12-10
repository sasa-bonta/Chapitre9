package com.company.EmployeePlus;

public class HourlyEmployee extends Employee2 {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double hours; // gross weekly sales
    private double wage; // commission

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168)
            System.out.println("Hours must be > 0 and < 168");
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0)
            System.out.println("Wage must be > 0");
        if (wage > 0)
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }

    public double countSalary() {
        double salary;
        if (hours > 40)
            salary = 40 * wage + (hours - 40) * wage * 1.5;
        else salary = hours * wage;
        return salary;
    }
}
