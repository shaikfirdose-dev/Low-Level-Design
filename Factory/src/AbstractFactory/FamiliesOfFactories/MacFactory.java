package AbstractFactory.FamiliesOfFactories;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.MacButton;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.CheckBox.MacCheckBox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
