package _250926_Bank.Model;

import _250926_Bank.Controller.MenuController;
import _250926_Bank.Controller.UserHelper;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        UserHelper.createDemoUser();
        menuController.showMainMenu();
    }
}
