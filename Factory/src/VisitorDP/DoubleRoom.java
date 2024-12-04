package VisitorDP;

public class DoubleRoom implements RoomElement{
    int roomPrice = 0;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
