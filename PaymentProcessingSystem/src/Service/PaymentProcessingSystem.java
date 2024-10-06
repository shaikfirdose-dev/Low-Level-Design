package Service;

import Models.Transaction;
import Models.User;

import java.util.*;
import java.util.stream.Collectors;

public class PaymentProcessingSystem {
    Map<String, User> users = new HashMap<>();
    List<Transaction> transactionList = new ArrayList<>();

    private static PaymentProcessingSystem paymentProcessingSystem = null;

    public void createUser(String userId, String userName, double balance){
        User user = new User(userId, userName, balance);
        users.put(userId,user);
        System.out.println("User created successfully!");
        return;
    }

    public void transactionProcessing(String transactionId, String senderId, String receiverId, double sendingAmount){
        Transaction transaction = new Transaction(transactionId, senderId, receiverId, sendingAmount, new Date());

        User userCheck = users.get(receiverId);
        if(userCheck==null){
            throw new IllegalArgumentException("Oops!, receiver does not have account, please send to valid user");
        }

        double bankBalance  = getBalance(senderId);
        if(bankBalance < sendingAmount){
            throw new IllegalArgumentException("Oops!, sender does not have sufficient amount");
        }

        users.get(senderId).setBalance(bankBalance-sendingAmount);

        transactionList.add(transaction);

        System.out.println("Transaction Successful");

    }

    public double getBalance(String userId){
        //implement logic
        return users.get(userId).getBalance();
    }

    public List<Transaction> getTransactionHistory(String userId){
        //implement logic
        return transactionList.stream().filter(transaction -> transaction.getSenderId().equals(userId)).toList();
    }


    public static PaymentProcessingSystem getInstance(){
        if(paymentProcessingSystem==null){
            paymentProcessingSystem = new PaymentProcessingSystem();
        }
        return paymentProcessingSystem;
    }


}
