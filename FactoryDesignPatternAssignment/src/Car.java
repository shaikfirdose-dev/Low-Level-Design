public class Car implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Car Engine Started");
        int noOfWheels = getNumberOfWheels();
        System.out.println("This vehicle has "+ noOfWheels+" wheels");
    }

    @Override
    public int getNumberOfWheels() {
        return 4;
    }
}
