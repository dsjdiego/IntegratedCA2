/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

import java.util.Date;

/**
 *
 * @author User
 */
public class Enrollment {
    private int enrollmentId;
    private int studentId;
    private int courseId;
    private int lecturerId;
    private Date enrollmentDue;
    private Date enrollmentFinish;

    // Constructor
    public Enrollment(int enrollmentId, int studentId, int courseId, int lecturerId, Date enrollmentDue, Date enrollmentFinish) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.lecturerId = lecturerId;
        this.enrollmentDue = enrollmentDue;
        this.enrollmentFinish = enrollmentFinish;
    }

    // Getters and Setters
    public int getEnrollmentId() { 
        return enrollmentId; 
    }
    
    public void setEnrollmentId(int enrollmentId) { 
        this.enrollmentId = enrollmentId; 
    }

    public int getStudentId() { 
        return studentId; 
    }
    
    public void setStudentId(int studentId) { 
        this.studentId = studentId; 
    }

    public int getCourseId() { 
        return courseId; 
    }
    
    public void setCourseId(int courseId) { 
        this.courseId = courseId; 
    }

    public int getLecturerId() { 
        return lecturerId; 
    }
    
    public void setLecturerId(int lecturerId) { 
        this.lecturerId = lecturerId; 
    }

    public Date getEnrollmentDue() { 
        return enrollmentDue; 
    }
    
    public void setEnrollmentDue(Date enrollmentDue) { 
        this.enrollmentDue = enrollmentDue; 
    }

    public Date getEnrollmentFinish() { 
        return enrollmentFinish; 
    }
    
    public void setEnrollmentFinish(Date enrollmentFinish) { 
        this.enrollmentFinish = enrollmentFinish; 
    }
  }
  
