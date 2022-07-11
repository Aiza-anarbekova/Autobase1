package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BusJson {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WHITE_PATH = Paths.get("./json-bus");
    public static final Path WHITE_PATH2 = Paths.get("./json-driver");

    public static void writeDriver(String obj) {
        Path write = Paths.get(String.valueOf(WHITE_PATH2));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static String readDriver(){
        String json="";
        try {
            FileReader reader = new FileReader(String.valueOf(WHITE_PATH2));
            int b;
            while ((b=reader.read())!=1){
                json+=(char) b;
            }return json;
        }catch (IOException e){
            e.getMessage();
        }return json;
    }


    public static void write(String obj) {

        Path write = Paths.get(String.valueOf(WHITE_PATH));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }
    public static String read() {
        String json = "";
        try {
            FileReader reader = new FileReader(String.valueOf(WHITE_PATH));
            int a;
            while ((a = reader.read()) != -1) {
                json += (char) a;
            }
            return json;
        } catch (IOException e) {
            e.getMessage();
        }
        return json;
    }
}
