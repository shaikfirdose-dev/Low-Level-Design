package Models;

import IService.ICarService;

public class Scorpio implements ICarService {
    @Override
    public void start() {
        System.out.print("Scorpio is starting...");
    }

    @Override
    public void stop() {
        System.out.print("Scorpio is Shutting down...");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
