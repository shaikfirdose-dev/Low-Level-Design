package State;

public interface VendingMachineState {
    void insertCoin(VendingMachine product);
    void dispenseItem(VendingMachine product);
}
