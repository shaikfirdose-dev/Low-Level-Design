package Service;

import Service.Impl.ILivingThingsImplementer;

public class Tree extends LivingThings{

    public Tree(ILivingThingsImplementer livingThingsImplementer){
        super(livingThingsImplementer);
    }

    @Override
    public void breathingProcess() {
        livingThingsImplementer.breathingProcess();
    }
}
