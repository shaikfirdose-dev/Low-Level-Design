package State.Example2;

public class HasMoneyState implements State{
    @Override
    public void insertMoney(VendingMachine context) {
        System.out.println("Already have a money");
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("Returning Money");
        context.setState(new NoMoneyState());
    }

    @Override
    public void dispenseMoney(VendingMachine context) {
        System.out.println("Dispense Product");
        context.setState(new NoMoneyState());
    }
}
