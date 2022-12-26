package by.tms.employee.models;

import java.util.Arrays;
import java.util.List;

public class Report implements ReportAware {
    @Override
    public void generateReport(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.printf("| %-20s | %20.2f | \n", getAbbreviatedName(employee.getFullName()), employee.getSalary());
        }
    }

    private String getAbbreviatedName(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringsArray = string.split(" ");
        for (String s : stringsArray) {
            stringBuilder.append(s.toCharArray()[0]).append(". ");
        }
        stringBuilder.append(stringsArray[stringsArray.length - 1]);
        return Arrays.toString(stringsArray);
    }
}
