package Models;

public class PhillipsCamera implements SmartCamera{
    @Override
    public void startRecording() {
        System.out.println("Starting the Phillips Smart Camera...");
    }

    @Override
    public void stopRecording() {
        System.out.println("Stopping the Phillips Smart Camera...");
    }
}
