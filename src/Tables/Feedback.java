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
public class Feedback {
    private int feedbackId;
    private int studentId;
    private int courseId;
    private Date feedbackDate;
    private String feedbackComment;
    private int feedbackRating;

    // Constructor
    public Feedback(int feedbackId, int studentId, int courseId, Date feedbackDate, String feedbackComment, int feedbackRating) {
        this.feedbackId = feedbackId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.feedbackDate = feedbackDate;
        this.feedbackComment = feedbackComment;
        this.feedbackRating = feedbackRating;
    }

    // Getters and Setters
    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
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

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getFeedbackComment() {
        return feedbackComment;
    }

    public void setFeedbackComment(String feedbackComment) {
        this.feedbackComment = feedbackComment;
    }

    public int getFeedbackRating() {
        return feedbackRating;
    }

    public void setFeedbackRating(int feedbackRating) {
        this.feedbackRating = feedbackRating;
    }
}


