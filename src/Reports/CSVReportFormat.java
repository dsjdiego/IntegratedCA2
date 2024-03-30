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

public class CSVReportFormat implements ReportFormat {
    private List<String> data;

    // Overrides the generateReport method from the ReportFormat interface.
    @Override
    public void generateReport(List<String> data) {
        this.data = data;
    }

    // This method is responsible for saving the report data to a file with the given fileName.
    @Override
    public void saveReport(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String line : data) {
                writer.write(line + "\n");
            }
            System.out.println("CSV report saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the CSV report: " + e.getMessage());
        }
    }
}