/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MainMenu {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the College Management System");
            System.out.println("1. Manage Students");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    // Call a method to manage students
                    System.out.println("Student Management");
                    manageStudents();
                }
                case 2 -> {
                    System.out.println("Exiting the system...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please enter a valid one.");
            }
        }
    }

    private static void manageStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
