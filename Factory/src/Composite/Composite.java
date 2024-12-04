package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    String name;
    List<Component> components = new ArrayList<>();

    public void addComposite(Component com){
        components.add(com);
    }

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void showPrices() {
        System.out.println(name);
        for(Component c : components){
            c.showPrices();
        }
    }
}
