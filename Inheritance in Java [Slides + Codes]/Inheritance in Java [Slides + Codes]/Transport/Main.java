package Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4, 5, "Auto");
        c.startEngine();
        c.startAC();
        c.stopEngine();
        System.out.println(c.name);

//        MotorCycle m = new MotorCycle("Splendor", "Xline", 2, "U", "Soft");
//        m.startEngine();
//        m.wheelie();
//        m.stopEngine();
    }
}
