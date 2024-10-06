import Factory.VehicleFactory;
import NullDP.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Vehicle vehicle = VehicleFactory.getVehicle("Bike");
        System.out.println(vehicle.getCarCapacity());
        System.out.println(vehicle.getNumberOfWheels());
    }
}