/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

/**
 *
 * @author User
 */
public class Course {
  private int Course_ID;
    private int Lecturer_ID;
    private String Course_Name;
    private String Course_Program;
    private String Course_Room;
    private boolean Is_Online;

    // Constructor
    public Course(int Course_ID, int Lecturer_ID, String Course_Name, String Course_Program, String Course_Room, boolean Is_Online) {
        this.Course_ID = Course_ID;
        this.Lecturer_ID = Lecturer_ID;
        this.Course_Name = Course_Name;
        this.Course_Program = Course_Program;
        this.Course_Room = Course_Room;
        this.Is_Online = Is_Online;
    }

    public Course() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and Setters
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

    public String getCourseName() {
        return Course_Name;
    }

    public void setCourseName(String Course_Name) {
        this.Course_Name = Course_Name;
    }

    public String getCourseProgram() {
        return Course_Program;
    }

    public void setCourseProgram(String Course_Program) {
        this.Course_Program = Course_Program;
    }

    public String getCourseRoom() {
        return Course_Room;
    }

    public void setCourseRoom(String Course_Room) {
        this.Course_Room = Course_Room;
    }

    public boolean isOnline() {
        return Is_Online;
    }

    public void setOnline(boolean Is_Online) {
        this.Is_Online = Is_Online;
    }
}

