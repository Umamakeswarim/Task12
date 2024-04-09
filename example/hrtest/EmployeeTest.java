package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee employee = new Employee("Umamakeswari", 1001, 50000.0);

        // Calling methods to print employee's name and salary
        employee.printName();
        employee.printSalary();
    }
}

