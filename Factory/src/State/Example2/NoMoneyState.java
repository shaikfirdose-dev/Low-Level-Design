package State.Example2;

public class NoMoneyState implements State{
    @Override
    public void insertMoney(VendingMachine context) {
        System.out.println("Money inserted...");
        context.setState(new HasMoneyState());
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("No money return");
    }

    @Override
    public void dispenseMoney(VendingMachine context) {
        System.out.println("Payment required");
    }
}
