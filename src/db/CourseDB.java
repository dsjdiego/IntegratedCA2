/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import Tables.Course;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class CourseDB {
    public static void updateCourse(int Course_ID, String newCourse_Name, boolean Is_Online) {
        String sql = "UPDATE courses SET courseName = ?, isOnline = ? WHERE Course_ID = ?;";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, newCourse_Name);
            pstmt.setBoolean(2, Is_Online);
            pstmt.setInt(3, Course_ID);
            
            int updatedRows = pstmt.executeUpdate();
            if(updatedRows > 0) {
                System.out.println("Course updated successfully.");
            } else {
                System.out.println("Course with ID " + Course_ID + " not found.");
            }
        } catch (SQLException e) {
            System.out.println("Error updating course: " + e.getMessage());
        }
    }
    
    public static List<Course> viewCourses() {
        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM courses;";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            while (rs.next()) {
                Course course = new Course();
                // Assuming Course class has a suitable constructor or setters
                course.setCourseId(rs.getInt("courseId"));
                course.setCourseName(rs.getString("courseName"));
                course.setLecturerId(rs.getInt("lecturerId"));
                course.setCourseProgram(rs.getString("courseProgram"));
                course.setCourseRoom(rs.getString("courseRoom"));
                course.setOnline(rs.getBoolean("isOnline"));
                courses.add(course);
            }
        } catch (SQLException e) {
            System.out.println("Error viewing courses: " + e.getMessage());
        }
        return courses;
    }
}
