/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reports;

/**
 *
 * @author User
 */
public class ReportContext {
    private ReportGenerator reportGenerator;

    public ReportContext(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void executeGenerateReport() {
        reportGenerator.generateReport();
    }
}
