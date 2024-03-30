/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

/**
 *
 * @author User
 */

// Protected instance variables to hold the user's information.
public abstract class User {
    protected String username;
    protected String password;
    protected String role;
    
    // Constructor for the User class.
    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    // Getter method
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getRole() { 
        return role; 
    }
    
    // Setter method
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setRole(String role) { 
        this.role = role; 
    }
   
    // A method to display basic user information to the console.
    public void displayUserInfo() {
        System.out.println("Username: " + username);
    }
}