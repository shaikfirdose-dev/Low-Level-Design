import Constants.CarModelType;

public class ParkingSystem {
    private int totalCapacity;
    private int suvCapacity;
    private int hatchbackCapacity;

    private static ParkingSystem instance = null;

    private ParkingSystem(int suvCapacity, int hatchbackCapacity){
        this.suvCapacity = suvCapacity;
        this.hatchbackCapacity = hatchbackCapacity;
        this.totalCapacity = suvCapacity+hatchbackCapacity;
    }

    public static ParkingSystem getInstance(int suvCapacity, int hatchbackCapacity){
        if(instance==null){
            instance = new ParkingSystem(suvCapacity, hatchbackCapacity);
        }
        return instance;
    }

    public int getTotalCapacity(){
        return this.suvCapacity+this.hatchbackCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getSuvCapacity() {
        return suvCapacity;
    }

    public void setSuvCapacity(int suvCapacity) {
        this.suvCapacity = suvCapacity;
    }

    public int getHatchbackCapacity() {
        return hatchbackCapacity;
    }

    public void setHatchbackCapacity(int hatchbackCapacity) {
        this.hatchbackCapacity = hatchbackCapacity;
    }

    public static ParkingSystem getInstance() {
        return instance;
    }

    public static void setInstance(ParkingSystem instance) {
        ParkingSystem.instance = instance;
    }
}

