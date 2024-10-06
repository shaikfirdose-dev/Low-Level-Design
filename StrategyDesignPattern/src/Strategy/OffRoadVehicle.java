package Strategy;

public class OffRoadVehicle implements VehicleStrategy{
    @Override
    public void drive() {
        System.out.println("Offroad vehicle driving");
    }
}
