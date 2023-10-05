package EmplyeeHW09.example.Staffbook.service;

import EmplyeeHW09.example.Staffbook.model.Employee;

import java.util.Collection;
import java.util.Optional;

public interface EmployeeService {
    Collection<Employee> getStaffBook();

    String hello();

    Optional<Employee> maxSalaryDepartmentAny(int departmentId);

    Optional<Employee> minSalaryDepartmentAny(int departmentId);

    Collection<Employee> allDep(int departmentId);

    Collection<Employee> allbyDep();
}