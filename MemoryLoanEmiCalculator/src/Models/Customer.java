package Models;

public class Customer extends User{

    private EMICalculator emiCalculator;

    public Customer(String userName){
        super(userName);
        emiCalculator = new EMICalculator();
    }


    public void payEMI(double amount, String userName){

    }
}
