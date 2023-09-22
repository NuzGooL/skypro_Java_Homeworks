package com.homework6.ListsSets.service;

import com.homework6.ListsSets.model.Employee;
import com.homework6.ListsSets.Exceptions.EmployeeAlreadyAddedException;
import com.homework6.ListsSets.Exceptions.EmployeeNotFoundException;
import com.homework6.ListsSets.Exceptions.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {
    private final int maxPages = 3;
    private List<Employee> staffBook = new ArrayList<>();

    @Override
    public String hello() {
        return "Добро пожаловать в эмплойатор";
    }

    @Override
    public void add(String firstname, String lastname) {
        Employee addEmployee = new Employee(firstname, lastname);
        if (staffBook.contains(addEmployee)) {
            throw new EmployeeAlreadyAddedException("Уже есть такой сотрудник");
        }
        if (staffBook.size() == maxPages) {
            throw new EmployeeStorageIsFullException("Книга заполнена");
        }
        staffBook.add(addEmployee);
    }

    @Override
    public void remove(String firstname, String lastname) {
        Employee deleteEmployee = new Employee(firstname, lastname);
        if (!staffBook.remove(deleteEmployee)) {
            throw new EmployeeNotFoundException("Такого сотрудника и не было");
        }
    }

    @Override
    public int find(String firstname, String lastname) {
        Employee findEmployee = new Employee(firstname, lastname);
        if (!staffBook.contains(findEmployee)) {
            throw new EmployeeNotFoundException("Сотрудник не найден");
        }
        return staffBook.indexOf(findEmployee);
    }

    @Override
    public List<Employee> getStaffBook() {
        return Collections.unmodifiableList(staffBook);
    }
}