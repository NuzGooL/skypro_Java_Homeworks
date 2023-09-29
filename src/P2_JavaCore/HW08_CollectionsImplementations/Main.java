package P2_JavaCore.HW08_CollectionsImplementations;

import static P2_JavaCore.HW08_CollectionsImplementations.Department.*;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(3);
        System.out.println(employeeBook);
        employeeBook.addEmployee("ФИО1", DEP1, 10000_00);
        System.out.println("Сделали:    employeeBook.addEmployee(\"ФИО1\",DEP1,10000_00);");
        System.out.println(employeeBook);
        //employeeBook.addEmployee("ФИО1",DEP1,10000_00);
        employeeBook.addEmployee("ФИО2", DEP1, 10000_00);
        System.out.println(employeeBook);
        employeeBook.addEmployee("ФИО3", DEP1, 10000_00);
        //employeeBook.addEmployee("ФИО4",DEP1,10000_00);

        employeeBook.deleteEmployee("ФИО3");
        System.out.println(employeeBook);
        //employeeBook.deleteEmployee("ФИО3");
        employeeBook.deleteEmployee("ФИО2");
        employeeBook.deleteEmployee("ФИО1");
        System.out.println(employeeBook);
        //employeeBook.deleteEmployee("ФИО1");

        System.out.println(employeeBook.isHereEmployee("ФИО1"));
        employeeBook.addEmployee("ФИО1", DEP1, 10000_00);
        System.out.println(employeeBook.isHereEmployee("ФИО1"));
    }
}