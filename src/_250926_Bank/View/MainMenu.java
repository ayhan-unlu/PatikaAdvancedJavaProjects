package _250926_Bank.View;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("Welcome to the Bank\nPlease make a selection below\n1-Login\n2-Sign Up\n0-Exit");
    }

    public int getUserSelection() {
        int selection = scanner.nextInt();
        scanner.nextLine();
        return selection;
    }

}
