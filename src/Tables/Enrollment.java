/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

//GITHUB LINK: https://github.com/dsjdiego/IntegratedCA2.git

import java.util.Date;

/**
 *
 * @author User
 */
public class Enrollment {
    private int Enrollment_ID;
    private int Student_ID;
    private int Course_ID;
    private int Lecturer_ID;
    private Date Enrollment_Due;
    private Date Enrollment_Finish;

    // Constructor
    public Enrollment(int Enrollment_ID, int Student_ID, int Course_ID, int Lecturer_ID, Date Enrollment_Due, Date Enrollment_Finish) {
        this.Enrollment_ID = Enrollment_ID;
        this.Student_ID = Student_ID;
        this.Course_ID = Course_ID;
        this.Lecturer_ID = Lecturer_ID;
        this.Enrollment_Due = Enrollment_Due;
        this.Enrollment_Finish = Enrollment_Finish;
    }

    // Getters and Setters
    public int getEnrollmentId() { 
        return Enrollment_ID; 
    }
    
    public void setEnrollmentId(int Enrollment_ID) { 
        this.Enrollment_ID = Enrollment_ID; 
    }

    public int getStudentId() { 
        return Student_ID; 
    }
    
    public void setStudentId(int Student_ID) { 
        this.Student_ID = Student_ID; 
    }

    public int getCourseId() { 
        return Course_ID; 
    }
    
    public void setCourseId(int Course_ID) { 
        this.Course_ID = Course_ID; 
    }

    public int getLecturerId() { 
        return Lecturer_ID; 
    }
    
    public void setLecturerId(int Lecturer_ID) { 
        this.Lecturer_ID = Lecturer_ID; 
    }

    public Date getEnrollmentDue() { 
        return Enrollment_Due; 
    }
    
    public void setEnrollmentDue(Date Enrollment_Due) { 
        this.Enrollment_Due = Enrollment_Due; 
    }

    public Date getEnrollmentFinish() { 
        return Enrollment_Finish; 
    }
    
    public void setEnrollmentFinish(Date Enrollment_Finish) { 
        this.Enrollment_Finish = Enrollment_Finish; 
    }
  }
  
