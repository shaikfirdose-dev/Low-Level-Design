package CarDecorator;

import IService.ICarService;

public class BulletProofDecorater extends CarDecorator{

    ICarService scorpio;

    public BulletProofDecorater(ICarService scorpio){
        this.scorpio = scorpio;
    }

    @Override
    public void start() {
        scorpio.start();
    }

    @Override
    public void stop() {
        scorpio.stop();
    }

    @Override
    public float getWeight() {
        return 300+scorpio.getWeight();
    }
}
