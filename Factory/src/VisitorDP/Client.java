package VisitorDP;

public class Client {
    public static void main(String[] args) {
        RoomElement roomElement1 = new SingleRoom();
        RoomElement roomElement2 = new DoubleRoom();
        RoomElement roomElement3 = new DeluxeRoom();

        Visitor visitor = new RoomPricesVisitor();
        roomElement1.accept(visitor);
        roomElement2.accept(visitor);
        roomElement3.accept(visitor);

        System.out.println("-------------");
        Visitor visitor1 = new RoomMaintenanceVisitor();
        roomElement1.accept(visitor1);
        roomElement2.accept(visitor1);
        roomElement3.accept(visitor1);
    }
}
