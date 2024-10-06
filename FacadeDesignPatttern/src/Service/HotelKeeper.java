package Service;

import Service.Impl.BothRestaurant;
import Service.Impl.NonVegRestaurant;
import Service.Impl.VegRestaurant;
import Service.MenuImpl.BothMenu;
import Service.MenuImpl.NonVegMenu;
import Service.MenuImpl.VegMenu;

public interface HotelKeeper {
    Menu getVegRestaurant();
    Menu getNonVegRestaurant();
    Menu getBothRestaurant();
}
