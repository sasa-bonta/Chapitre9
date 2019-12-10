package com.company.EmployeeHierarchy;

import com.company.EmployeeHierarchy.BasePlusCommissionEmployee;

public class BasePlusCommissionEmployeeTest {

    public static void main(String[] args) {
        BasePlusCommissionEmployee baseCommissionEmployee = new BasePlusCommissionEmployee(
                "Teodor", "Vrabie", "123-456-789", 500, 0.5, 1500);
        System.out.println(baseCommissionEmployee.toString());

    }
}
