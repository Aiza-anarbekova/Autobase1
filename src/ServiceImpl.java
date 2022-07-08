public class ServiceImpl implements Service{
    @Override
    public void changeDriver(Bus bus, Driver[] drivers) {
        System.out.println("Choose one bus: ");
        for (Driver d:drivers) {
            if (d.getBus().matches("[^a-zA-Z]*$]")){
                bus.setDriver(d.getName());
                d.setBus(bus.getDriver());
            }
        }try {
            if (bus.getState().equals(State.ROUTE)){
                throw new MyException();
            }
        } catch (MyException e) {
            System.out.println("there is no free driver\n, the bus on the route");
        }
        try {
            if (bus.getState().equals(State.STATE)){
                throw  new MyException();
            }
        } catch (MyException e) {
            System.out.println("there is no free driver \n , the bus on repair");
        }
    }

    @Override
    public void startDriver(Bus bus) {

    }

    @Override
    public void startRepair(Bus bus) {

    }
}
