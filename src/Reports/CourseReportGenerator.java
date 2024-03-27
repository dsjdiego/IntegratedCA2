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
public class CourseReportGenerator implements ReportGenerator {

    @Override
    public void generateReport() {
        String query = "SELECT courseName, courseProgram, lecturerId, courseRoom, isOnline FROM courses;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Course Report");
            while (rs.next()) {
                String onlineStatus = rs.getBoolean("isOnline") ? "Online" : "In-person";
                System.out.println("Course Name: " + rs.getString("courseName") + 
                                   ", Program: " + rs.getString("courseProgram") +
                                   ", Lecturer ID: " + rs.getInt("lecturerId") +
                                   ", Room: " + rs.getString("courseRoom") +
                                   ", Mode: " + onlineStatus);
            }
        } catch (Exception e) {
            System.out.println("Error generating course report: " + e.getMessage());
        }
    }
}

