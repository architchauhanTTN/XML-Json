import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonToFile {

    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("name", "Archit Chauhan");
        obj.put("age", new Integer(22));

        JSONArray list = new JSONArray();
        list.add("JVM");
        list.add("C++");
        list.add("Python");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("/home/archit/Desktop/JsonXML/src/main/java/testingWrite.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}