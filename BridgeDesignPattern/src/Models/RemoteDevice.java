package Models;

public class RemoteDevice {
    private Device device;

    public RemoteDevice(Device device){
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }

    public void setVolume(int volume){
        device.setVolume(volume);
    }
}
