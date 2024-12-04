package State.Example2;

public class Client {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();


        vendingMachine.insertMoney();
        vendingMachine.ejectMoney();

        vendingMachine.dispenseMoney();

        vendingMachine.insertMoney();
        vendingMachine.dispenseMoney();
    }
}
