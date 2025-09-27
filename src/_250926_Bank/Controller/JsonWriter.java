package _250926_Bank.Controller;


import _250926_Bank.Model.User;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.List;

public class JsonWriter {

    private static final String fileName = "/Users/ayhanunlu/IdeaProjects/PatikaAdvancedJavaProjects/src/_250926_Bank/Users.json";
    private static final Gson gson = new Gson();

    public static void writeUserListToFile(List<User> userList) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(convertUserListToGson(userList));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String convertUserListToGson(List<User> userList) {

        return gson.toJson(userList);
    }


}
