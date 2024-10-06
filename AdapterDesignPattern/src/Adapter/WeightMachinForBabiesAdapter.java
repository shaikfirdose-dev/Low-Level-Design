package Adapter;

import Interface.IWeighingMachine;

public class WeightMachinForBabiesAdapter implements WeightMachinAdapter{
    IWeighingMachine weighingMachine;

    public WeightMachinForBabiesAdapter(IWeighingMachine weighingMachine){
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        return weighingMachine.getWeightInPounds()*.45;
    }
}
