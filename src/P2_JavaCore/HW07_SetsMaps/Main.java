package P2_JavaCore.HW07_SetsMaps;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
        printOdd(nums);
    }

    private static void printOdd(List<Integer> listInteger) {
        for (Integer i : listInteger) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        List<Integer> nums = new ArrayList<>(List.of(10, 11, 12, 3, 4, 4, 5, 5, 6, 7));
        System.out.println(nums);
        printEven(nums);
    }

    private static void printEven(List<Integer> listInteger) {
        SortedSet<Integer> set = new TreeSet<>(listInteger);
        for (Integer i : set) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        List<String> words = new ArrayList<>(List.of("слово1", "слово1", "слово3", "слово4", "слово5", "слово10", "слово3", "слово2", "слово4", "слово4"));
        System.out.println(words);
        printDiffWords(words);
    }

    private static void printDiffWords(List<String> listString) {
        Set<String> set = new TreeSet<>(listString);
        for (String i : set) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println(strings);
        System.out.println(wordNumberMap(strings));
    }

    private static Map<String, Integer> wordNumberMap(List<String> listString) {
        Map<String, Integer> wordNumberMap = new HashMap<>();
        for (String i : listString) {
            wordNumberMap.merge(i, 1, Integer::sum);
        }
        return wordNumberMap;
    }
}