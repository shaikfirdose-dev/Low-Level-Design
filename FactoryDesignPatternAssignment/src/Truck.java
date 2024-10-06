public class Truck implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("TruckEngine started");
        int noOfWheels = getNumberOfWheels();
        System.out.println("This vehicle has "+ noOfWheels+" wheels");
    }

    @Override
    public int getNumberOfWheels() {
        return 6;
    }
}
