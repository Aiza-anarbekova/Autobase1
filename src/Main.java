import Json.BusJson;
import Json.DriverJson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Json.BusJson.GSON;

public class Main{

    public static void main(String[] args) {
        List<Bus> busList = new ArrayList<>(List.of(
                new Bus(1, "Camry", "", State.BASE),
                new Bus(2, "Lexus", "", State.BASE),
                new Bus(3, "Accord", "", State.BASE)));

        List<Driver> drivers = new ArrayList<>(List.of(
                new Driver(1, "Asan"),
                new Driver(2, "Uson"),
                new Driver(3, "Akyl")));

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


        System.out.println("-----------*Drivers*----------");
        System.out.println("#|        | Driver  |  Bus ");
        System.out.println("----------+--------+-------");
        for (Driver a : drivers) {
            System.out.println(a);
        }

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("**************************************");
            System.out.println("CHOOSE ONE ID NUMBER OF BUS: ");
            int a= scanner.nextInt();
            for (Bus b: busList) {
                if (a==b.getId()){
                    System.out.println("*********BUS*********");
                    System.out.println("ID: "+b.getId());
                    System.out.println("NAME: "+b.getName());
                    System.out.println("DRIVER: "+b.getDriver());
                    System.out.println("STATE: "+b.getState());

                    System.out.println("Press 1 to change Driver");
                    System.out.println("Press 2 to send to the Route");
                    System.out.println("Press 3 ot send to the Repairing");

                    int c= scanner.nextInt();
                    if (c==1){

                        }
                    }





                }


            }
        }

    }







