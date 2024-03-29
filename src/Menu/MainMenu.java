/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.List;
import java.util.Scanner;
import Tables.Student;
import db.StudentDB;

/**
 *
 * @author User
 */
public class MainMenu {
    public static void show() {
        try (Scanner scanner = new Scanner(System.in)) {
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
    }

    private static void manageStudents() {
    try (Scanner scanner = new Scanner(System.in)) {
        while (true) {
            System.out.println("\nStudent Management:");
            System.out.println("1. Add New Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    return; // Exit the student management menu
                }
                default -> System.out.println("Invalid choice. Please enter a valid one.");
            }
        }
    }
  }

    private static void addStudent() {
        String firstName;
        String lastName;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student's first name: ");
            firstName = scanner.nextLine();
            System.out.print("Enter student's last name: ");
            lastName = scanner.nextLine();
        }
        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("First name and last name cannot be empty.");
            return; // Exit the method if validation fails
        }

        StudentDB.addNewStudent(new Student(firstName, lastName));
        System.out.println("Student added successfully!");
  }

    private static void viewStudents() {
        // Call your database method to retrieve all students
        List<Student> students = StudentDB.getAllStudents();
        
        // Iterate over the list of students and print their details
        for (Student student : students) {
            System.out.println("Student ID: " + student.getStudent_ID());
            System.out.println("First Name: " + student.getFirst_Name());
            System.out.println("Last Name: " + student.getLast_Name());
            // Print other student details as needed
            System.out.println("--------------------");
        }
    }

    private static void updateStudent() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student ID: ");
            int Student_ID = scanner.nextInt();
            System.out.print("Enter updated first name: ");
            String First_Name = scanner.next();
            System.out.print("Enter updated last name: ");
            String Last_Name = scanner.next();
            
            // Call your database method to update the student
            StudentDB.updateStudent(Student_ID, First_Name, Last_Name);
            System.out.println("Student updated successfully!");
        }
    }

    private static void deleteStudent() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student ID: ");
            int Student_ID = scanner.nextInt();
            
            // Call your database method to delete the student
            StudentDB.deleteStudentById(Student_ID);
            
            System.out.println("Student deleted successfully!");
        }
    }
}

