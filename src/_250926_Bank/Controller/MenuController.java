package _250926_Bank.Controller;

import _250926_Bank.View.LoginMenu;
import _250926_Bank.View.MainMenu;
import _250926_Bank.View.SignUpMenu;

public class MenuController {
    MainMenu mainMenu=new MainMenu();
    SignUpMenu signUpMenu= new SignUpMenu();
    LoginMenu loginMenu= new LoginMenu();

    int userSelection ;

    public void showMainMenu(){
        mainMenu.displayMainMenu();
        userSelection= mainMenu.getUserSelection();
        handleUserSelection(userSelection);
    }
    public void showSignUpMenu(){
        signUpMenu.displaySignUpMenu();
    }
    public void showLoginMenu(){
        loginMenu.displayLoginMenu();
    }

    public void handleUserSelection(int userSelection){
        switch (userSelection) {
            case 1:
                showLoginMenu();
                break;
            case 2:
                showSignUpMenu();
                break;
            case 0:
                break;
            default:
                showMainMenu();
                break;
        }
    }



}
