/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author User
 */

// This class is specifically designed to format and save reports as text files.
public class TXTReportFormat implements ReportFormat {
    private List<String> data;

    // This method is intended to prepare or set the report's data before saving it to a file.
    @Override
    public void generateReport(List<String> data) {
        this.data = data;
    }

    // This method is responsible for writing the report's data to a file
    @Override
    public void saveReport(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String line : data) {
                writer.write(line + "\n");
            }
            System.out.println("TXT report saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the TXT report: " + e.getMessage());
        }
    }
}