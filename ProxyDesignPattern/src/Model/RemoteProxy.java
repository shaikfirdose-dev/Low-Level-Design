package Model;

public class RemoteProxy implements ICar{
    private Scorpio scorpio = Scorpio.getInstance();
    @Override
    public void turnLeft() {
        scorpio.turnLeft();
    }

    @Override
    public void turnRight() {
        scorpio.turnRight();
    }

    @Override
    public void moveFront() {
        scorpio.moveFront();
    }

    @Override
    public void moveBack() {
        scorpio.moveBack();
    }
}
