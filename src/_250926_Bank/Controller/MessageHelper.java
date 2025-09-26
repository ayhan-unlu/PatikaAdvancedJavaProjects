package _250926_Bank.Controller;

import _250926_Bank.Model.User;

public class MessageHelper {
    public static void showMessage(String message) {
        switch (message) {
            case "success":
                System.out.println("Success.");
                break;
            case "fail":
                System.out.println("Failed Action");
                break;
            case "tryagain":
                System.out.println("Please Try Again");
                break;
            default:
                System.out.println(message);
                break;
        }
    }

    public static void showTransferSuccessfulMessage(User currentUser, User receiverUser, double transferAmount) {
        System.out.println("Transfer Successful. " + currentUser.getNationalIdNumber() + " sent " + transferAmount + " to " + receiverUser.getNationalIdNumber());
        System.out.println(currentUser.getNationalIdNumber() + " Current Balance is " + currentUser.getBalance());
        System.out.println(receiverUser.getNationalIdNumber() + " Current Balance is " + receiverUser.getBalance());
    }

    public static void showSuccessfulCreditDebtPaymentMessage(User currentUser, double transferAmount) {
        System.out.println("Transfer Successful. " + currentUser.getNationalIdNumber() + " paid " + transferAmount + " for Credit Debt");
        System.out.println(currentUser.getNationalIdNumber() + " Current Balance is " + currentUser.getBalance());
        System.out.println(" Current Credit Debt is " + currentUser.getCreditDebt());
    }

    public static void showSuccessfulCreditCardDebtPaymentMessage(User currentUser, double transferAmount) {
        System.out.println("Transfer Successful. " + currentUser.getNationalIdNumber() + " paid " + transferAmount + " for Credit Card Debt");
        System.out.println(currentUser.getNationalIdNumber() + " Current Balance is " + currentUser.getBalance());
        System.out.println(" Current Credit Card Debt is " + currentUser.getCreditCardDebt());
    }

    public static void showTransferFailedMessage(User currentUser) {
        System.out.println("The current balance is :" + currentUser.getBalance() + "not enough for transfer");
    }

    public static void showUserBalanceMessage(User currentUser){
        System.out.println("Current Balance is :" + currentUser.getBalance());
    }
    public static void showUserCreditDebtMessage(User currentUser){
        System.out.println("Current Credit Debt is :" + currentUser.getCreditDebt());
    }
    public static void showUserCreditCardDebtMessage(User currentUser){
        System.out.println("Current Card Credit Debt is :" + currentUser.getCreditCardDebt());
    }


}
