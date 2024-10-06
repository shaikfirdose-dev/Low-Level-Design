import Models.Button;
import Models.CheckBox;
import Models.WindowsButton;
import Models.WindowsCheckBox;

public class WindowsFactory implements GUIAbstractFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
