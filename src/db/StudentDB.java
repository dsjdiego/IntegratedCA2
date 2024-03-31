/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

import Tables.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class StudentDB {

    // Adds a new student record to the database.
    public static void addNewStudent(Student student) {
        String sql = "INSERT INTO students (First_Name, Last_Name) VALUES (?, ?);";
        try (Connection conn = DBConnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getFirst_Name());
            pstmt.setString(2, student.getLast_Name());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // Retrieves all student records from the database and returns them as a list.
    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students;";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                students.add(new Student(rs.getInt("Student_ID"), rs.getString("First_Name"), rs.getString("Last_Name")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }
    
    // Updates an existing student record in the database based on the student ID.
    public static void updateStudent(int Student_ID, String First_Name, String Last_Name) {
        String sql = "UPDATE students SET First_Name = ?, Last_Name = ? WHERE Student_ID = ?;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, First_Name);
            pstmt.setString(2, Last_Name);
            pstmt.setInt(3, Student_ID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Deletes a student record from the database based on the student ID.
    public static void deleteStudentById(int Student_ID) {
        String sql = "DELETE FROM students WHERE Student_ID = ?;";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Student_ID);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}