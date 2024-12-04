package Bridge;

public class Client {
    public static void main(String[] args) {
        LivingThings livingThings = new Fish(new WaterBreathing3());
        livingThings.breatheProcess();
    }
}
