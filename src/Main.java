import Json.BusJson;
import Json.DriverJson;

import java.util.ArrayList;
import java.util.List;

import static Json.BusJson.GSON;

public class Main{





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
       BusJson. write(json);
        DriverJson.writeDriver(jsonDrover);

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
        System.out.println();
    }





}
