package P2_JavaCore.HW08_CollectionsImplementations;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employeeBook;
    private int totalPages;

    public EmployeeBook(int totalPages) {
        if (totalPages < 0) {
            throw new IllegalArgumentException("Число записей в книге не может быть отрицательным");
        }
        if (totalPages < 1) {
            throw new IllegalArgumentException("В книге должна быть хотя бы одна страница");
        }
        this.totalPages = totalPages;
        employeeBook = new HashMap<>();
    }

    public void addEmployee(String fullName, Department department, int salary) {
        if (employeeBook.containsKey(fullName)) {
            throw new RuntimeException("Сотрудник уже существует");
        } else if (employeeBook.size() == totalPages) {
            throw new RuntimeException("В книге нет свободных записей");
        } else employeeBook.put(fullName, new Employee(fullName, department, salary));
    }

    public void deleteEmployee(String fullName) {
        if (employeeBook.isEmpty()) {
            throw new RuntimeException("Книга пуста");
        }
        if (employeeBook.remove(fullName) == null) {
            throw new RuntimeException("Такого сотрудника не было");
        }
    }

    public boolean isHereEmployee(String fullName) {
        return employeeBook.containsKey(fullName);
    }

    @Override
    public String toString() {
        if (employeeBook == null) {
            return "Книга пуста";
        }
        return employeeBook.toString();
    }
}