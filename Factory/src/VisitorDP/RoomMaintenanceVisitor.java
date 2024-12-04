package VisitorDP;

public class RoomMaintenanceVisitor implements Visitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single room maintenance...");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double room maintenance...");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Deluxe room maintenance...");
    }
}
