package P1_Coursework.Level3;

import java.util.Arrays;

import static P1_Coursework.Level3.Department.*;

public class Main {

    public static void main(String[] args) {

        //Проверка создания книги
        EmployeeBook employeeBooktest0 = new EmployeeBook(1);
        EmployeeBook employeeBooktest1 = new EmployeeBook(3);
        //EmployeeBook employeeBooktest2 = new EmployeeBook(0);
        //EmployeeBook employeeBooktest3 = new EmployeeBook(-1);


        //Проверка внесения новой записи
        EmployeeBook employeeBooktest4 = new EmployeeBook(3);
        employeeBooktest4.addEmployee("ФИО1", DEP1, 10000_00);
        employeeBooktest4.addEmployee("ФИО1", DEP1, 10000_00);
        employeeBooktest4.addEmployee("ФИО1", DEP1, 10000_00);
        // employeeBooktest.addEmployee("ФИО1",DEP1,10000_00);

        //toString
        EmployeeBook employeeBook = new EmployeeBook(10);
        employeeBook.addEmployee("ФИО1", DEP1, 10000_00);
        employeeBook.addEmployee("ФИО2", DEP2, 10000_00);
        employeeBook.addEmployee("ФИО3", DEP1, 20000_00);
        employeeBook.addEmployee("ФИО4", DEP5, 20000_00);
        System.out.println(employeeBook);


        System.out.println("employeeBook.totalSalary() = " + employeeBook.totalSalary());
        System.out.println("employeeBook.whoMinimumSalary() = " + Arrays.toString(employeeBook.whoMinimumSalary()));
        System.out.println("employeeBook.whoMaximumSalary() = " + Arrays.toString(employeeBook.whoMaximumSalary()));
        System.out.println("employeeBook.averageSalary() = " + employeeBook.averageSalary());
        employeeBook.printAllFullNames();

        System.out.println("employeeBook.increaseSalary(11);");
        employeeBook.increaseSalary(11);
        System.out.println(employeeBook);

        System.out.println("employeeBook.whoMinimumDepartmentSalary(DEP1) = " + Arrays.toString(employeeBook.whoMinimumDepartmentSalary(DEP1)));
        System.out.println("employeeBook.whoMaximumDepartmentSalary(DEP1) = " + Arrays.toString(employeeBook.whoMaximumDepartmentSalary(DEP1)));
        System.out.println("employeeBook.totalDepartmentSalary(DEP1) = " + employeeBook.totalDepartmentSalary(DEP1));
        System.out.println("employeeBook.averageDepartmentSalary(DEP1) = " + employeeBook.averageDepartmentSalary(DEP1));

        System.out.println("employeeBook.increaseDepartmentSalary(DEP1, 11.1);");
        employeeBook.increaseDepartmentSalary(DEP1, 11.1);
        System.out.println(employeeBook);

        System.out.println("employeeBook.printDepartment(DEP1);");
        employeeBook.printDepartment(DEP1);
        employeeBook.printDepartment(DEP4);

        System.out.println();
        System.out.println(employeeBook);
        System.out.println("employeeBook.printAllMoreSalary(15_000_00);");
        employeeBook.printAllMoreSalary(15_000_00);
        System.out.println("employeeBook.printAllMoreSalary(25_000_00);");
        employeeBook.printAllMoreSalary(25_000_00);
        System.out.println("employeeBook.printAllLessSalary(15_000_00);");
        employeeBook.printAllLessSalary(15_000_00);
        System.out.println("employeeBook.printAllLessSalary(10_000_00);");
        employeeBook.printAllLessSalary(10_000_00);


        System.out.println();
        System.out.println(employeeBook);
        System.out.println("Delete 5");
        employeeBook.deleteEmployee(5);
        System.out.println(employeeBook);
        //employeeBook.deleteEmployee(10);

        System.out.println();
        employeeBook.addEmployee("ФИО2", DEP4, 10_000_00);
        System.out.println(employeeBook);
        System.out.println("Delete ФИО2");
        employeeBook.deleteEmployee("ФИО2");
        System.out.println(employeeBook);
        //employeeBook.deleteEmployee("ФИО99");
        //employeeBook.deleteEmployee("ФИО1",4);
        employeeBook.deleteEmployee("ФИО1", 3);
        System.out.println("Delete ФИО1,3");
        System.out.println(employeeBook);

        System.out.println();
        employeeBook.addEmployee("ФИО1", DEP1, 10000_00);
        employeeBook.addEmployee("ФИО2", DEP2, 10000_00);
        employeeBook.addEmployee("ФИО3", DEP1, 20000_00);
        employeeBook.addEmployee("ФИО4", DEP5, 20000_00);
        System.out.println(employeeBook);
        System.out.println("DemployeeBook.rewriteByFullname(\"ФИО4\",DEP4);");
        employeeBook.rewriteByFullname("ФИО4", DEP4);
        System.out.println(employeeBook);

        System.out.println("employeeBook.rewriteByFullname(\"ФИО4\",30_000_00);");
        employeeBook.rewriteByFullname("ФИО4", 30_000_00);
        System.out.println(employeeBook);

        System.out.println("employeeBook.rewriteByFullname(\"ФИО4\",DEP5,33_000_00);");
        employeeBook.rewriteByFullname("ФИО4", DEP5, 33_000_00);
        System.out.println(employeeBook);

        System.out.println();
        employeeBook.printAlltDepartments();
        System.out.println("-----------------------");
        System.out.println(employeeBook);
        System.out.println("Отдел 1");
        System.out.println(Arrays.toString(employeeBook.whoEmployeesMaximumDepartmentSalary(DEP1)));
        System.out.println("Отдел 5");
        System.out.println(Arrays.toString(employeeBook.whoEmployeesMaximumDepartmentSalary(DEP5)));
        System.out.println("Отдел 4");
        System.out.println(Arrays.toString(employeeBook.whoEmployeesMaximumDepartmentSalary(DEP4)));
    }
}