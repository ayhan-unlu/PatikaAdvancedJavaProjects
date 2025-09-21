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
        for(int i=1; i<=input2;i++){
            result*=input1;}
        return result;
    }
    public double squareRoot(ArrayList<Double> inputNumbers) {
        double input1 = inputNumbers.get(0);
        double input2 = inputNumbers.get(1);
        result = 1;
        for(int i=1; i<=input2;i++){
            result*=input1;}
        return result;
    }


}
