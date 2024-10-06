import Model.RemoteProxy;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        RemoteProxy proxy = new RemoteProxy();
        Scanner sc = new Scanner(System.in);
        while(true){
            String direction = sc.next();
            switch (direction){
                case "left": proxy.turnLeft();
                break;
                case "right": proxy.turnRight();
                    break;
                case "front": proxy.moveFront();
                    break;
                case "back": proxy.moveBack();
                    break;
                default:
                    System.out.println("Invalid move, try again");
            }
        }
    }
}