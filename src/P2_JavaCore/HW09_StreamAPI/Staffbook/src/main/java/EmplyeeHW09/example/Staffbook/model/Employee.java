package EmplyeeHW09.example.Staffbook.model;

import java.util.Objects;

public class Employee {
    private final String fullname;
    private Department department;
    private int salary;

    public Employee(String fullname, Department department, int salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
    }
    public String getFullname() {
        return fullname;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFullname(), employee.getFullname());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFullname());
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}