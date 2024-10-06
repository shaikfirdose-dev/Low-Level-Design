package Models;

public class TV implements Device{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume of TV is "+volume);
    }
}
