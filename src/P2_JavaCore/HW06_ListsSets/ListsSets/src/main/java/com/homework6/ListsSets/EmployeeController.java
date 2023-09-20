package com.homework6.ListsSets;

import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping(path = "/add")
    public Employee add(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        employeeService.add(firstName, lastName);
        return employeeService.getStaffBook().get(employeeService.getStaffBook().size() - 1);
    }

    @GetMapping(path = "/remove")
    public Employee remove(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        employeeService.remove(firstName, lastName);
        return new Employee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public Employee find(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
        return employeeService.getStaffBook().get(employeeService.find(firstName, lastName));
    }

    @GetMapping(path = "/book")
    public List<Employee> book() {
        return employeeService.getStaffBook();
    }
}