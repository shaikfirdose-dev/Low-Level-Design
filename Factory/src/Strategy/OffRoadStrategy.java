package Strategy;

public class OffRoadStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Off road capabilities");
    }
}
