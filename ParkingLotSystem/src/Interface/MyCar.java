package Interface;

import Constants.CarModelType;

public abstract class MyCar {
    private CarModelType carModelType;
    private int price;
    private int startTime;
    private boolean isSUVParkingUsing;

    public MyCar(CarModelType carModelType, int startTime){
        if(carModelType.equals(CarModelType.SUV)){
            this.price = 20;
        }
        else if(carModelType.equals(CarModelType.HATCHBACK)){
            this.price = 10;
        }
        this.startTime = startTime;
    }

    public CarModelType getCarModelType() {
        return carModelType;
    }

    public void setCarModelType(CarModelType carModelType) {
        this.carModelType = carModelType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public boolean isSUVParkingUsing() {
        return isSUVParkingUsing;
    }

    public void setSUVParkingUsing(boolean SUVParkingUsing) {
        isSUVParkingUsing = SUVParkingUsing;
    }
}
