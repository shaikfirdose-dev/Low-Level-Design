package Service.Impl;

import Service.Hotel;
import Service.Menu;
import Service.MenuImpl.VegMenu;

public class VegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new VegMenu();
    }
}
