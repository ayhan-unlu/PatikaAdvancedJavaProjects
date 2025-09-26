package _250926_Bank.Controller;

import _250926_Bank.Model.User;
import _250926_Bank.View.AccountMenu;
import _250926_Bank.View.LoginMenu;
import _250926_Bank.View.MainMenu;
import _250926_Bank.View.SignUpMenu;

import java.util.Scanner;

public class MenuController {
    MainMenu mainMenu = new MainMenu();
    SignUpMenu signUpMenu = new SignUpMenu();
    LoginMenu loginMenu = new LoginMenu();
    AccountMenu accountMenu = new AccountMenu();
    Scanner scanner = new Scanner(System.in);
    int userSelection;
    User currentUser;

    public void showMainMenu() {
        while (true) {
            mainMenu.displayMainMenu();
            userSelection = getUserSelection();
            if (userSelection == 0) {
                break;
            } else {
                handleUserSelection(userSelection);
            }
        }
    }

    public void showSignUpMenu() {
        signUpMenu.displaySignUpMenu();
    }

    public void showLoginMenu() {
        loginMenu.displayLoginMenu();
        currentUser = UserHelper.getLoginInput();
        if (currentUser != null) {
            System.out.println("You are ready to move to account menu");
            showAccountMenu();
        } else {
            System.out.println("Login Failed");
            //  showMainMenu();
        }
    }


    public void showAccountMenu() {
        System.out.println("Welcome to the Account Menu");
        //  accountMenu.displayAccountMenu(currentUser);
        //userSelection = getUserSelection();

    }


    public int getUserSelection() {
        int selection = scanner.nextInt();
        scanner.nextLine();
        return selection;
    }

    public void handleUserSelection(int userSelection) {
        switch (userSelection) {
            case 1:
                showLoginMenu();
                //   showAccountMenu();
                break;
            case 2:
                showSignUpMenu();
                showMainMenu();
                break;
            case 0:
                break;
            default:
                showMainMenu();
                break;
        }
    }
}
