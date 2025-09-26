package _250924_OnlineBankingSystem.Model;

import _250924_OnlineBankingSystem.Controller.JsonWriter;

public class User {
    private String nationalIdNumber;
    private String birthDate;
    private double balance;
    private String password;

    transient ThreadLocal sessionData;
    transient String tempMenuChoice;
    // List<User> userList = new ArrayList<>();
    transient JsonWriter jsonWriter = new JsonWriter();

    public User() {

    }

    public User(String nationalIdNumber, String birthDate, String password) {
        this.nationalIdNumber = nationalIdNumber;
        this.birthDate = birthDate;
        this.balance = 0;
        this.password = password;
    }

    public boolean validatePassword(String password, String birthDate) {
        if (password.contains(birthDate)) {
            return false;
        } else return true;
    }

   /* public void addUser(User user){
        userList.add(user);
        System.out.println("User added successfully");
    }*/

    public void addUserToFile(User user) {
        jsonWriter.jsonFileWriter(user);
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
