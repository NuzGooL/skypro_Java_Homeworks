package P2_JavaCore.HW08_CollectionsImplementations;

import java.util.Objects;

public class Employee {
    private String fullName;
    private Department department;
    private int salary;
    private int id;
    private static int counter = 0;

    protected Employee(String fullName, Department department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    protected void FakeEmployee(String fullName, Department department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFullName(), employee.getFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFullName());
    }

    public String getFullName() {
        return fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s, отдел %s, зарплата %,dр %02dк, id=%d", fullName, department, salary / 100, salary % 100, id);
    }
}
