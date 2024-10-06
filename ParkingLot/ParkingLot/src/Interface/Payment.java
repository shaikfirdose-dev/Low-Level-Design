package Interface;

import java.util.Date;
import constants.PaymentStatus;

public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timestamp;
    private String transactionID;

    public abstract boolean initiateTransaction();


}
