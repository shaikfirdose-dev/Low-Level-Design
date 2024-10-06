package Service;

import Service.Impl.ILivingThingsImplementer;

public abstract class LivingThings {
    ILivingThingsImplementer livingThingsImplementer;

    public LivingThings(ILivingThingsImplementer livingThingsImplementer){
        this.livingThingsImplementer = livingThingsImplementer;
    }

    public abstract void breathingProcess();
}
