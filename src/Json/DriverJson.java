package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import static Json.BusJson.GSON;

public class DriverJson {
    public static final GsonBuilder BUILDER = new GsonBuilder();
  //  public static final Gson GSON = BUILDER.setPrettyPrinting().create();





//    public static String readDriver() {
//        String json = "";
//        try {
//            FileReader reader = new FileReader(String.valueOf(WHITE_PATH2));
//            int a;
//            while ((a = reader.read()) != -1) {
//                json += (char) a;
//            }
//            return json;
//        } catch (IOException e) {
//            e.getMessage();
//        }
//        return json;

  //  }




}
