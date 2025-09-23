package _250714_Calculator;

import java.util.ArrayList;
import java.util.Scanner;

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
        //Source : https://youtube.com/shorts/euAFE0TgrBE?si=n-dpz2-OG6_dpT2L
        double t;
        double result = inputNumber / 2;
        do {
            t = result;
            result = (t + (inputNumber / t)) / 2;
        }
        while (t - result != 0);
        {
            return result;
        }
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

    public String integral(ArrayList<Double> inputNumbers) {
//  SOURCE https://turingmakinesi.wordpress.com/2017/03/21/bir-fonksiyonun-turev-ve-integralini-alan-java-programi/
        double coefficient = inputNumbers.get(0);
        double power = inputNumbers.get(1);

        double a, b, h, result = 0, x, F, F_first, F_end;
        String answer="";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the beginning 'X' value of the integral function");
        a = scanner.nextDouble();
        System.out.println("Please enter the last 'X' value of the integral function");
        b = scanner.nextDouble();
        h = 0.0001;
        for (x = a + h; x <= b; x += h) {
            F = power(x, power);
            F = F * coefficient;
            result = result + F * h;
        }
        F_first = power(a,power);
        F_first=F_first*coefficient;
        F_end = power(b,power);
        F_end=F_end*coefficient;
        result = result+h/2*(F_first+F_end);
        answer =("x= "+a+" and "+b+" between, integral value is : "+(int)result);
        return answer;
    }

    public static double power(double a, double b) {
        double pow = a;
        for (int i = 1; i <= b; i++) {
            pow *= a;
        }
        return pow;

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

    public int absolute(int inputNumber) {
        int result = inputNumber;
        ;
        if (inputNumber < 0) {
            result = -inputNumber;
        }
        return result;
    }
}