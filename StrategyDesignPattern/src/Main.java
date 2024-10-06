import Strategy.Lamborgini;
import Strategy.Scorpio;
import Strategy.Thor;
import Strategy.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Lamborgini();
        vehicle.drive();
    }
}