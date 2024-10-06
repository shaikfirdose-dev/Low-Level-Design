package Strategy;

public class NormalVehicle implements VehicleStrategy{
    @Override
    public void drive() {
        System.out.println("Normal vehicle is driving!!");
    }
}
