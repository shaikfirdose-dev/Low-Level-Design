package Models;

public class Radio implements Device{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Radio turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turn off");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume of Radio "+volume);
    }
}
