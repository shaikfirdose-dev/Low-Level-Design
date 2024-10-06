package Service.Impl;

import Service.Hotel;
import Service.Menu;
import Service.MenuImpl.NonVegMenu;

public class NonVegRestaurant implements Hotel {
    @Override
    public Menu getMenu() {
        return new NonVegMenu();
    }
}
