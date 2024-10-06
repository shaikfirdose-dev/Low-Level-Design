package Factory;

import NullDP.Car;
import NullDP.NullVehicle;
import NullDP.Vehicle;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType){
        if("Car".equals(vehicleType)){
            return new Car();
        }
        return new NullVehicle();
    }
}
