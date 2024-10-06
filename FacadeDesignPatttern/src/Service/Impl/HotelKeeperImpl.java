package Service.Impl;

import Service.Hotel;
import Service.HotelKeeper;
import Service.Menu;
import Service.MenuImpl.BothMenu;
import Service.MenuImpl.NonVegMenu;
import Service.MenuImpl.VegMenu;

public class HotelKeeperImpl implements HotelKeeper {

    @Override
    public Menu getVegRestaurant() {
        Hotel vegRestaurant = new VegRestaurant();
        Menu vegMenu = vegRestaurant.getMenu();
        return vegMenu;
    }

    @Override
    public Menu getNonVegRestaurant() {
        Hotel nonVegRestaurant = new NonVegRestaurant();
        Menu nonVegMenu = nonVegRestaurant.getMenu();
        return nonVegMenu;
    }

    @Override
    public Menu getBothRestaurant() {
        Hotel bothRestaurant = new BothRestaurant();
        Menu bothMenu = bothRestaurant.getMenu();
        return bothMenu;
    }
}
