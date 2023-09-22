package com.homework6.ListsSets.service;

import com.homework6.ListsSets.model.Employee;

import java.util.List;

public interface EmployeeService {
    void add(String firstName, String lastName);

    List<Employee> getStaffBook();

    String hello();

    void remove(String firstName, String lastName);

    int find(String firstName, String lastName);
}
