import Model.Computer;

public interface ComputerBuilder {
    void addCPU();
    void addGPU();
    void addRAM();
    void addStorage();
    void addPowerSupply();
    void addMotherBoard();
    void addCase();
    void addCollingSystem();

    Computer build();
}
