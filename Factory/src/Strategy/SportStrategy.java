package Strategy;

public class SportStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports car capabilities");
    }
}
