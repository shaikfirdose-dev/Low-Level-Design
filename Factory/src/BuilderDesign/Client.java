package BuilderDesign;

public class Client {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director(builder);
        Car car = director.constructCar();
        System.out.println("Car Details :\n"+car);
        Car car1 = director.constructAutomaticCar();
        System.out.println(car1);
    }
}
