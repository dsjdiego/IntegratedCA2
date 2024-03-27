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
   
    @Override
    public void generateReport() {
        String query = "SELECT s.studentID, s.firstName, s.lastName, c.courseName, g.grade " +
                       "FROM students s " +
                       "JOIN enrollments e ON s.studentID = e.studentID " +
                       "JOIN courses c ON e.courseID = c.courseID " +
                       "LEFT JOIN grades g ON e.enrollmentID = g.enrollmentID " +
                       "ORDER BY s.studentID, c.courseName;";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Student Report");
            while (rs.next()) {
                System.out.println("Student ID: " + rs.getInt("studentID") + 
                                   ", Name: " + rs.getString("firstName") + " " + rs.getString("lastName") +
                                   ", Course: " + rs.getString("courseName") +
                                   ", Grade: " + rs.getString("grade"));
            }
        } catch (Exception e) {
            System.out.println("Error generating student report: " + e.getMessage());
        }
    }
}
