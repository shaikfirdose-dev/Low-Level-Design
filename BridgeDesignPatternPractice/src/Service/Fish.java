package Service;

import Service.Impl.ILivingThingsImplementer;

public class Fish extends LivingThings{

    public Fish(ILivingThingsImplementer livingThingsImplementer){
        super(livingThingsImplementer);
    }

    @Override
    public void breathingProcess() {
        livingThingsImplementer.breathingProcess();
    }
}
