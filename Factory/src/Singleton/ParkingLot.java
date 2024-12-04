package Singleton;

public class ParkingLot {

//    private static ParkingLot parkingLot;

    private ParkingLot(){
        System.out.println("Parkinglot object created");
    }
    public static class ParkingLotHandler{
        public static final ParkingLot parkingLot1 =  new ParkingLot();
    }
//    public synchronized static ParkingLot getInstance(){
//        if(parkingLot==null){
//            parkingLot = new ParkingLot();
//        }
//        return parkingLot;
//    }

    public static ParkingLot getInstance(){
        return ParkingLotHandler.parkingLot1;
    }
}
