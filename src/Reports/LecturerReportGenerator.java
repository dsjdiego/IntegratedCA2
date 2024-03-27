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
public class LecturerReportGenerator implements ReportGenerator {
   
    @Override
    public void generateReport() {
        String query = "SELECT l.lecturerID, l.firstName, l.lastName, c.courseName, COUNT(e.studentID) AS enrolledStudents " +
                       "FROM lecturers l " +
                       "JOIN courses c ON l.lecturerID = c.lecturerID " +
                       "LEFT JOIN enrollments e ON c.courseID = e.courseID " +
                       "GROUP BY c.courseID;";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lecturer Report");
            while (rs.next()) {
                System.out.println("Lecturer: " + rs.getString("firstName") + " " + rs.getString("lastName") +
                                   ", Course: " + rs.getString("courseName") +
                                   ", Enrolled Students: " + rs.getInt("enrolledStudents"));
            }
        } catch (Exception e) {
            System.out.println("Error generating lecturer report: " + e.getMessage());
        }
    }
}