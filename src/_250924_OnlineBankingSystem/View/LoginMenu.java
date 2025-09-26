package _250924_OnlineBankingSystem.View;

import _250924_OnlineBankingSystem.Controller.JsonReader;
import _250924_OnlineBankingSystem.Controller.JsonWriter;
import _250924_OnlineBankingSystem.Model.User;

import java.util.List;
import java.util.Scanner;

public class LoginMenu {
    MainMenu mainMenu= new MainMenu();
    Scanner scanner = new Scanner(System.in);
    User user;
    int count = 1;

    public void loginMenu() {
        System.out.println("Welcome to Login Menu");
        System.out.println("Please enter your National Id Number");
        String nationalIdNumber = scanner.nextLine();
        if (isNationalIdNumberAuthenticated(nationalIdNumber)) {
            System.out.println("Please enter your Password");
            String password = scanner.nextLine();
            if ((user=isPasswordAuthenticated(nationalIdNumber, password))!=null) {
                System.out.println("Logged in successfully");
                User currentUser = user;
            } else {
                System.out.println("Wrong Password");
                threeTryMessages();
            }
        } else {
            System.out.println("National Id Number could not be found\nTry again or use Sign up Menu");
            threeTryMessages();
        }
    }

    public void threeTryMessages() {
        if (count < 3) {
            count++;
            loginMenu();
        } else {
            System.out.println("Tried three times. Now being directed to the Main Menu");
            mainMenu.showMainMenu();
        }
    }

    public boolean isNationalIdNumberAuthenticated(String nationalIdNumber) {

        for (User user : JsonWriter.getUserList()) {
            if (user.getNationalIdNumber().equals(nationalIdNumber)) {
                return true;
            }
        }
        return false;
    }

    public User isPasswordAuthenticated(String nationalIdNumber, String password) {
        for (User user : JsonWriter.getUserList()) {
            if (user.getNationalIdNumber().equals(nationalIdNumber) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
