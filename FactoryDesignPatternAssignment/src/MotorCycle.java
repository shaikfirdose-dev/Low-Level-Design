public class MotorCycle implements IVehicle{
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
        int noOfWheels = getNumberOfWheels();
        System.out.println("This vehicle has "+ noOfWheels+" wheels");
    }

    @Override
    public int getNumberOfWheels() {
        return 2;
    }
}
