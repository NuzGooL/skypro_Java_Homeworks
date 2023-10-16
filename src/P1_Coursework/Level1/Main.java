package P1_Coursework.Level1;

import java.util.Arrays;

import static P1_Coursework.Level1.Department.*;

public class Main {
    private static Employee[] staffBook = new Employee[10];

    public static void main(String[] args) {
        System.out.println("\n1-3,6,7.Создать класс Employee");
        staffBook[0] = new Employee("ФИО0", DEP1, 14_000_00);
        System.out.println(staffBook[0]);

        System.out.println("\n4.Геттеры");
        System.out.println("staffBook[0].getFullName() = " + staffBook[0].getFullName());
        System.out.println("staffBook[0].getDepartment() = " + staffBook[0].getDepartment());
        System.out.println("staffBook[0].getSalary() = " + staffBook[0].getSalary());
        System.out.println("staffBook[0].getId() = " + staffBook[0].getId());
        System.out.println("staffBook[0].getCounter() = " + staffBook[0].getCounter());

        System.out.println("\n5. Сеттеры");
        staffBook[0].setDepartment(DEP1);
        staffBook[0].setSalary(1500000);
        System.out.println(staffBook[0]);

        System.out.println("\n8a. Получить список всех сотрудников со всеми имеющимися по ним данными ");
        staffBook[1] = new Employee("ФИО1", DEP1, 14_000_00);
        staffBook[2] = new Employee("ФИО2", DEP1, 14_000_00);
        staffBook[3] = new Employee("ФИО3", DEP3, 15_000_00);
        staffBook[4] = new Employee("ФИО4", DEP3, 16_000_00);
        staffBook[5] = new Employee("ФИО5", DEP4, 14_500_00);
        System.out.println(EmployeeService.toString(staffBook));

        System.out.println("\n8b. Посчитать сумму затрат на зарплаты в месяц.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("EmployeeService.totalSalary(staffBook) = " + EmployeeService.totalSalary(staffBook));

        System.out.println("\n8c. Найти сотрудника с минимальной зарплатой.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("Arrays.toString(EmployeeService.minimumSalary(staffBook)) = " + Arrays.toString(EmployeeService.minimumSalary(staffBook)) + "    *(это массив id)");

        System.out.println("\n8d. Найти сотрудника с максимальной зарплатой.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("Arrays.toString(EmployeeService.maximumSalary(staffBook)) = " + Arrays.toString(EmployeeService.maximumSalary(staffBook)));

        System.out.println("\n8e. Подсчитать среднее значение зарплат.");
        System.out.println(EmployeeService.toString(staffBook));
        System.out.println("EmployeeService.averageSalary(staffBook) = " + EmployeeService.averageSalary(staffBook));

        System.out.println("\n8f. Получить Ф.И.О. всех сотрудников (вывести в консоль).");
        System.out.println(EmployeeService.toString(staffBook));
        EmployeeService.printAllFullNames(staffBook);
    }
}