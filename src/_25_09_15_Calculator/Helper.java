package _25_09_15_Calculator;

import java.util.List;
import java.util.Scanner;

public class Helper {
    static Scanner scanner = new Scanner(System.in);
List<Integer> numberList = new ArrayList<>();
    public static int scanInput(){
        System.out.println("Please enter a number");
return scanner.nextInt();
}
public static List<Integer> createTwoNumberList(){
    numberList.add(scanInput());
    numberList.add(scanInput());
    return numberList;
}
}
