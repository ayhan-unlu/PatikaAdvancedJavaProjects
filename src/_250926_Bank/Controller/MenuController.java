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

    BankController bankcontroller = new BankController();

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
        while (true) {
            accountMenu.displayAccountMenu(currentUser);
            userSelection = getUserSelection();
            if (userSelection == 0) {
                break;
            } else {
                handleAccountSelection(userSelection);
            }
        }
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

    public void handleAccountSelection(int userSelection) {
        switch (userSelection) {
            case 1:
                MessageHelper.showUserBalanceMessage(currentUser);                //   showAccountMenu();
                break;
            case 2:
                MessageHelper.showUserBalanceMessage(currentUser);
                bankcontroller.transferDeposit(currentUser);
                break;
            case 3:
                MessageHelper.showUserBalanceMessage(currentUser);
                MessageHelper.showUserCreditDebtMessage(currentUser);
                bankcontroller.payCreditDebt(currentUser);
                break;
            case 4:
                MessageHelper.showUserBalanceMessage(currentUser);
                MessageHelper.showUserCreditCardDebtMessage(currentUser);
                bankcontroller.payCreditCardDebt(currentUser);
                break;
            case 0:
                MessageHelper.showMessage("Returning to the Main Menu");
                break;
            default:
                MessageHelper.showMessage("Invalid Selection");
                break;
        }
    }

}
