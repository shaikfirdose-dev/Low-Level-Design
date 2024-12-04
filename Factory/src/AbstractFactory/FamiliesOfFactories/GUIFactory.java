package AbstractFactory.FamiliesOfFactories;

import AbstractFactory.Button.Button;
import AbstractFactory.CheckBox.CheckBox;

public interface GUIFactory {

    Button createButton();
    CheckBox createCheckBox();
}
