package Strategy;

public class Client {
    public static void main(String[] args) {
        Vehicle car = new SportCar();
        car.drive();
    }
}
