package Models;

public class EMICalculator {


    public double calculateEMI(double totalAmount, int tenure){
        return totalAmount/(tenure*12);
    }

    public void payEMI(double emiAmount, String userName){

    }
}
