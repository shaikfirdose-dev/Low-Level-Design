package State.Example2;

public class VendingMachine {

    private State machineState;

    public VendingMachine(){
        this.machineState = new NoMoneyState();
    }

    public void setState(State state){
        this.machineState = state;
    }

    public void insertMoney(){
        machineState.insertMoney(this);
    }

    public void ejectMoney(){
        machineState.ejectMoney(this);
    }

    public void dispenseMoney(){
        machineState.dispenseMoney(this);
    }
}
