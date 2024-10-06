import Models.Transaction;
import Service.PaymentProcessingSystem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentProcessingSystem paymentProcessingSystem = PaymentProcessingSystem.getInstance();

        //create user
        paymentProcessingSystem.createUser("1", "Firdose", 10000);
        paymentProcessingSystem.createUser("2", "Shaik", 2000);
        paymentProcessingSystem.createUser("3", "Saif", 5000);
        paymentProcessingSystem.createUser("4", "Michal", 500);

        //payment transaction
        try{
            paymentProcessingSystem.transactionProcessing("1", "1", "4", 2000);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        // get balance

        System.out.println(paymentProcessingSystem.getBalance("1"));

        //tramsaction history
        for(Transaction transaction : paymentProcessingSystem.getTransactionHistory("1")){
            System.out.println(transaction);
        }

    }
}