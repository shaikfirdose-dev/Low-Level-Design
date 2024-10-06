package Models;

import Interface.IWeighingMachine;

public class WeightingMachineForBabies implements IWeighingMachine {
    @Override
    public double getWeightInPounds() {
        return 28.0;
    }
}
