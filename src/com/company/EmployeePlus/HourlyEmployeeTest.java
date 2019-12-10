package com.company.EmployeePlus;

public class HourlyEmployeeTest {

    public static void main(String[] args)
    {
// instantiate CommissionEmployee object
        HourlyEmployee employee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 50, 12 );
// get commission employee data
        System.out.println(
                "Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is",
                employee.getFirstName() );
        System.out.printf("%s %s%n", "Last name is",
                employee.getLastName() );
        System.out.printf("%s %s%n", "Social security number is",
                employee.getSocialSecurityNumber() );
        System.out.printf("%s %.2f%n", "Has worked",
                employee.getHours() );
        System.out.printf("%s %.2f%n", "Has wage",
                employee.getWage() );
        System.out.printf("%s %.2f%n", "Has earned",
                employee.countSalary() );
        System.out.printf("%n%s:%n%n %s %n",
                "Updated employee information obtained by toString", employee );
    } // end main
}
