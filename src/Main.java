import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path WHITE_PATH = Paths.get("./json-bus");
    public static final Path WHITE_PATH2 = Paths.get("./json-driver");


    public static void main(String[] args) {
        List<Bus> busList = new ArrayList<>(List.of(
                new Bus(1, "Camry", "", State.BASE),
                new Bus(2, "Lexus", "", State.BASE),
                new Bus(3, "Accord", "", State.BASE)));

        List<Driver> drivers = new ArrayList<>(List.of(
                new Driver("driver-1", "Asan"),
                new Driver("driver-2", "Uson"),
                new Driver("driver-3", "Akyl")));

        String json = GSON.toJson(busList);
        String jsonDrover = GSON.toJson(drivers);
        write(json);
        writeDriver(jsonDrover);


        System.out.println("-----------*BUS*---------------");
        System.out.println("#| BUS    | Driver   | State ");
        System.out.println("-+--------+----------+----");
        for (Bus b : busList) {
            System.out.println(b);
        }
        System.out.println();
        System.out.println("-----------*Drivers*----------");
        System.out.println("#|        | Driver  |  Bus ");
        System.out.println("----------+--------+-------");
        for (Driver a : drivers) {
            System.out.println(a);
        }
    }
    private static void write(String obj) {

        Path write = Paths.get(String.valueOf(WHITE_PATH));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }

    private static void writeDriver(String obj) {
        Path write = Paths.get(String.valueOf(WHITE_PATH2));
        try {
            Files.writeString(write, obj, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
