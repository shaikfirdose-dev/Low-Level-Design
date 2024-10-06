import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String vehicleType = sc.next();
            VehicleFactory vehicleFactory = new VehicleFactory();
            IVehicle vehicle = vehicleFactory.createVehicle(vehicleType);
            vehicle.startEngine();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
