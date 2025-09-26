package _250926_Bank.View;

import _250926_Bank.Controller.UserHelper;

public class SignUpMenu {
    public void displaySignUpMenu(){
        System.out.println("Welcome to the Sign Up Menu");
        UserHelper.getSignUpInput();
    }


}
