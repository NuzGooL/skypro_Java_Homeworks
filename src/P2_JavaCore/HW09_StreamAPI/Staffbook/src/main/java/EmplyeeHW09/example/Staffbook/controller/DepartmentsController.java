package EmplyeeHW09.example.Staffbook.controller;

import EmplyeeHW09.example.Staffbook.model.Employee;
import EmplyeeHW09.example.Staffbook.service.DepartmentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/employee/departments")
public class DepartmentsController {
    public DepartmentsController(DepartmentsService departmentsService) {
        this.departmentsService = departmentsService;
    }

    private final DepartmentsService departmentsService;

    @GetMapping()
    public String hello() {
        return departmentsService.hello();
    }

    @GetMapping(path = "/max-salary")
    public Optional<Employee> maxSalaryDepartmentAny(@RequestParam("departmentId") int departmentId) {
        return departmentsService.maxSalaryDepartmentAny(departmentId);
    }

    @GetMapping(path = "/min-salary")
    public Optional<Employee> minSalaryDepartmentAny(@RequestParam("departmentId") int departmentId) {
        return departmentsService.minSalaryDepartmentAny(departmentId);
    }

    @GetMapping(path = "/all", params = "departmentId")
    public Collection<Employee> allDep(@RequestParam("departmentId") int departmentId) {
        return departmentsService.allDep(departmentId);
    }

    @GetMapping(path = "/all")
    public Collection<Employee> allbyDep() {
        return departmentsService.allbyDep();
    }
}