package _250711_QuickSort;

import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Anny", "Eddie", "Zack", "Dan", "Bill", "Peter", "Verde", "Nick", "ron");
        System.out.println("List before sorting");
        System.out.println("-------------------");
        nameList.forEach(System.out::println);
        nameList = Arrays.asList("Anny", "Eddie", "Zack", "Dan", "Bill", "Peter", "Verde", "Nick", "ron");

        System.out.println("List after sorting by stream");
        System.out.println("-------------------");
        nameList.stream().sorted().forEach(System.out::println);
        nameList = Arrays.asList("Anny", "Eddie", "Zack", "Dan", "Bill", "Peter", "Verde", "Nick", "ron");

        System.out.println("List after sorting by method reference");
        System.out.println("-------------------");
        nameList.sort((s1,s2)->s1.compareToIgnoreCase(s2));
        nameList.forEach(System.out::println);
        nameList = Arrays.asList("Anny", "Eddie", "Zack", "Dan", "Bill", "Peter", "Verde", "Nick", "ron");

        System.out.println("List after sorting by method reference");
        System.out.println("-------------------");
        nameList.sort(String::compareToIgnoreCase);
        nameList.forEach(System.out::println);
    }
}
