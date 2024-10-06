import Models.Button;
import Models.CheckBox;

interface GUIAbstractFactory {
    Button createButton();
    CheckBox createCheckBox();
}
