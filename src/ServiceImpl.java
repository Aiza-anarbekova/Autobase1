import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Scanner;

public class ServiceImpl implements Service {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void changeDriver(Bus bus, Driver[] drivers) throws MyException {
        for (Driver d : drivers) {

            if (d.getBus().equals("") && bus.getState().equals(State.BASE) ) {
                System.out.println("vyberite voditelya: ");
                String name = scanner.nextLine();
                bus.setDriver(name);
                d.setBus(bus.getName());
                System.out.println("Successful ! ");
                System.out.println("#| Driver  |  Bus ");
                System.out.println("----------+--------+-------");
                System.out.println(d.getId() + "| " + name + "|    " + d.getBus());
                break;
            }


                try {
                    if ( bus.getState().equals(State.ROUTE)) {
                        throw new MyException("Bus na doroge !");
                    }
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                }
                try {
                    if (d.getBus().equals("") && bus.getState().equals(State.STATE)) {
                        throw new MyException("Bus na remonte");
                    }
                } catch (MyException e) {
                    System.out.println(e.getMessage());

                }

            }
        }


        @Override
        public void startDriving (Bus bus){
            if (bus.getState().equals(State.BASE) && bus.getDriver() != "") {
                bus.setState(State.ROUTE);
                System.out.println("Successfully!");
            } else if (bus.getState().equals(State.ROUTE)) {
                System.out.println("bus v puti!");
            } else if (bus.getState().equals(State.STATE)) {
                bus.setState(State.BASE);
            } else {
                System.out.println("netu voditelya!");
            }
        }

        @Override
        public void startRepair (Bus bus){
            if (bus.getState().equals(State.BASE) || bus.getState().equals(State.ROUTE)) {
                bus.setState(State.STATE);
                System.out.println("mashina v remonte");
            }
            try {
                if (bus.getState().equals(State.STATE)) {
                    throw new MyException("mashina v remonre!");
                }
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }

        }
    }

