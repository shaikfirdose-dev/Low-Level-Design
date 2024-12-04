package Command;

public class TurnOnAcButton implements ICommand{
    AirConditioner ac;

    public TurnOnAcButton(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.acTurnOn();
    }

    @Override
    public void undo() {
        ac.acTurnOff();
    }
}
