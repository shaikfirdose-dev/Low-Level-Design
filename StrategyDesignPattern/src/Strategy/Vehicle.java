package Strategy;

public class Vehicle {
    private VehicleStrategy vehicleStrategy;

    public Vehicle(VehicleStrategy vehicleStrategy){
        this.vehicleStrategy = vehicleStrategy;
    }

    public void drive(){
        vehicleStrategy.drive();
    }
}
