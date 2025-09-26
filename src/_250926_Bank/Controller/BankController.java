package _250926_Bank.Controller;

import _250926_Bank.Model.User;

import java.util.Scanner;

public class BankController {

    String receiverNationalIdNumber;
    double transferAmount;

    public User receiverUser;

    public void payCreditCardDebt(User currentUser) {
        transferAmount = ScannerHelper.getTransferAmountFromSender();
        transferCreditCardDebt(currentUser, transferAmount);
    }

    public void transferCreditCardDebt(User currentUser, double transferAmount) {
        if (checkCurrentUserBalance(currentUser, transferAmount)) {
            currentUser.setBalance(currentUser.getBalance() - transferAmount);
            currentUser.setCreditCardDebt(currentUser.getCreditCardDebt() - transferAmount);
            MessageHelper.showSuccessfulCreditCardDebtPaymentMessage(currentUser, transferAmount);
        } else {
            MessageHelper.showTransferFailedMessage(currentUser);
        }
    }

    public void payCreditDebt(User currentUser) {
        transferAmount = ScannerHelper.getTransferAmountFromSender();
        transferCreditDebt(currentUser, transferAmount);
    }


    public void transferCreditDebt(User currentUser, double transferAmount) {
        if (checkCurrentUserBalance(currentUser, transferAmount)) {
            currentUser.setBalance(currentUser.getBalance() - transferAmount);
            currentUser.setCreditDebt(currentUser.getCreditDebt() - transferAmount);
            MessageHelper.showSuccessfulCreditDebtPaymentMessage(currentUser, transferAmount);
        } else {
            MessageHelper.showTransferFailedMessage(currentUser);
        }
    }


    public void transferDeposit(User currentUser) {
        receiverNationalIdNumber = ScannerHelper.getReceiverNationalIdNumberFromSender();
        receiverUser = UserHelper.fetchUser(receiverNationalIdNumber);
        if ((receiverUser != null) && (!receiverUser.getNationalIdNumber().equals(currentUser.getNationalIdNumber()))) {
            System.out.println("Receiver is authenticated");
            transferAmount = ScannerHelper.getTransferAmountFromSender();
            transferFunds(currentUser, receiverUser, transferAmount);
        } else if (receiverUser.getNationalIdNumber().equals(currentUser.getNationalIdNumber())) {
            MessageHelper.showMessage("You cant transfer to yourself");
        } else {
            System.out.println("The receiver is not in the Bank List");
        }
    }


    public void transferFunds(User currentUser, User receiverUser, double transferAmount) {
        if (checkCurrentUserBalance(currentUser, transferAmount)) {
            currentUser.setBalance(currentUser.getBalance() - transferAmount);
            receiverUser.setBalance(receiverUser.getBalance() + transferAmount);
            MessageHelper.showTransferSuccessfulMessage(currentUser, receiverUser, transferAmount);
        } else {
            MessageHelper.showTransferFailedMessage(currentUser);
        }
    }

    public boolean checkCurrentUserBalance(User currentUser, double transferAmount) {
        return currentUser.getBalance() >= transferAmount;
    }

}