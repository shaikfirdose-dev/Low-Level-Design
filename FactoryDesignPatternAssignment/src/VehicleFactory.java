public class VehicleFactory {
    public IVehicle createVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(vehicleType.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else if(vehicleType.equalsIgnoreCase("MotorCycle")){
            return new MotorCycle();
        }
        throw new IllegalArgumentException("Unknown vehicle type");
    }
}
