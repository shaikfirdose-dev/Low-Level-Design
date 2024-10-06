import Constants.CarModelType;
import Interface.MyCar;
import Model.SUVCar;

public class ParkingFactory {


    public static MyCar getCarInstance(CarModelType carModelType, int startTIme){
        MyCar car = null;
        if(carModelType.equals(CarModelType.SUV)){
            return new SUVCar(CarModelType.SUV, startTIme);
        }
        else if(carModelType.equals(CarModelType.HATCHBACK)){
            return new SUVCar(CarModelType.HATCHBACK, startTIme);
        }
        return car;
    }

    public static void parkTheCar(MyCar car, ParkingSystem parkingSystem){

        switch (car.getCarModelType()){
            case SUV -> {
                if(parkingSystem.getSuvCapacity()>0){
                    parkingSystem.setSuvCapacity(parkingSystem.getSuvCapacity()-1);
                }
                else {
                    System.out.println("No parking slot left for SUV.");
                }
            }
            case HATCHBACK -> {
                if(parkingSystem.getHatchbackCapacity()>0){
                    parkingSystem.setHatchbackCapacity(parkingSystem.getHatchbackCapacity()-1);
                }
                else if(parkingSystem.getSuvCapacity()>0){
                    parkingSystem.setSuvCapacity(parkingSystem.getSuvCapacity()-1);
                    car.setSUVParkingUsing(true);
                }
                else {
                    System.out.println("Parking is full.");
                }
            }
        }
    }

    public static int checkOut(MyCar car, ParkingSystem parkingSystem, int endTime){
        if(car.getCarModelType().equals(CarModelType.SUV)){
            parkingSystem.setSuvCapacity(parkingSystem.getSuvCapacity() + 1);

        }
        else if(car.getCarModelType().equals(CarModelType.HATCHBACK)){
            if(car.isSUVParkingUsing()) {
                parkingSystem.setSuvCapacity(parkingSystem.getSuvCapacity() + 1);
            }
            else{
                parkingSystem.setHatchbackCapacity(parkingSystem.getHatchbackCapacity()+1);
            }
        }

        return (endTime-car.getStartTime())* car.getPrice();
    }
}
