package Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BusJson {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WHITE_PATH = Paths.get("./json-bus");

    public static void write(String obj) {

        Path write = Paths.get(String.valueOf(WHITE_PATH));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.printf(e.getMessage());

        }
    }
}
