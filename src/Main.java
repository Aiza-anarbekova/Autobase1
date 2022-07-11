import Json.BusJson;
import Json.DriverJson;

import java.util.InputMismatchException;
import java.util.Scanner;

import static Json.BusJson.GSON;
import static Json.BusJson.read;

import static Json.BusJson.readDriver;

public class Main {


    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        Bus[] busList = new Bus[]{
                new Bus(1, "Camry", "", State.BASE),
                new Bus(2, "Lexus", "", State.BASE),
                new Bus(3, "Accord", "", State.BASE)};

        Driver[] drivers = new Driver[]{
                new Driver(1, "Asan", ""),
                new Driver(2, "Uson", ""),
                new Driver(3, "Akyl", "")};

        String json = GSON.toJson(busList);
        String jsonDrover = GSON.toJson(drivers);
        BusJson.write(json);
        BusJson.writeDriver(jsonDrover);

        System.out.println("-----------*BUS*---------------");
        System.out.println("#| BUS    | Driver   | State ");
        System.out.println("-+--------+----------+----");
        Bus[] buses = GSON.fromJson(read(), Bus[].class);
        for (Bus b : buses) {
            System.out.println(b);
        }

        System.out.println("-----------*Drivers*----------");
        System.out.println("#| Driver  |  Bus ");
        System.out.println("----------+--------+-------");
        //  Driver[] drivers1=GSON.fromJson(readDriver(),Driver[].class);
        for (Driver d : drivers) {
            System.out.println(d);
        }


        while (true) {
            try {


            System.out.println("**************************************");
            System.out.println("CHOOSE ONE ID NUMBER OF BUS: ");
            int a = scanner.nextInt();

            for (Bus b : busList) {
                if (a == b.getId()) {
                    System.out.println("*********BUS*********");
                    System.out.println("ID: " + b.getId());
                    System.out.println("NAME: " + b.getName());
                    System.out.println("DRIVER: " + b.getDriver());
                    System.out.println("STATE: " + b.getState());

                    System.out.println("Press 1 to change Driver");
                    System.out.println("Press 2 to send to the Route");
                    System.out.println("Press 3 ot send to the Repairing");
                    ServiceImpl service = new ServiceImpl();
                    int c = scanner.nextInt();
                    if (c == 1) {
                        service.changeDriver(b, drivers);
                    }
                    if (c == 2) {
                        service.startDriving(b);
                    }
                    if (c == 3) {
                        service.startRepair(b);
                    }

                }
                }


            }catch (InputMismatchException e){
                System.out.println("vyberite pravilnoe nazvanie!");
            }
        }

    }
}







