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
public class StudentReportGenerator implements ReportGenerator {
   
    // This method purpose is to generate reports specifically for student data.
    @Override
    public void generateReport() {
        String query = "SELECT s.Student_ID, s.First_Name, s.Last_Name, c.Course_Name, g.Grade " +
                        "FROM Students s " +
                        "JOIN Enrollments e ON s.Student_ID = e.Student_ID " +
                        "JOIN Courses c ON e.Course_ID = c.Course_ID " +
                        "LEFT JOIN Grades g ON e.Enrollment_ID = g.Enrollment_ID " +
                        "ORDER BY s.Student_ID, c.Course_Name;";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Generating student Report");
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("Student_ID") + 
                                   ", Name: " + rs.getString("First_Name") + " " + rs.getString("Last_Name") +
                                   ", Course: " + rs.getString("Course_Name") +
                                   ", Grade: " + rs.getString("Grade"));
            }
        } catch (Exception e) {
            System.out.println("Error generating student report: " + e.getMessage());
        }
    }
}
