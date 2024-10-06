import Model.Computer;

public class GamingComputerBuilder implements ComputerBuilder{
    private final Computer computer;

    GamingComputerBuilder(){
        this.computer = new Computer();
    }
    @Override
    public void addCPU() {
        computer.setCpu("Intel Core i9-11900K");
    }

    @Override
    public void addGPU() {
        computer.setGpu("NVIDIA GeForce RTX 3080");
    }

    @Override
    public void addRAM() {
        computer.setRam("32GB DDR4");
    }

    @Override
    public void addStorage() {
        computer.setStorage("1TB NVMe SSD");
    }

    @Override
    public void addPowerSupply() {
        computer.setPowerSupply("750W");
    }

    @Override
    public void addMotherBoard() {
        computer.setMotherBoard("ASUS ROG STRIX Z590-E");
    }

    @Override
    public void addCase() {
        computer.setComputerCase("Cooler Master MasterBox Q300L");
    }

    @Override
    public void addCollingSystem() {
        computer.setCoolingSystem("NZXT H510");
    }

    @Override
    public Computer build() {
        return computer;
    }
}
