package Models;

public class SamsungCamera implements SmartCamera{
    @Override
    public void startRecording() {
        System.out.println("Starting the Samsung Smart Camera...");
    }

    @Override
    public void stopRecording() {
        System.out.println("Stopping the Samsung Smart Camera...");
    }
}
