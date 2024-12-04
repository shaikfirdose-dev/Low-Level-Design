package Template;

public abstract class PaymentTemplate {
    public abstract void validateRequest();
    public abstract void debitMoney();
    public abstract void calculateAmount();
    public abstract void creditMoney();


    public final void sendMoney(){
        //step1
        validateRequest();

        //step2
        debitMoney();

        //step3
        calculateAmount();

        //step4
        creditMoney();
    }

}
