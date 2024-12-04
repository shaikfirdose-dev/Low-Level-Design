package State.Example2;

public interface State {

    void insertMoney(VendingMachine context);
    void ejectMoney(VendingMachine context);
    void dispenseMoney(VendingMachine context);
}
