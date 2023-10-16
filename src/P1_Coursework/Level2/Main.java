package P1_Coursework.Level2;

import java.util.Arrays;

import static P1_Coursework.Level2.Department.*;

public class Main {
    private static Employee[] staffBook = new Employee[10];

    public static void main(String[] args) {

        staffBook[0] = new Employee("ФИО0", DEP1, 14_000_00);
        staffBook[1] = new Employee("ФИО1", DEP1, 16_000_00);
        staffBook[2] = new Employee("ФИО2", DEP1, 14_000_00);
        staffBook[3] = new Employee("ФИО3", DEP3, 15_000_00);
        staffBook[4] = new Employee("ФИО4", DEP3, 16_000_00);
        staffBook[5] = new Employee("ФИО5", DEP4, 14_500_00);

        System.out.println("\n1. Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("Индексируем");
        EmployeeService.increaseSalary(staffBook, 11.11111);
        System.out.println(EmployeeService.toString(staffBook));

        System.out.println("\n2а. Получить в качестве параметра номер отдела и найти сотрудника с минимальной зарплатой.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("Arrays.toString(EmployeeService.minimumDepartmentSalary(staffBook, DEP1)) = " + Arrays.toString(EmployeeService.minimumDepartmentSalary(staffBook, DEP1)));
        System.out.println("Arrays.toString(EmployeeService.minimumDepartmentSalary(staffBook, DEP2)) = " + Arrays.toString(EmployeeService.minimumDepartmentSalary(staffBook, DEP2)));

        System.out.println("\n2b. Получить в качестве параметра номер отдела и найти сотрудника с максимальной зарплатой.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("Arrays.toString(EmployeeService.maximumDepartmentSalary(staffBook, DEP1)) = " + Arrays.toString(EmployeeService.maximumDepartmentSalary(staffBook, DEP1)));

        System.out.println("\n2c. Получить в качестве параметра номер отдела и найти cумму затрат на зарплату по отделу.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("EmployeeService.totalDepartmentSalary(staffBook, DEP3) = " + EmployeeService.totalDepartmentSalary(staffBook, DEP3));
        System.out.println("EmployeeService.totalDepartmentSalary(staffBook, DEP5) = " + EmployeeService.totalDepartmentSalary(staffBook, DEP5));

        System.out.println("\n2d. Получить в качестве параметра номер отдела и найти cреднюю зарплату по отделу.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("EmployeeService.averageDepartmentSalary(staffBook, DEP3) = " + EmployeeService.averageDepartmentSalary(staffBook, DEP3));
        System.out.println("EmployeeService.averageDepartmentSalary(staffBook, DEP5) = " + EmployeeService.averageDepartmentSalary(staffBook, DEP5));

        System.out.println("\n2e. Получить в качестве параметра номер отдела и проиндексировать зарплату всех сотрудников отдела на процент.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("индексируем DEP3");
        EmployeeService.increaseDepartmentSalary(staffBook, DEP3, 33.2211);
        System.out.println(EmployeeService.toString(staffBook));

        System.out.println("\n2f. Получить в качестве параметра номер отдела и напечатать всех сотрудников отдела (все данные, кроме отдела).");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("Печатаем отдел 3");
        EmployeeService.printDepartment(staffBook,DEP3);
        System.out.println("Печатаем отдел 5");
        EmployeeService.printDepartment(staffBook,DEP5);

        System.out.println("\n3a. Получить в качестве параметра число и найти всех сотрудников с зарплатой меньше числа (вывести id, Ф.И.О. и зарплатой в консоль).");
        System.out.println(EmployeeService.toString(staffBook));
        int parametr = 18_000_00;
        System.out.println("parametr = " + parametr);
        EmployeeService.printAllLessSalary(staffBook,parametr);
        parametr = 10_000_00;
        System.out.println("parametr = " + parametr);
        EmployeeService.printAllLessSalary(staffBook,parametr);

        System.out.println("\n3b. Получить в качестве параметра число и найти всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).");
        System.out.println(EmployeeService.toString(staffBook));
        parametr = 25_000_00;
        System.out.println("parametr = " + parametr);
        EmployeeService.printAllMoreSalary(staffBook,parametr);
        parametr = 16_000_00;
        System.out.println("parametr = " + parametr);
        EmployeeService.printAllMoreSalary(staffBook,parametr);
    }
}