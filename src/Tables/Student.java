/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tables;

/**
 *
 * author User
 */
public class Student {
    private int Student_ID;
    private String First_Name;
    private String Last_Name;
    
    // Constructor with three parameters
    public Student(int Student_ID, String First_Name, String Last_Name) {
        this.Student_ID = Student_ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }
    
    // Constructor with two String parameters
    public Student(String First_Name, String Last_Name) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }

    // Getter and Setter methods
    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public Object getGrade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
