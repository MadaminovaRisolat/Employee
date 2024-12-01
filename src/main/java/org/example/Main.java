package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        // Create a new Employee
        Employee newEmployee = new Employee("John Doe", "Developer", 75000.0, new Date());
        int id = employeeData.createEmployee(newEmployee);
        System.out.println("Inserted employee with ID: " + id);

        // Get an Employee by ID
        Employee retrievedEmployee = employeeData.getEmployeeById(id);
        System.out.println("Retrieved Employee: " + retrievedEmployee);

        // Get all Employees
        System.out.println("All Employees:");
        employeeData.getAllEmployees().forEach(System.out::println);

        // Update an Employee
        retrievedEmployee.setPosition("Senior Developer");
        employeeData.updateEmployee(retrievedEmployee);
        System.out.println("Updated Employee: " + employeeData.getEmployeeById(id));

        // Delete an Employee
        employeeData.deleteEmployee(id);
        System.out.println("Deleted Employee with ID: " + id);
    }
}
