//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String os = "MacOS";
        GUIAbstractFactory factory;

        if(os.equalsIgnoreCase("MacOs")){
            factory = new MacFactory();
        }
        else if(os.equalsIgnoreCase("windows")){
            factory = new WindowsFactory();
        }
        else{
            throw new IllegalArgumentException("Unknown os type");
        }

        Application app = new Application(factory);
        app.render();

    }
}