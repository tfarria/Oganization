package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean stop = false;
        Employee employee;
        Organization organization = new Organization();
        ArrayList<Employee> employeeList = new ArrayList<>();
        String answer = " ";


        System.out.println("Name of Organisation : ");
        organization.setOrganizationName(keyboard.nextLine());

    do {


        employee = new Employee();
        System.out.println("Enter employee number : ");
        employee.setEmployeeNumber(keyboard.nextLine());

        System.out.println("Enter first name : ");
        employee.setFirstName(keyboard.nextLine());

        System.out.println("Enter last name : ");
        employee.setLastName(keyboard.nextLine());
        employeeList.add(employee);

        System.out.println("Do you want to add another employee ? ");
        answer = keyboard.nextLine();

        if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n"))
            stop = true;

    }while (!stop);


    for (Employee eachEmployee : employeeList){

       System.out.print("Organization Name : "+ " "+organization.getOrganizationName());
        System.out.println("               ");
        System.out.println("Employee Info :"+" "+"Employee Number :" +eachEmployee.getEmployeeNumber()+" "+"Employee Name : "+eachEmployee.getFirstName()+" "+eachEmployee.getLastName());
    }
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