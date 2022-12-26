package by.tms.employee.models;

import java.util.List;

public interface ReportAware {
    void generateReport(List<Employee> employees);
}
