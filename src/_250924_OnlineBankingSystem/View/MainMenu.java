package _250924_OnlineBankingSystem.View;

import _250924_OnlineBankingSystem.Model.User;

import java.util.Scanner;

public class MainMenu {
    SignUpMenu signUpMenu;
    LoginMenu loginMenu= new LoginMenu();
    Scanner scanner = new Scanner(System.in);

    User user = new User();
    int count = 1;
public void displayMainMenu(){
    System.out.println("Welcome to the Bank\nPlease make a selection below\n1-Login\n2-Sign Up\n0-Exit");

}
    public void showMainMenu() {
        System.out.println("Welcome to the Bank\nPlease make a selection below\n1-Login\n2-Sign Up\n0-Exit");
        int selection = scanner.nextInt();
        scanner.nextLine();
        switch (selection) {
            case 1:
                loginMenu.loginMenu();
                showMainMenu();
                break;
            case 2:
                signUpMenu.signUpMenu();
                showMainMenu();
                break;
            case 0:
                break;
            default:
                showMainMenu();
                break;
        }
    }

    public void loginMenu() {

    }


}
