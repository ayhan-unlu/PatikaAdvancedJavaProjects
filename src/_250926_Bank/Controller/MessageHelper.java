package _250926_Bank.Controller;

public class MessageHelper {
    public static void showMessage(String message) {
        switch (message) {
            case "success":
                System.out.println("Success.");
                break;
            case "fail":
                System.out.println("Failed Action");
                break;
            case"tryagain":
                System.out.println("Please Try Again");
            default:
                System.out.println(message);

        }
    }
}
