package Models;

public class PhillipsBulb implements SmartBulb{
    @Override
    public void turnOn() {
        System.out.println("Turning on Phillips smart bulb");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Phillips smart bulb");
    }
}
