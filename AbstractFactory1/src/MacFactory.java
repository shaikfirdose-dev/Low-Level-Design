import Models.Button;
import Models.CheckBox;
import Models.MacButton;
import Models.MacCheckBox;

public class MacFactory implements GUIAbstractFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
