package Strategy;

public class NormalCar extends Vehicle{
    public NormalCar() {
        super(new NormalStrategy());
    }
}
