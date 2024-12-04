package State;

public class IdleState implements VendingMachineState{
    @Override
    public void insertCoin(VendingMachine product) {
        System.out.println("Coin Inserted...");
        product.setVendingMachineState(new WorkingState());
    }

    @Override
    public void dispenseItem(VendingMachine product) {
        //
    }

    @Override
    public String toString() {
        return "Idle state...";
    }
}
