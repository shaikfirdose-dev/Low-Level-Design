package Bridge;

public class LandBreathing extends BreathImplementor{
    @Override
    public void breath() {
        System.out.println("inhales o2");
        System.out.println("exhales co2");
    }
}
