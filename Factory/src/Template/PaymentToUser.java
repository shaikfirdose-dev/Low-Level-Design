package Template;

public class PaymentToUser extends PaymentTemplate{
    @Override
    public void validateRequest() {
        System.out.println("Request Validated...");
    }

    @Override
    public void debitMoney() {
        System.out.println("Money debited from the User...");
    }

    @Override
    public void calculateAmount() {
        System.out.println("0% interest, amount calculated...");
    }

    @Override
    public void creditMoney() {
        System.out.println("Money credited to the User...");
    }
}
