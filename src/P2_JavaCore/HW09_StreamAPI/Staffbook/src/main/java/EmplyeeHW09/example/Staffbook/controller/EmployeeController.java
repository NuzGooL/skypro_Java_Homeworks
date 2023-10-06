package EmplyeeHW09.example.Staffbook.controller;

import EmplyeeHW09.example.Staffbook.model.Employee;
import EmplyeeHW09.example.Staffbook.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    private final EmployeeService employeeService;

    @GetMapping()
    public String hello() {
        return employeeService.hello();
    }

    @GetMapping(path = "/book")
    public Collection<Employee> book() {
        return employeeService.getStaffBook();
    }
}