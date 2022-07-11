public interface Service {
    void changeDriver(Bus bus,Driver[] drivers) throws MyException;
    void startDriving(Bus bus);
    void startRepair(Bus bus);
}
