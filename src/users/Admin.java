/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Admin extends User {
    
    // Constructor that initializes an Admin object with a username, password, and predefined role "Admin".
    public Admin(String username, String password) {
        super(username, password, "Admin");
    }
    
    @Override
    public String getUsername() {
        return super.getUsername();
    }

    // Provides an interactive console interface for admin to manage user-related operations.
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

                    // Switch case to handle different user management actions
                    switch(choice) {
                        case 1 -> {
                            //Add User
                        System.out.print("Enter new username: ");
                        String newUsername = scanner.nextLine(); // Correctly reads the new username.
                        System.out.print("Enter password: ");
                        String newPassword = scanner.nextLine(); // Correctly reads the new password.
                        UserStorage.addUser(newUsername, newPassword); // Assumes addUser takes a username and password.
                        System.out.println("User added.");
                    }
                        case 2 -> {
                            // View user
                            System.out.print("Enter username to view: ");
                            String userName = scanner.nextLine();
                            UserStorage user = UserStorage.getUser(userName);
                            if(user != null) {
                                System.out.println("User: " + user.getUsername());
                            } else {
                                System.out.println("User not found.");
                            }
                        }
                        case 3 -> {
                            // Update user
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