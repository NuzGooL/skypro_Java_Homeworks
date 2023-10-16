package P1_Coursework.Level1;

public class EmployeeService {

    public static String toString(Employee[] stafbook) {
        String string = null;
        for (int i = 0; i < stafbook.length; i++) {
            if (stafbook[i] != null)
                if (string == null) {
                    string = "[" + i + "] " + stafbook[i];
                } else {
                    string += "\n" + "[" + i + "] " + stafbook[i];
                }
        }
        return string;
    }

    public static int totalSalary(Employee[] staffbook) {
        int totalSalary = 0;
        for (Employee employee : staffbook) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static int[] minimumSalary(Employee[] stafbook) {
        int minimumSalary = Integer.MAX_VALUE;
        int counter = 0;
        for (Employee employee : stafbook) {
            if (employee != null && minimumSalary > employee.getSalary()) {
                minimumSalary = employee.getSalary();
            }
        }
        for (Employee employee : stafbook) {
            if (employee != null && minimumSalary == employee.getSalary()) {
                counter++;
            }
        }
        int[] out = new int[counter];
        int i = 0;
        for (Employee employee : stafbook) {
            if (employee != null && minimumSalary == employee.getSalary()) {
                out[i++] = employee.getId();
            }
        }
        return out;
    }

    public static int[] maximumSalary(Employee[] stafbook) {
        int maximumSalary = 0;
        int counter = 0;
        for (Employee employee : stafbook) {
            if (employee != null && maximumSalary < employee.getSalary()) {
                maximumSalary = employee.getSalary();
            }
        }
        for (Employee employee : stafbook) {
            if (employee != null && maximumSalary == employee.getSalary()) {
                counter++;
            }
        }
        int[] out = new int[counter];
        int i = 0;
        for (Employee employee : stafbook) {
            if (employee != null && maximumSalary == employee.getSalary()) {
                out[i++] = employee.getId();
            }
        }
        return out;
    }

    public static double averageSalary(Employee[] stafbook) {
        int count = 0;
        for (Employee employee : stafbook) {
            if (employee != null) {
                count++;
            }
        }
        if (count == 0) return 0;
        return (double) totalSalary(stafbook) / count;
    }

    public static void printAllFullNames(Employee[] staffbook) {
        int i = 0;
        for (Employee employee : staffbook) {
            if (employee != null) {
                System.out.println(++i + ") " + employee.getFullName());
            }
        }
        if (i == 0) {
            System.out.println("Cписок сотрудников пуст");
        }
    }
}