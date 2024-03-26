/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package users;

import Reports.CourseReportGenerator;
import Reports.LecturerReportGenerator;
import Reports.ReportGenerator;
import Reports.StudentReportGenerator;

/**
 *
 * @author User
 */
public class Office extends User {
    
    public Office(String username, String password) {
        super(username, password, "Office");
    }

    // Office-specific functionality
    public void generateReports(String reportType) {
    ReportGenerator reportGenerator;
    switch (reportType) {
        case "Course" -> reportGenerator = new CourseReportGenerator();
        case "Student" -> reportGenerator = new StudentReportGenerator();
        case "Lecturer" -> reportGenerator = new LecturerReportGenerator();
        default -> {
            System.out.println("Invalid report type");
            return;
            }
    }
    reportGenerator.generateReport();
  }
}
    