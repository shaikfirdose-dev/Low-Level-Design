package VisitorDP;

public interface Visitor {

    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
    void visit(DeluxeRoom deluxeRoom);
}
