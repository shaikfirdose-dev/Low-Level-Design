package State;

public class VendingMachine {
    VendingMachineState vendingMachineState;

    public VendingMachineState getVendingMachineState(){
        System.out.println("Vending machine State "+vendingMachineState.toString());
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState machineState){
        this.vendingMachineState = machineState;
    }


}
