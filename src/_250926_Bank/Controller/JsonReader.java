package _250926_Bank.Controller;


import _250926_Bank.Model.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {

    private static final String fileName = "/Users/ayhanunlu/IdeaProjects/PatikaAdvancedJavaProjects/src/_250926_Bank/Users.json";
    private static final Gson gson = new Gson();
    private static final Type userListType = new TypeToken<List<User>>(){}.getType();

    public List<User> readUserListFromFile() {
        try (FileReader fileReader = new FileReader(fileName)) {
           return gson.fromJson(fileReader, userListType);
        } catch (Exception e) {
            e.printStackTrace();
        }return new ArrayList<>();
    }

}
