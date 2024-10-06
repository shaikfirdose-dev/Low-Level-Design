import Adapter.WeightMachinAdapter;
import Adapter.WeightMachinForBabiesAdapter;
import Models.WeightingMachineForBabies;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeightMachinAdapter weightMachinAdapter = new WeightMachinForBabiesAdapter(new WeightingMachineForBabies());
        System.out.print(weightMachinAdapter.getWeightInKg());
    }
}