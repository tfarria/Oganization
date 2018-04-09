package com.company;

public class Employee {
    private String employeeNumber;
    private String firstName;
    private String lastName;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
//    Create an application to accept the name of ONE organization.
//        Make the application accept user input as follows:
//
//        Employee Number
//        Employee First Name
//        Employee Last Name
//        for as many employees as a user wants to enter.
//        The user should be asked after entering these details if he/she wants to enter more employees.
//        When the user says no, display the name of the organization, as well as the list of employees that are available to that organization.