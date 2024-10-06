package Models;

import java.util.HashMap;
import java.util.List;

public class User {
    private String userName;
    HashMap<String, Loan> loans;

    public User(){

    }

    public User(String userName){
        this.userName = userName;
        loans = new HashMap<>();
    }

    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public Loan viewLoan(String userName) {
        if (loans.containsKey(userName)){
            Loan loan = loans.get(userName);
            return loan;
        }
        throw new IllegalArgumentException("Invalid userName!");

    }

}
