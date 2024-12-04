package Command;

public class TurnOffAcButton implements ICommand{
    AirConditioner ac;

    public TurnOffAcButton(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.acTurnOff();
    }

    @Override
    public void undo() {
        ac.acTurnOn();
    }
}
