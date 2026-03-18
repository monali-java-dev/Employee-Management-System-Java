package com.employee;

import java.util.ArrayList;
import java.util.Scanner;

// Employee class
class Employee {
    int id;
    String name;
    String role;
    double salary;

    Employee(int id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
}

// Main class
public class EmployeeManagement {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Codveda Technologies - Employee Management System ===");

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    empList.add(new Employee(id, name, role, salary));
                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:
                    if (empList.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        System.out.println("\n--- Employee List ---");
                        for (Employee e : empList) {
                            System.out.println("ID: " + e.id +
                                    ", Name: " + e.name +
                                    ", Role: " + e.role +
                                    ", Salary: " + e.salary);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean found = false;
                    for (Employee e : empList) {
                        if (e.id == deleteId) {
                            empList.remove(e);
                            found = true;
                            System.out.println("Employee Deleted!");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}