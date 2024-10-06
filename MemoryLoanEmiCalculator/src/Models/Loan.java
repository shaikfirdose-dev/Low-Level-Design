package Models;

public class Loan {
    private String adminName;
    private String customerName;
    private double principleAmount;
    private double rateOfInterest;
    private int tenure;
    private double totalAmount;

    public Loan(String adminName, String customerName, double principleAmount, double rateOfInterest, int tenure) {
        this.adminName = adminName;
        this.customerName = customerName;
        this.principleAmount = principleAmount;
        this.rateOfInterest = rateOfInterest;
        this.tenure = tenure;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getPrincipleAmount() {
        return principleAmount;
    }

    public void setPrincipleAmount(double principleAmount) {
        this.principleAmount = principleAmount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        double interest = (this.principleAmount*this.rateOfInterest*this.tenure)/100;
        this.totalAmount = interest*principleAmount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "adminName='" + adminName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", principleAmount=" + principleAmount +
                ", rateOfInterest=" + rateOfInterest +
                ", tenure=" + tenure +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
