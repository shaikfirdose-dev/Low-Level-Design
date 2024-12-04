package Bridge;

public class Fish extends LivingThings{
    public Fish(BreathImplementor breathImplementor) {
        super(breathImplementor);
    }

    @Override
    public void breatheProcess() {
        breathImplementor.breath();
    }
}
