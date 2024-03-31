/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

/**
 *
 * @author User
 */
public class Grade {
    private int Grades_ID;
    private int Enrollment_ID;
    private String Grade;

    // Constructor
    public Grade(int Grades_ID, int Enrollment_ID, String Grade) {
        this.Grades_ID = Grades_ID;
        this.Enrollment_ID = Enrollment_ID;
        this.Grade = Grade;
    }

    // Getter and Setter
    public int getGrades_ID() { 
        return Grades_ID; 
    }
    
    public void setGrades_ID(int Grades_ID) { 
        this.Grades_ID = Grades_ID; 
    }

    public int getEnrollment_ID() { 
        return Enrollment_ID; 
    }
    
    public void setEnrollment_ID(int Enrollment_ID) {
        this.Enrollment_ID = Enrollment_ID; 
    }

    public String getGrade() {
        return Grade; 
    }
    
    public void setGrade(String Grade) {
        this.Grade = Grade; 
    }
}

