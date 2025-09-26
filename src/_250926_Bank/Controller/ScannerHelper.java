package _250926_Bank.Controller;

import java.util.Scanner;

public class ScannerHelper {
    static Scanner scanner = new Scanner(System.in);

    public static String getReceiverNationalIdNumberFromSender() {
        System.out.println("Please enter the National Id Number of The Receiver:");

        return scanner.nextLine();
    }

    public static double getTransferAmountFromSender() {
        System.out.println("Please enter the Amount to Transfer:");
        return scanner.nextDouble();
    }
}
