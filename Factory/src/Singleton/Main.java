package Singleton;

public class Main {

    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingLot parkingLot1 = ParkingLot.getInstance();
    }
}
