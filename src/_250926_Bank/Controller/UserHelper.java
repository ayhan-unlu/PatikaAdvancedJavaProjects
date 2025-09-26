package _250926_Bank.Controller;

import _250926_Bank.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserHelper {
    static Scanner scanner = new Scanner(System.in);
    static List<User> userList = new ArrayList<>();




    public static void getSignUpInput() {
        System.out.println("Please enter you National Id Number");
        String nationalIdNumber = scanner.nextLine();
        if (!isNationalIdNumberInList(nationalIdNumber)) {
            System.out.println("Please enter your Birthday");
            String birthDate = scanner.nextLine();
            System.out.println("Please enter your Password");
            String password = scanner.nextLine();

            if (validatePassword(birthDate, password)) {
                System.out.println("You have successfully registered");
                addUserToUserList(new User(nationalIdNumber, birthDate, 0, 0, password));

            } else {
                System.out.println("Your password contains your birthday and it is not allowed");
            }
        } else {
            System.out.println("The National Id Number is already in use");
        }
    }

    public static User getLoginInput() {
        System.out.println("Please enter your National Id Number");
        String nationalIdNumber = scanner.nextLine();
        if (isNationalIdNumberInList(nationalIdNumber)) {
            System.out.println("Please enter your Password");
            String password = scanner.nextLine();
            if (isPasswordValid(nationalIdNumber, password)) {
                System.out.println("You have succesfully Logged In");
                User user = fetchUser(nationalIdNumber, password);
                return user;
            }else{
                System.out.println("Invalid Password");
            }

        } else {
            System.out.println("National Id Number is not found, Try again or go to Sign Up Menu");
        }
        return null;
    }


    public static User createDemoUser() {
        User user = new User("0000", "1111", 1000, 1000, "0000");
        user.setBalance(1000000);
        addUserToUserList(user);
        return user;
    }

    public static void addUserToUserList(User user) {
        userList.add(user);
    }

    public static boolean isNationalIdNumberInList(String nationalIdNumber) {
        for (User user : userList) {
            if (user.getNationalIdNumber().equals(nationalIdNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPasswordValid(String nationalIdNumber, String password) {
        User user = fetchUser(nationalIdNumber, password);
        if (user != null) {
            return true;
        } else
            return false;
    }

    public static boolean validatePassword(String birthDate, String password) {
        return !password.contains(birthDate);
    }

    public static User fetchUser(String nationalIdNumber, String password) {
        for (User user : userList) {
            if (user.getNationalIdNumber().equals(nationalIdNumber) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static User fetchUser(String nationalIdNumber){
        for (User user : userList){
            if(user.getNationalIdNumber().equals(nationalIdNumber)){
                return user;
            }
        }return null;
    }
}
