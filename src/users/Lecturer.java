/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Lecturer extends User {

    // Constructor for creating a Lecturer object.
    public Lecturer(String username, String password) {
        super(username, password, "Lecturer");
    }

    // Method to list all courses associated with the lecturer.
    public void listMyCourses() {
        String sql = "SELECT courseName FROM courses WHERE lecturerId = (SELECT id FROM users WHERE username = ? AND role = 'Lecturer')";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, this.getUsername());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("courseName"));
            }
        } catch (Exception e) {
            System.out.println("Error listing courses: " + e.getMessage());
        }
    }
}
