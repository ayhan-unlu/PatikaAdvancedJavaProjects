package _250924_OnlineBankingSystem.Controller;

import _250924_OnlineBankingSystem.Model.Config;
import _250924_OnlineBankingSystem.Model.User;
import _250924_OnlineBankingSystem.View.MainMenu;
import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static _250924_OnlineBankingSystem.Controller.JsonReader.getJsonArray;
import static _250924_OnlineBankingSystem.Controller.JsonReader.getJsonFromFile;

public class JsonWriter {
    private static final String fileName = Config.getFileName();


    public void jsonFileWriter(User user) {

        List<User> userList = getUserList();

        if (userList.stream().noneMatch(u -> u.getNationalIdNumber().equals(user.getNationalIdNumber()))) {
            userList.add(user);
        }else{
            System.out.println("National Id Number is already used.");
        }
        String json = convertUserListToGson(userList);
        writeToFile(json);
    }

    public static List<User> getUserList() {
        List<User> userList = JsonReader.getUserList(getJsonArray(getJsonFromFile(fileName)));
        return userList != null ? userList : new ArrayList<>();
    }


    public static String convertUserListToGson(List<User> userList) {
        Gson gson = new Gson();
        String json = gson.toJson(userList);
        return json;
    }


    public static void writeToFile(String gsonString) {
        try (FileWriter fileWriter = new FileWriter(Config.getFileName())) {
            fileWriter.write(gsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
