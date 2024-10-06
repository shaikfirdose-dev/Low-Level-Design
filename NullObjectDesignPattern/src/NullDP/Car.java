package NullDP;

public class Car implements Vehicle{

    @Override
    public int getCarCapacity() {
        return 6;
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
