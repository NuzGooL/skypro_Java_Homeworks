package com.homework6.ListsSets;

import java.util.List;

public interface EmployeeService {
    void add(String firstName, String lastName);

    List<Employee> getStaffBook();

    String hello();

    void remove(String firstName, String lastName);

    int find(String firstName, String lastName);
}
