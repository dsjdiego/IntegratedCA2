/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class EnrollmentDB {

    public static void addEnrollment(int Student_ID, int Course_ID) {
        String sql = "INSERT INTO enrollments (studentId, courseId) VALUES (?, ?);";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Student_ID);
            pstmt.setInt(2, Course_ID);
            pstmt.executeUpdate();
            System.out.println("Enrollment added successfully.");
        } catch (SQLException e) {
            System.out.println("Error adding enrollment: " + e.getMessage());
        }
    }

    public static void updateEnrollment(int Enrollment_ID, int Student_ID, int Course_ID) {
        String sql = "UPDATE enrollments SET studentId = ?, courseId = ? WHERE id = ?;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Student_ID);
            pstmt.setInt(2, Course_ID);
            pstmt.setInt(3, Enrollment_ID);
            pstmt.executeUpdate();
            System.out.println("Enrollment updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error updating enrollment: " + e.getMessage());
        }
    }

    public static void deleteEnrollment(int Enrollment_ID) {
        String sql = "DELETE FROM enrollments WHERE id = ?;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Enrollment_ID);
            pstmt.executeUpdate();
            System.out.println("Enrollment deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error deleting enrollment: " + e.getMessage());
        }
    }
}