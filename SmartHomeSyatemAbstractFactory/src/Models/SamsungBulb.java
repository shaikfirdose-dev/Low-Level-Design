package Models;

public class SamsungBulb implements SmartBulb{
    @Override
    public void turnOn() {
        System.out.println("Turning on Samsung smart bulb");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off Samsung smart bulb");
    }
}
