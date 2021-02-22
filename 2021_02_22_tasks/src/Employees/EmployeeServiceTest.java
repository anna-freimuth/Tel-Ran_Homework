package Employees;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    Employee employee1 = new Employee("Max", 20L);
    Employee employee2 = new Employee("Eva", 10L);
    Employee employee3 = new Employee("Tom", 5L);
    Employee employee4 = new Employee("Lera", 1L);

    List<Employee> employeesList = Arrays.asList(employee1, employee4);
    List<Employee> employeesList2 = Arrays.asList(employee2, employee3);

    Department department1 = new Department("Random", "12", employeesList);
    Department department2 = new Department("Random", "12", employeesList);
    Department department3 = new Department("North", "10", employeesList2);
    Department department4 = new Department("South", "10", employeesList2);

    List<Department> departmentList = Arrays.asList(department1, department2, department3, department4);

    @Test
    public void countEmployees_test1() {
        EmployeeService employeeService = new EmployeeService();

        int result = employeeService.countEmployees(departmentList, 10L, "Nor");
        assertEquals(1, result);
    }

    @Test
    public void countEmployees_test2() {
        EmployeeService employeeService = new EmployeeService();

        int result = employeeService.countEmployees(departmentList, 5L, "Ra");
        assertEquals(2, result);
    }
}
