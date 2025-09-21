package _250714_Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
    ArrayList<Double> inputNumbers = new ArrayList<>();
    Calculation calculation = new Calculation();

    public static void mainMenu() {
        System.out.print("1.Addition \t\t\t");
        System.out.println("2.Subtraction ");
        System.out.print("3.Multiplication \t");
        System.out.println("4.Division ");
        System.out.print("5.Exponentiation \t");
        System.out.println("6.Square Root ");
        System.out.print("7.Derivative \t\t");
        System.out.println("8.Integral ");
        System.out.print("9.Factorial \t\t");
        System.out.println("10.Mode ");
        System.out.println("11.Absolute Value \t");
        System.out.println("Please Enter your choice:");
    }

    public static ArrayList<Double> getInputNumbers(ArrayList<Double> inputNumbers) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter The First Number:");
        double input1 = input.nextDouble();
        System.out.println("Please Enter The Second Number:");
        double input2 = input.nextDouble();
        inputNumbers.add(input1);
        inputNumbers.add(input2);
        return inputNumbers;
    }

    public void selectCalculation(int selection) {
        switch (selection) {
            case 1:
                System.out.println("Sum is " + calculation.sum(getInputNumbers(inputNumbers)));
                mainMenu();
            case 2:
                System.out.println("Subtraction is " + calculation.subtraction(getInputNumbers(inputNumbers)));
                mainMenu();
            case 3:
                System.out.println("Multiplication is " + calculation.multiplication(getInputNumbers(inputNumbers)));
                mainMenu();
            case 4:
                System.out.println("Division is " + calculation.division(getInputNumbers(inputNumbers)));
                mainMenu();
            case 5:
                System.out.println("Exponentiation is " + calculation.exponentiation(getInputNumbers(inputNumbers)));
                mainMenu();
            case 6:

        }
    }
}
