package by.tms.employee.services;

import by.tms.employee.models.Employee;
import by.tms.employee.models.Report;
import by.tms.employee.models.ReportAware;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иванов Иван Иванович", 200.865161));
        employees.add(new Employee("Петров Петр Петрович", 1000.8));
        employees.add(new Employee("Сергеев Сергей Сергеевич", 456.865));
        employees.add(new Employee("Павлов Павел Павлович", 4500.86));
        employees.add(new Employee("Александров Александр Александрович", 2561.8661));
        ReportAware reportAware = new Report();
        reportAware.generateReport(employees);
    }
}
