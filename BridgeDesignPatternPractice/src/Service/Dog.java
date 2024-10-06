package Service;

import Service.Impl.ILivingThingsImplementer;

public class Dog extends LivingThings{

    public Dog(ILivingThingsImplementer livingThingsImplementer){
        super(livingThingsImplementer);
    }
    @Override
    public void breathingProcess() {
       livingThingsImplementer.breathingProcess();
    }
}
