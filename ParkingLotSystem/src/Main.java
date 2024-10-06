import Constants.CarModelType;
import Interface.MyCar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = ParkingSystem.getInstance(5,2);
        MyCar suvCar = ParkingFactory.getCarInstance(CarModelType.SUV,2);
        MyCar hatchBackCar = ParkingFactory.getCarInstance(CarModelType.HATCHBACK,1);
        ParkingFactory.parkTheCar(suvCar, parkingSystem);
        System.out.println(ParkingFactory.checkOut(suvCar,parkingSystem,5));
    }
}