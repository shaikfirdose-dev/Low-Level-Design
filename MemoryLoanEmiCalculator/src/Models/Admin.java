package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Admin extends User{
    String userName;
    HashMap<String, Customer> customers;
//    HashMap<String, Loan> loans;


    public Admin(String userName){
        super(userName);
//        loans = new HashMap<>();
        customers = new HashMap<>();
    }

    public List<Loan> fetchAllLoans(){
        List<Loan> allLoans = new ArrayList<>();
        for(Loan loan : loans.values()){
            allLoans.add(loan);
        }

        return allLoans;
    }

    public void createLoan(Loan loan, String customerName){
        loans.put(customerName,loan);
        customers.put(loan.getCustomerName(), new Customer(customerName));
    }


}
