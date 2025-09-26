package _250924_OnlineBankingSystem.Model;

import _250924_OnlineBankingSystem.Controller.MenuController;
import _250924_OnlineBankingSystem.View.MainMenu;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.showMainMenu();
/*
        MainMenu mainMenu = new MainMenu();
        mainMenu.showMainMenu();
*/
    }
}
