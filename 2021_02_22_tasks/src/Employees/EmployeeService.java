package Employees;

import java.util.List;

public class EmployeeService {

    int countEmployees(List<Department> departments,long threshold, String codePrefix){
        return departments.stream()
                .filter(department -> department.name.startsWith(codePrefix))
                .mapToInt(department -> (int) department.employees.stream()
                        .filter(employee -> employee.salary >= threshold)
                        .count()
                )
                .sum();
    }
}
