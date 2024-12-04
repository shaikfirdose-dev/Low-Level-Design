package AbstractFactory;

import AbstractFactory.Button.Button;
import AbstractFactory.FamiliesOfFactories.GUIFactory;

public class Application {

    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory){
        this.factory = factory;
        this.button = factory.createButton();
        func();
    }

    public void func(){
        button.paint();
    }
}
