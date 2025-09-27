package _250926_Bank.Model;

import _250926_Bank.Controller.JsonWriter;

public class User {
    private String nationalIdNumber;
    private String birthDate;
    private double balance;
    private double creditDebt;
    private double creditCardDebt;
    private String password;

    transient ThreadLocal sessionData;
    transient String tempMenuChoice;

    public User() {

    }

    public User(String nationalIdNumber, String birthDate, double creditDebt, double creditCardDebt, String password) {
        this.nationalIdNumber = nationalIdNumber;
        this.birthDate = birthDate;
        this.balance = 0;
        this.creditDebt = creditDebt;
        this.creditCardDebt = creditCardDebt;
        this.password = password;
    }

    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber(String nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }


    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    public double getCreditCardDebt() {
        return creditCardDebt;
    }

    public void setCreditCardDebt(double creditCardDebt) {
        this.creditCardDebt = creditCardDebt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
