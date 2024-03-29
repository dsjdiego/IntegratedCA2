/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import users.*;
import java.util.Scanner;

import Reports.LecturerReportGenerator;
import java.util.InputMismatchException;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User currentUser = loginUser(scanner); // Assume this method handles user login and returns a User object
        if (currentUser != null) {
            boolean exit = false;
            while (!exit) {
                System.out.println("Welcome to the College Management System");
                if (currentUser instanceof Office office) {
                    showOfficeMenu(scanner, office);
                } else if (currentUser instanceof Lecturer) {
                    // For simplicity, Lecturers only generate their own reports in this example
                    new LecturerReportGenerator().generateReport();
                    exit = true;
                } else {
                    System.out.println("Unsupported user role for reporting.");
                    exit = true;
                }
            }
        } else {
            System.out.println("Login failed.");
        }
    }
    
    private static void showOfficeMenu(Scanner scanner, Office currentUser) {
        boolean back = false;
        while (!back) {
            System.out.println("\nSelect Report to Generate:");
            System.out.println("1. Course Report");
            System.out.println("2. Student Report");
            System.out.println("3. Lecturer Report");
            System.out.println("4. Back");
            System.out.print("Enter choice: ");
            int choice = 0;
            try {
                choice = scanner.nextInt();
                // Process choice
            } catch (InputMismatchException ime) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Clear the incorrect input
            }

            switch (choice) {
                case 1 -> currentUser.generateReports("Course");
                case 2 -> currentUser.generateReports("Student");
                case 3 -> currentUser.generateReports("Lecturer");
                case 4 -> back = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private static User loginUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();
        System.out.print("Enter password: ");
        String password = scanner.nextLine().trim();

        if (username.equals("admin") && password.equals("java")) {
            return new Admin(username, password); // Assuming Admin is a valid user type
        } else if (username.equals("lecturer") && password.equals("java1")) {
            return new Lecturer(username, password); // Assuming Lecturer is a valid user type
        } else if (username.equals("office") && password.equals("java2")) {
            return new Office(username, password); // Assuming Office is a valid user type
        } else {
            System.out.println("Invalid username or password.");
        }
        return null; // Authentication failed
    }
}
