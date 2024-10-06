import Models.Button;
import Models.CheckBox;

public class Application {
    Button button;
    CheckBox checkBox;

    Application(GUIAbstractFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void render(){
        button.render();
        checkBox.render();
    }
}
