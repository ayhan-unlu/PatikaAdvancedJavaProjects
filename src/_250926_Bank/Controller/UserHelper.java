package _250926_Bank.Controller;

import _250926_Bank.Model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserHelper {
    static Scanner scanner = new Scanner(System.in);
    static List<User> userList = new ArrayList<>();


    public static void getSignUpInput(){
        System.out.println("Please enter you National Id Number");
        String nationalIdNumber = scanner.nextLine();

    }

    public static User createDemoUser(){
        User user = new User("0000","1111","0000");
        addUserToUserList(user);
        return user;
    }

    public static void addUserToUserList(User user){
        userList.add(user);
    }
}
