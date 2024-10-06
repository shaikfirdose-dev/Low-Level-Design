package Observer;

import Observable.StockObservable;

public class EmailNotificationAlertObserver implements StockObserver {
    String emailId;
    StockObservable observable;

    public EmailNotificationAlertObserver(String email, StockObservable observable){
        this.emailId = email;
        this.observable = observable;

    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    public void sendEmail(String emailId){
        System.out.println("email sent to "+emailId);
    }
}
