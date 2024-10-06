import Models.Admin;
import Models.Customer;
import Models.Loan;
import Models.User;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        String adminName = sc.next();
        String customerName = sc.next();
        double principleAmount = sc.nextDouble();
        double rateOfInterest = sc.nextDouble();
        int tenure = sc.nextInt();

        Admin admin = new Admin(adminName);
        Customer customer = new Customer(customerName);

        Loan loan = new Loan(adminName, customerName, principleAmount, rateOfInterest, tenure);

        admin.createLoan(loan, customerName);
        System.out.println(customer.viewLoan(customerName));






    }
}