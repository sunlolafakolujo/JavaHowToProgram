package com.chapter2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee employee;

    @BeforeEach
    void setUp() {

        employee = new Employee();
        System.out.println("Employee class is running");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void confirmEmployeeClassIsNotNullTest(){
        assertNotNull(employee);

    }

    @Test
    void employeeFirstNameVerificationTest(){
        employee.setFirstName("Sunlola");
        assertEquals("Sunlola",employee.getFirstName());
    }

    @Test
    void  employeeLastNameVerificationTest(){
        employee.setLastName("Fakolujo");
        assertEquals("Fakolujo",employee.getLastName());
    }

    @Test
    void employeeSalaryVerificationTest(){
        employee.setSalary(1000000);
        assertEquals(250000*4,employee.getSalary());

    }

    @Test
    void newEmployeeSalaryWithPercentageRaiseTest(){
        employee.setFirstName("Sunlola");
        employee.setLastName("Fakolujo");
        employee.setSalary(1000000);
        assertEquals(1020000,employee.newEmployeeSalary(2));
        System.out.printf("%s%18s%18f%18f%n",employee.getFirstName(),employee.getLastName(),employee.getSalary(),employee.newEmployeeSalary(2));
        employee.setFirstName("Folawemi");
        employee.setLastName("Fakolujo");
        employee.setSalary(1200000);
        assertEquals(1236000,employee.newEmployeeSalary(3));
        System.out.printf("%s%18s%18f%18f%n",employee.getFirstName(),employee.getLastName(),employee.getSalary(),employee.newEmployeeSalary(3));


    }


}