package Strategy;

public class SportCar extends Vehicle{

    public SportCar(){
        super(new SportStrategy());
    }
}
