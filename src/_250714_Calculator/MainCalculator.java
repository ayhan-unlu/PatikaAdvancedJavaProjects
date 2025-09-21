package _250714_Calculator;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Helper.mainMenu();
        int selection = input.nextInt();
        Helper helper = new Helper();
        helper.selectCalculation(selection);
    }
}