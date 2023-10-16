package EmplyeeHW09.example.Staffbook.service;

import EmplyeeHW09.example.Staffbook.model.Employee;

import java.util.Collection;

public interface EmployeeService {
    Collection<Employee> getStaffBook();

    String hello();
}