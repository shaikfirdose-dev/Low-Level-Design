package Bridge;

public class Dog extends LivingThings{
    public Dog(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breatheProcess() {
        breathImplementor.breath();
    }
}
