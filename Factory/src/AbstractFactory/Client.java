package AbstractFactory;

import AbstractFactory.FamiliesOfFactories.GUIFactory;
import AbstractFactory.FamiliesOfFactories.MacFactory;
import AbstractFactory.FamiliesOfFactories.WindowsFactory;

public class Client {

    public static void main(String[] args) {
        String os = "Win";
        GUIFactory factory = null;
        if(os.equalsIgnoreCase("win")){
            factory = new WindowsFactory();
        }
        else if(os.equalsIgnoreCase("Mac")){
            factory = new MacFactory();
        }
        
        Application application = new Application(factory);
    }
}
