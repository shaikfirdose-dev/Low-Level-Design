package Facade.Example2;

public class OrderFacade {
    ProductDao productDao;
    PaymentDao paymentDao;
    InvoiceDao invoiceDao;
    NotificationDao notificationDao;

    public OrderFacade(){
        productDao = new ProductDao();
        paymentDao = new PaymentDao();
        invoiceDao = new InvoiceDao();
        notificationDao = new NotificationDao();
    }

    public void createOrder(){
        productDao.addProduct();
        paymentDao.makePayment();
        invoiceDao.generateInvoice();
        notificationDao.sendNotification();
    }
}
