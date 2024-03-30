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
public class CSVReportExporter implements ReportExporter {
    
    // Overrides the exportReport method from the ReportExporter interface.
    @Override
    public void exportReport(List<ReportData> reportData, String filePath) {
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write("ID,First Name,Last Name\n");
                for (ReportData data : reportData) {
                    writer.write(data.toString() + "\n");
                }
                System.out.println("Report exported successfully to " + filePath);
            } catch (IOException e) {
                System.out.println("Error exporting report: " + e.getMessage());
            }
        }
    }


