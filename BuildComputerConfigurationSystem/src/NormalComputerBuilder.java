import Model.Computer;

public class NormalComputerBuilder implements ComputerBuilder{

    private final Computer computer;

    NormalComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void addCPU() {
        computer.setCpu("Intel Core i5");
    }

    @Override
    public void addGPU() {
        computer.setGpu("Intel Iris");
    }

    @Override
    public void addRAM() {
        computer.setRam("8 GB");
    }

    @Override
    public void addStorage() {
        computer.setStorage("512GB");
    }

    @Override
    public void addPowerSupply() {
        computer.setPowerSupply("500W");
    }

    @Override
    public void addMotherBoard() {
        computer.setMotherBoard("MSI B560M PRO-VDH");
    }

    @Override
    public void addCase() {
        computer.setComputerCase("Cooler Master MasterBox Q300L");
    }

    @Override
    public void addCollingSystem() {
        computer.setCoolingSystem("Stock Intel Cooler");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
