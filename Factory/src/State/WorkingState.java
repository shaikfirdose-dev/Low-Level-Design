package State;

public class WorkingState implements VendingMachineState{
    @Override
    public void insertCoin(VendingMachine product) {

    }

    @Override
    public void dispenseItem(VendingMachine product) {
        System.out.println("Dispense item...");
        product.setVendingMachineState(new IdleState());
    }

    @Override
    public String toString() {
        return "Working State...";
    }
}
