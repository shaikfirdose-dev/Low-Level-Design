package Service.MenuImpl;

import Service.Menu;

import java.util.Arrays;
import java.util.List;

public class VegMenu implements Menu {

    private List<String> listOfItems = Arrays.asList("Paneer Masala", "Veg Mesala");

    @Override
    public List<String> getListOfItems() {
        return listOfItems;
    }
}
