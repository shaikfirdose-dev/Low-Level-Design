import Factories.PhillipsFactory;
import Factories.SamsungFactory;
import Factories.SmartHomeFactory;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String factoryType = sc.next();
        SmartHomeFactory factory;

        if(factoryType.equalsIgnoreCase("Phillips")){
            factory = new PhillipsFactory();
        }
        else if(factoryType.equalsIgnoreCase("Samsung")){
            factory = new SamsungFactory();
        }
        else{
            sc.close();
            throw new IllegalArgumentException("Unknown type factory");
        }

        SmartHomeSystem smartHome = new SmartHomeSystem(factory);
        smartHome.turnOffBulb();
        smartHome.setTemperature(72);
        smartHome.startCamera();

        smartHome.currentStatus();

    }
}