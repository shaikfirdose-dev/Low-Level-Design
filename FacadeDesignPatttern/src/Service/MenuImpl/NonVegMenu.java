package Service.MenuImpl;

import Service.Menu;

import java.util.Arrays;
import java.util.List;

public class NonVegMenu implements Menu {
    List<String> listOfItems = Arrays.asList("Chicken Masala", "Chicken Biryani");
    @Override
    public List<String> getListOfItems() {
        return listOfItems;
    }
}
