import Models.Device;
import Models.Radio;
import Models.RemoteDevice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        Device device = new Radio();
        RemoteDevice remoteDevice = new RemoteDevice(device);
        remoteDevice.turnOn();
        remoteDevice.setVolume(15);
        remoteDevice.turnOff();
    }
}