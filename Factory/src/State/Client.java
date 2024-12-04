package State;

public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        VendingMachineState machineState = new IdleState();
        machineState.insertCoin(vendingMachine);

        vendingMachine.getVendingMachineState();

        vendingMachine.getVendingMachineState().dispenseItem(vendingMachine);

        vendingMachine.getVendingMachineState();


    }
}
