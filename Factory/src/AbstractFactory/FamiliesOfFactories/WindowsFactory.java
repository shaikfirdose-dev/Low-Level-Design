package AbstractFactory.FamiliesOfFactories;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.WinButton;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.CheckBox.WinCheckBox;

public class WindowsFactory implements GUIFactory{


    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
