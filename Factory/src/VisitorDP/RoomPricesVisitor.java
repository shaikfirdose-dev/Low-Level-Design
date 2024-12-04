package VisitorDP;

public class RoomPricesVisitor implements Visitor{
    @Override
    public void visit(SingleRoom singleRoom) {

        singleRoom.roomPrice = 200;
        System.out.println("Single room price per day..."+singleRoom.roomPrice);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        doubleRoom.roomPrice = 500;
        System.out.println("Double room price per day..."+doubleRoom.roomPrice);
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        deluxeRoom.roomPrice = 1000;
        System.out.println("Deluxe room price per day..."+deluxeRoom.roomPrice);
    }
}
