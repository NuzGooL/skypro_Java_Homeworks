package EmplyeeHW09.example.Staffbook.model;

import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private Map<String, Employee> employeeBook;
    private final int totalPages;

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

    public Map<String, Employee> getEmployeeBook() {
        return employeeBook;
    }

    @Override
    public String toString() {
        if (employeeBook == null) {
            return "Книга пуста";
        }
        return employeeBook.toString();
    }

    //Удалил все не относящиеся к задаче методы и заменил их заранее созданной книгой.
    public static EmployeeBook EmployeeBookPreset() {
        EmployeeBook employeeBook = new EmployeeBook(7);
        employeeBook.addEmployee("ФИО1", Department.DEP1, 10_000_00);
        employeeBook.addEmployee("ФИО2", Department.DEP2, 20_000_00);
        employeeBook.addEmployee("ФИО3", Department.DEP2, 20_000_00);
        employeeBook.addEmployee("ФИО4", Department.DEP2, 20_000_00);
        employeeBook.addEmployee("ФИО5", Department.DEP2, 20_000_00);
        employeeBook.addEmployee("ФИО6", Department.DEP1, 15_000_00);
        employeeBook.addEmployee("ФИО7", Department.DEP3, 13_000_00);
        return employeeBook;
    }
}