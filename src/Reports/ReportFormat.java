/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

import java.util.List;

/**
 *
 * @author User
 */
public interface ReportFormat {
    void generateReport(List<String> data);
    void saveReport(String fileName);
}