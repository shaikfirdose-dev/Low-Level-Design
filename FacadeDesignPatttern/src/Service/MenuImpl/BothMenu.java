package Service.MenuImpl;

import Service.Menu;

import java.util.Arrays;
import java.util.List;

public class BothMenu implements Menu {

    List<String> listOfItems = Arrays.asList("Chicken Masala", "Chicken Biryani", "Paneer Masala", "Veg Biryani");
    @Override
    public List<String> getListOfItems() {
        return listOfItems;
    }
}
