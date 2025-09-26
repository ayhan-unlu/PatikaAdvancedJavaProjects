package _250924_OnlineBankingSystem.Controller;

import _250924_OnlineBankingSystem.Model.Config;
import _250924_OnlineBankingSystem.Model.User;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    static List<User> userList = new ArrayList<>();

    private final String filename = Config.getFileName();

    public static String getJsonFromFile(String filename) {
        String jsonString = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                jsonString += line + "\n";

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonString;
    }

    public static JSONArray getJsonArray(String jsonString) {
        try {
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonString);
            return jsonArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<User> getUserList(JSONArray jsonArray){
        for(Object object : jsonArray){
            JSONObject jsonUser = (JSONObject) object;

            String nationalIdNumber = (String)jsonUser.get("nationalIdNumber");
            String birthDate = (String)jsonUser.get("birthDate");
            String password = (String)jsonUser.get("password");

            userList.add(new User(nationalIdNumber, birthDate,password));
        }
        return userList;
    }
}
