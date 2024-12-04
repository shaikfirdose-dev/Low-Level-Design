package Command;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac= new AirConditioner();
        MyRemoteCommand remoteObj = new MyRemoteCommand(new TurnOnAcButton(ac));
        remoteObj.pressButton();

        remoteObj.undo();
    }
}
