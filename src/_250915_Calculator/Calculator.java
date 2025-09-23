package _250915_Calculator;

public class Calculator {
    public static void calculate() {
        int choice;
        boolean condition = true;
        while (condition) {
            System.out.println(" Please choose a calculation process:");
            System.out.println("1-Sum\n2-Subtract\n3-Multiple\n4-Divide\n5-Power\n6-RootSquare\n7-türev\n8-integral\n9-mode\n10-mutlak değer\n11-Exit");
            choice = Helper.scanInput();
            switch (choice) {
                case 1:
                    System.out.println("The sum of the two numbers =  " + BasicCalculation.sum(Helper.scanInput(), Helper.scanInput()));
                    // break;
/*
            case 2:
                BasicCalculation.subtract();
                break;

            case 3:
                BasicCalculation.multiple();
                break;

            case 4:
                BasicCalculation.divide();
                break;

            case 5:
                Power.power();
                break;

            case 6:
                RootSquare.rootSquare();
                break;

            case 7:
                Turev.turev();
                break;

            case 8:
                Integral.integral();
                break;

            case 9:
                Mode.mode();
                break;

            case 10:
                MutlakDeger.mutlakdeger();
                break;
*/
                case 11:
                    condition = false;
            }
        }
    }
}
