package EmplyeeHW09.example.Staffbook.controller;

import EmplyeeHW09.example.Staffbook.model.Employee;
import EmplyeeHW09.example.Staffbook.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public String hello() {
        return employeeService.hello();
    }

    @GetMapping(path = "/book")
    public Collection<Employee> book() {
        return employeeService.getStaffBook();
    }

    @GetMapping(path = "/departments/max-salary")
    public Optional<Employee> maxSalaryDepartmentAny(@RequestParam("departmentId") int departmentId) {
        return employeeService.maxSalaryDepartmentAny(departmentId);
    }

    @GetMapping(path = "/departments/min-salary")
    public Optional<Employee> minSalaryDepartmentAny(@RequestParam("departmentId") int departmentId) {
        return employeeService.minSalaryDepartmentAny(departmentId);
    }

    @GetMapping(path = "/departments/all", params = "departmentId")
    public Collection<Employee> allDep(@RequestParam("departmentId") int departmentId) {
        return employeeService.allDep(departmentId);
    }

    @GetMapping(path = "/departments/all")
    public Collection<Employee> allbyDep() {
        return employeeService.allbyDep();
    }
}