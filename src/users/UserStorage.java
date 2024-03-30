/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import db.DBConnection;

/**
 *
 * @author User
 */

// UserStorage class for managing user records in a database.
public class UserStorage {
    
    // Adds an Admin user to the database.
    public static void addUser(Admin admin) {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?);";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, admin.getUsername());
            // In a real application, hash the password before storing it
            pstmt.setString(2, admin.getPassword());
            pstmt.executeUpdate();
            System.out.println("User added successfully: " + admin.getUsername());
        } catch (SQLException e) {
            System.out.println("Error adding user: " + e.getMessage());
        }
    }
    
    // Updates the password for a specific user identified by username.
    public static boolean updateUserPassword(String username, String updatePassword) {
        String sql = "UPDATE users SET password = ? WHERE username = ?;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // In practice, hash the newPassword before storing it
            pstmt.setString(1, updatePassword); 
            pstmt.setString(2, username);
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.out.println("Error updating user password: " + e.getMessage());
            return false;
        }
    }

    String getUsername() {
        return this.getUsername();
    }

    // Retrieves a user from the database based on username.
    public static UserStorage getUser(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new UserStorage() {};
                }
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving user: " + e.getMessage());
        }
        return null;
    }

    // Deletes a user from the database based on username.
    public static void deleteUser(String deleteUsername) {
        String sql = "DELETE FROM users WHERE username = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, deleteUsername);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("User deleted successfully: " + deleteUsername);
            } else {
                System.out.println("User not found: " + deleteUsername);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting user: " + e.getMessage());
        }
    }

    // Retrieves all users from the database and returns them as a Map.
    public static Map<String, UserStorage> getAllUsers() {
        Map<String, UserStorage> users = new HashMap<>();
        String sql = "SELECT * FROM users";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String username = rs.getString("username");
                final UserStorage user = new UserStorage();
                user.setPassword(rs.getString("password"));
                users.put(username, user);
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving users: " + e.getMessage());
        }
        return users;
    }

     // Private field for storing a user's password.
    @SuppressWarnings("unused")
    private String password;
        private void setPassword(String password) {
            this.password = password;
        }
    public static void addUser(String newPassword, String newPassword2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addUser'");
        }
    }
