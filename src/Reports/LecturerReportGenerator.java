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
        String query = "SELECT l.Lecturer_ID, l.First_Name, l.Last_Name, c.Course_Name, COUNT(e.Student_ID) AS enrolledStudents " +
                        "FROM Lecturers l " +
                        "JOIN Courses c ON l.Lecturer_ID = c.Lecturer_ID " +
                        "LEFT JOIN Enrollments e ON c.Course_ID = e.Course_ID " +
                        "GROUP BY c.Course_ID;";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Lecturer Report");
            while (rs.next()) {
                System.out.println("Lecturer: " + rs.getString("First_Name") + " " + rs.getString("Last_Name") +
                                   ", Course: " + rs.getString("Course_Name") +
                                   ", Enrolled Students: " + rs.getInt("enrolledStudents"));
            }
        } catch (Exception e) {
            System.out.println("Error generating lecturer report: " + e.getMessage());
        }
    }
}