package _250714_Calculator;

import java.util.ArrayList;

public class Calculation {
    private double input1;
    private double input2;
    private double result;

    public double sum(ArrayList<Double> inputNumbers) {

        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 0;
        result = input1 + input2;
        return result;
    }

    public double subtraction(ArrayList<Double> inputNumbers) {
        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 0;
        result = input1 - input2;
        return result;
    }

    public double multiplication(ArrayList<Double> inputNumbers) {
        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 1;
        result = input1 * input2;
        return result;
    }

    public double division(ArrayList<Double> inputNumbers) {
        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 1;
        result = input1 / input2;
        return result;
    }

    public double exponentiation(ArrayList<Double> inputNumbers) {
        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 1;
        for (int i = 1; i <= input2; i++) {
            result *= input1;
        }
        return result;
    }

    public double squareRoot(double inputNumber) {
        result = 1;
        if (inputNumber < 2) {
            result = inputNumber;
        }
        for (int i = 0; i < inputNumber / 2; i++) {
            if (i * i == inputNumber) {
                result = i;
                break;
            } else {
                System.out.println("Square Root is not an integer");
                break;
            }
        }
        return result;
    }

    public String derivative(int inputNumber) {
        String result = "";
        int degreeMultiplier = inputNumber;
        ArrayList<Integer> inputNumberList = Helper.getInputNumberList(inputNumber);
        for (int i = 1; i <= inputNumber; i++) {
            int currentCoefficient = inputNumberList.get(i - 1);

            if (degreeMultiplier > 0) {
                result += (currentCoefficient * degreeMultiplier) + " ";
                degreeMultiplier -= 1;
            }

        }
        return result;
    }

    public String integral(int inputNumber) {
        return "";
    }

    public int factorial(int inputNumber) {
        int result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result *= i;
        }
        return result;
    }

    public double mode(ArrayList<Double> inputNumbers) {
        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 0;

        while (input1 > input2) {
            input1 -= input2;
            result = input1;
        }
        return result;
    }

    public int absolute(int inputNumber){
        int result = inputNumber; ;
        if(inputNumber<0){
            result=-inputNumber;
        }
        return result;
    }
}