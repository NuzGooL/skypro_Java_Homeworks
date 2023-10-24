package pro.sky.java.course2;

import org.apache.commons.lang3.StringUtils;

public class Employee {
    private String fullName;
    private Department department;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String fullName, Department department, int salary) {
        if (!StringUtils.containsOnly(fullName, "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ")) {
            throw new RuntimeException("400 BAD REQUEST");
        }
        this.fullName = StringUtils.capitalize(StringUtils.lowerCase(fullName));
        this.department = department;
        this.salary = salary;
        id = counter++;
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