package pro.sky.java.course2;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee("пеАтя", Department.DEP1, 10000_00);
        employeeBook.addEmployee("ваАса", Department.DEP2, 10000_00);
        employeeBook.addEmployee("корАа", Department.DEP5, 20000_00);
        System.out.println(employeeBook);
    }
}