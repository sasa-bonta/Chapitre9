package com.company.EmployeeHierarchy;

public class CommissionEmployee extends Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");

        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings()
    {
        return getCommissionRate() * getGrossSales() ;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" +
                super.toString() +
                ", grossSales=" + getGrossSales() +
                ", commissionRate=" + getCommissionRate() +
                "}";
    }
}
