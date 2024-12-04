package Command;

//Receiver
public class AirConditioner {
    private boolean isOn;
    private int temp;

    public AirConditioner(){

    }

    public void acTurnOn(){
        this.isOn = true;
        System.out.println("Ac turned On...");
    }

    public void acTurnOff(){
        this.isOn = false;
        System.out.println("Ac turned Off...");
    }
}
