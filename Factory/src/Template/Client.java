package Template;


//Why and When to use this design pattern
//1. When you want all the classes to follow the specific steps to process the task but also
// need to provide the flexibility that each class can have their own logic to that specific steps
public class Client {
    public static void main(String[] args) {
        PaymentTemplate paymentTemplate = new PaymentToMarchant();
        paymentTemplate.sendMoney();
        System.out.println("----------------");
        PaymentTemplate paymentTemplate1 = new PaymentToUser();
        paymentTemplate1.sendMoney();
    }
}
