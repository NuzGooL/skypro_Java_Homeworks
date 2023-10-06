package EmplyeeHW09.example.Staffbook.service;

import EmplyeeHW09.example.Staffbook.Exceptions.ImpossibleDepartmentID;
import EmplyeeHW09.example.Staffbook.model.Department;
import EmplyeeHW09.example.Staffbook.model.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static EmplyeeHW09.example.Staffbook.service.EmployeeServiceImp.staffBook;

@Service
public class DepartmentsServiceImp implements DepartmentsService {
    @Override
    public String hello() {
        return "Добро пожаловать в департмятор";
    }

    @Override
    public Optional<Employee> maxSalaryDepartmentAny(int departmentId) {
        checkID(departmentId);
        return staffBook.getEmployeeBook().values().stream()
                .filter(employee -> employee.getDepartment().ordinal() == departmentId)
                .max(Comparator.comparing(Employee::getSalary));
    }

    @Override
    public Optional<Employee> minSalaryDepartmentAny(int departmentId) {
        checkID(departmentId);
        return staffBook.getEmployeeBook().values().stream()
                .filter(employee -> employee.getDepartment().ordinal() == departmentId)
                .min(Comparator.comparing(Employee::getSalary));
    }

    @Override
    public Collection<Employee> allDep(int departmentId) {
        checkID(departmentId);
        return staffBook.getEmployeeBook().values().stream()
                .filter(employee -> employee.getDepartment().ordinal() == departmentId)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Collection<Employee> allbyDep() {
        return staffBook.getEmployeeBook().values().stream()
                .sorted(Comparator.comparing(Employee::getDepartment))
                .collect(Collectors.toUnmodifiableList());
    }

    private static void checkID(int departmentId) {
        if (departmentId < 0 || departmentId > Department.values().length - 1) {
            throw new ImpossibleDepartmentID("Введен некорректный номер отдела");
        }
    }
}