/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Admin extends User {
    
    public Admin(String username, String password) {
        super(username, password, "Admin");
    }
    
    public String getUsername() {
        return super.getUsername();
    }
/**
 * 
 */
public void manageUsers() {
        try (Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("\nAdmin User Management:");
                System.out.println("1. Add User");
                System.out.println("2. View User");
                System.out.println("3. Update User");
                System.out.println("4. Delete User");
                System.out.println("5. List Users");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over

                switch(choice) {
                    case 1 -> {
                        // Add user
                        System.out.print("Enter new username: ");
                        System.out.print("Enter password: ");
                        String newPassword = scanner.nextLine();
                        UserStorage.addUser(newPassword, newPassword);
                        System.out.println("User added.");
                    }
                    case 2 -> {
                        // View user
                        System.out.print("Enter username to view: ");
                        String username = scanner.nextLine();
                        UserStorage user = UserStorage.getUser(username);
                        if(user != null) {
                            System.out.println("User: " + user.getUsername());
                        } else {
                            System.out.println("User not found.");
                        }
                    }
                    case 3 -> {
                        // Update user (simplified for demonstration)
                        System.out.print("Enter username to update: ");
                        String updateUsername = scanner.nextLine();
                        System.out.println("Enter new password: ");
                        String updatePassword = scanner.nextLine();
                        UserStorage.updateUserPassword(updateUsername, updatePassword);
                        System.out.println("User updated.");
                    }
                    case 4 -> {
                        // Delete user
                        System.out.print("Enter username to delete: ");
                        String deleteUsername = scanner.nextLine();
                        UserStorage.deleteUser(deleteUsername);
                        System.out.println("User deleted.");
                    }
                    case 5 -> {
                        // List users
                        Map<String, UserStorage> users = UserStorage.getAllUsers();
                        if(users.isEmpty()) {
                            System.out.println("No users available.");
                        } else {
                            users.forEach((k, v) -> System.out.println("User: " + k));
                        }
                    }
                    case 6 -> {
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }


public void addUser(String username, String password) {
        UserStorage.addUser(new Admin(username, password));
    }
}