package Service.Impl;

import Service.Hotel;
import Service.Menu;
import Service.MenuImpl.BothMenu;

public class BothRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new BothMenu();
    }
}
