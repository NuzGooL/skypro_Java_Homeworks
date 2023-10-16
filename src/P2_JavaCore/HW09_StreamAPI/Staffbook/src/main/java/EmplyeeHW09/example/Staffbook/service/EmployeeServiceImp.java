package EmplyeeHW09.example.Staffbook.service;

import EmplyeeHW09.example.Staffbook.model.Employee;
import EmplyeeHW09.example.Staffbook.model.EmployeeBook;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImp implements EmployeeService {
    protected static EmployeeBook staffBook = EmployeeBook.EmployeeBookPreset();

    @Override
    public String hello() {
        return "Добро пожаловать в эмплойатор";
    }

    @Override
    public Collection<Employee> getStaffBook() {
        return Collections.unmodifiableCollection(staffBook.getEmployeeBook().values());
    }
}