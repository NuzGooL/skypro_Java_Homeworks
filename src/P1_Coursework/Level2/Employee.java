package P1_Coursework.Level2;

public class Employee {
    private String fullName;
    private Department department;
    private int salary;
    private int id;
    private static int counter = 0;

    public Employee(String fullName, Department department, int salary) {
        this.fullName = fullName;
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

    public int getCounter() {
        return counter;
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