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
public class Feedback {
    private int Feedback_ID;
    private int Student_ID;
    private int Course_ID;
    private Date Feedback_Date;
    private String Feedback_Comment;
    private int Feedback_Rating;

    // Constructor
    public Feedback(int Feedback_ID, int Student_ID, int Course_ID, Date Feedback_Date, String Feedback_Comment, int Feedback_Rating) {
        this.Feedback_ID = Feedback_ID;
        this.Student_ID = Student_ID;
        this.Course_ID = Course_ID;
        this.Feedback_Date = Feedback_Date;
        this.Feedback_Comment = Feedback_Comment;
        this.Feedback_Rating = Feedback_Rating;
    }

    // Getters and Setters
    public int getFeedback_ID() {
        return Feedback_ID;
    }

    public void setFeedback_ID(int Feedback_ID) {
        this.Feedback_ID = Feedback_ID;
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

    public int getCourse_ID() {
        return Course_ID;
    }

    public void setCourse_ID(int Course_ID) {
        this.Course_ID = Course_ID;
    }

    public Date getFeedback_Date() {
        return Feedback_Date;
    }

    public void setFeedback_Date(Date Feedback_Date) {
        this.Feedback_Date = Feedback_Date;
    }

    public String getFeedback_Comment() {
        return Feedback_Comment;
    }

    public void setFeedback_Comment(String Feedback_Comment) {
        this.Feedback_Comment = Feedback_Comment;
    }

    public int getFeedback_Rating() {
        return Feedback_Rating;
    }

    public void setFeedback_Rating(int Feedback_Rating) {
        this.Feedback_Rating = Feedback_Rating;
    }
}


