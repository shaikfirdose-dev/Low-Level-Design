package BuilderDesign;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder(){
        this.car = new Car();
    }
    @Override
    public void name(String name) {
        this.car.setName(name);
    }

    @Override
    public void seats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void stearingType(String stearing) {
        this.car.setStearingType(stearing);
    }

    @Override
    public void color(String color) {
        this.car.setColor(color);
    }

    @Override
    public void acOrNonAC(String acType) {
        this.car.setAcOrNonAc(acType);
    }

    @Override
    public void automatic(boolean automatic) {
        this.car.setAutomatic(automatic);
    }

    @Override
    public Car build() {
        return this.car;
    }
}
