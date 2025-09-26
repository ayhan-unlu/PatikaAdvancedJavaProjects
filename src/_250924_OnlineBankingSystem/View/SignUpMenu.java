package _250924_OnlineBankingSystem.View;

import _250924_OnlineBankingSystem.Model.User;

import java.util.Scanner;

public class SignUpMenu {
    MainMenu mainMenu;
    Scanner scanner = new Scanner(System.in);
    User user = new User();
    int count = 1;

    public void signUpMenu() {
        System.out.println("Welcome to the Sign Up Menu");

        System.out.println("Please enter you National Id Number");
        String nationalIdNumber = scanner.nextLine();

        System.out.println("Please enter your birthdate year");
        String birthDate = scanner.nextLine();

        System.out.println("Please enter your password");
        String password = scanner.nextLine();

        if (user.validatePassword(password,birthDate)) {
            user = new User(nationalIdNumber, birthDate, password);
            user.addUserToFile(user);
        } else {
            System.out.println("Invalid Password, Password should not include birthdate year, Please try again");
            if (count < 3) {
                count++;
                signUpMenu();
            }else {
                System.out.println("You have tried 3 times now being directed to the Main Menu");
                mainMenu.showMainMenu();
                count=1;
            }
        }

    }
}
