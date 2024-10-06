public class Scorpio implements IScorpioPrototype{

    ScorpioEngine engine;
    Scorpio(){
        this.engine = new ScorpioEngine();

    }
    @Override
    public IScorpioPrototype clone() {
        return new Scorpio();
    }

    @Override
    public void setEngine(ScorpioEngine eng) {
        this.engine = eng;
    }

    @Override
    public void start() {
        System.out.println("Engine started...");
    }
}
