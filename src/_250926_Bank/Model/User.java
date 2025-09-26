package _250926_Bank.Model;

public class User {
    private String nationalIdNumber;
    private String birthDate;
    private double balance;
    private String password;

    public User() {

    }

    public User(String nationalIdNumber, String birthDate, String password) {
        this.nationalIdNumber = nationalIdNumber;
        this.birthDate = birthDate;
        this.balance = 0;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
