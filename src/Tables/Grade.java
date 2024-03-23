/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

/**
 *
 * @author User
 */
public class Grade {
    private int gradesId;
    private int enrollmentId;
    private String grade;

    public Grade(int gradesId, int enrollmentId, String grade) {
        this.gradesId = gradesId;
        this.enrollmentId = enrollmentId;
        this.grade = grade;
    }

    public int getGradesId() { return gradesId; }
    public void setGradesId(int gradesId) { this.gradesId = gradesId; }

    public int getEnrollmentId() { return enrollmentId; }
    public void setEnrollmentId(int enrollmentId) { this.enrollmentId = enrollmentId; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

