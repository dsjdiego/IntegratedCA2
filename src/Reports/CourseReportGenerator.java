/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */

// This class is designed to generate reports related to courses
public class CourseReportGenerator implements ReportGenerator {

    // This method generates a basic report listing details of all courses.
    @Override
    public void generateReport() {
        String query = "SELECT Course_Name, Course_Program, Lecturer_ID, Course_Room, Is_Online FROM courses;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Generating course Report");
            while (rs.next()) {
                String onlineStatus = rs.getBoolean("Is_Online") ? "Online" : "In-person";
                System.out.println("Course Name: " + rs.getString("Course_Name") + 
                                   ", Program: " + rs.getString("Course_Program") +
                                   ", Lecturer ID: " + rs.getInt("Lecturer_ID") +
                                   ", Room: " + rs.getString("Course_Room") +
                                   ", Mode: " + onlineStatus);
            }
        } catch (Exception e) {
            System.out.println("Error generating course report: " + e.getMessage());
        }
    }
}