import Model.Computer;

public class Directer {

    private ComputerBuilder computerBuilder;

    Directer(ComputerBuilder computerBuilder1){
        this.computerBuilder = computerBuilder1;
    }

    public void makeComputer(){
        computerBuilder.addCase();
        computerBuilder.addCPU();
        computerBuilder.addGPU();
        computerBuilder.addRAM();
        computerBuilder.addStorage();
        computerBuilder.addMotherBoard();
        computerBuilder.addCollingSystem();
        computerBuilder.addPowerSupply();
    }

    public Computer getComputer(){
        return computerBuilder.build();
    }
}
