package NullDP;

public class NullVehicle implements Vehicle{
    @Override
    public int getCarCapacity() {
        return 0;
    }

    @Override
    public int getNumberOfWheels() {
        return 0;
    }
}
