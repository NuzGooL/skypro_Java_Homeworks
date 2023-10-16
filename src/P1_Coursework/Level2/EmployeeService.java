package P1_Coursework.Level2;

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

    public static int totalSalary(Employee[] stafbook) {
        int totalSalary = 0;
        for (Employee employee : stafbook) {
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
    }

    public static void increaseSalary(Employee[] staffbook, double percent) {
        for (Employee employee : staffbook) {
            if (employee != null) {
                employee.setSalary((employee.getSalary() + (int) Math.round(employee.getSalary() * percent / 100)));
            }
        }
    }

    public static int[] minimumDepartmentSalary(Employee[] stafbook, Department department) {
        int minimumSalary = Integer.MAX_VALUE;
        int counter = 0;
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department && minimumSalary > employee.getSalary()) {
                minimumSalary = employee.getSalary();
            }
        }
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department && minimumSalary == employee.getSalary()) {
                counter++;
            }
        }
        int[] out = new int[counter];
        int i = 0;
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department && minimumSalary == employee.getSalary()) {
                out[i++] = employee.getId();
            }
        }
        return out;
    }

    public static int[] maximumDepartmentSalary(Employee[] stafbook, Department department) {
        int maximumSalary = 0;
        int counter = 0;
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department && maximumSalary < employee.getSalary()) {
                maximumSalary = employee.getSalary();
            }
        }
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department && maximumSalary == employee.getSalary()) {
                counter++;
            }
        }
        int[] out = new int[counter];
        int i = 0;
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department && maximumSalary == employee.getSalary()) {
                out[i++] = employee.getId();
            }
        }
        return out;
    }

    public static int totalDepartmentSalary(Employee[] stafbook, Department department) {
        int totalSalary = 0;
        for (Employee employee : stafbook) {
            if (employee != null && employee.getDepartment() == department) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public static double averageDepartmentSalary(Employee[] staffbook, Department department) {
        int count = 0;
        for (Employee employee : staffbook) {
            if (employee != null && employee.getDepartment() == department) {
                count++;
            }
        }
        if (count == 0) return 0;
        return (double) totalDepartmentSalary(staffbook, department) / count;
    }

    public static void increaseDepartmentSalary(Employee[] staffbook, Department department, double percent) {
        for (Employee employee : staffbook) {
            if (employee != null && employee.getDepartment() == department) {
                employee.setSalary((employee.getSalary() + (int) Math.round(employee.getSalary() * percent / 100)));
            }
        }
    }

    public static void printDepartment(Employee[] stafbook, Department department) {
        String string = null;
        for (int i = 0; i < stafbook.length; i++) {
            if (stafbook[i] != null && stafbook[i].getDepartment() == department)
                if (string == null) {
                    string = "[" + i + "] " + String.format("%s, зарплата %,dр %02dк, id=%d", stafbook[i].getFullName(), stafbook[i].getSalary() / 100, stafbook[i].getSalary() % 100, stafbook[i].getId());
                } else {
                    string += "\n" + "[" + i + "] " + String.format("%s, зарплата %,dр %02dк, id=%d", stafbook[i].getFullName(), stafbook[i].getSalary() / 100, stafbook[i].getSalary() % 100, stafbook[i].getId());
                }
        }
        if (string != null) {
            System.out.println(string);
        } else {
            System.out.println("В отделе " + department + " нет сотрудников");
        }
    }

    public static void printAllMoreSalary(Employee[] stafbook, int salary) {
        String string = null;
        for (int i = 0; i < stafbook.length; i++) {
            if (stafbook[i] != null && stafbook[i].getSalary() >= salary)
                if (string == null) {
                    string = "[" + i + "] " + String.format("%s, зарплата %,dр %02dк, id=%d", stafbook[i].getFullName(), stafbook[i].getSalary() / 100, stafbook[i].getSalary() % 100, stafbook[i].getId());
                } else {
                    string += "\n" + "[" + i + "] " + String.format("%s, зарплата %,dр %02dк, id=%d", stafbook[i].getFullName(), stafbook[i].getSalary() / 100, stafbook[i].getSalary() % 100, stafbook[i].getId());
                }
        }
        if (string != null) {
            System.out.println(string);
        } else {
            System.out.printf("Сотрудников с зарплатой равной или выше %,dр %02dк нет\n", +salary / 100, salary % 100);
        }
    }

    public static void printAllLessSalary(Employee[] stafbook, int salary) {
        String string = null;
        for (int i = 0; i < stafbook.length; i++) {
            if (stafbook[i] != null && stafbook[i].getSalary() < salary)
                if (string == null) {
                    string = "[" + i + "] " + String.format("%s, зарплата %,dр %02dк, id=%d", stafbook[i].getFullName(), stafbook[i].getSalary() / 100, stafbook[i].getSalary() % 100, stafbook[i].getId());
                } else {
                    string += "\n" + "[" + i + "] " + String.format("%s, зарплата %,dр %02dк, id=%d", stafbook[i].getFullName(), stafbook[i].getSalary() / 100, stafbook[i].getSalary() % 100, stafbook[i].getId());
                }
        }
        if (string != null) {
            System.out.println(string);
        } else {
            System.out.printf("Сотрудников с зарплатой ниже %,dр %02dк нет\n", +salary / 100, salary % 100);
        }
    }
}