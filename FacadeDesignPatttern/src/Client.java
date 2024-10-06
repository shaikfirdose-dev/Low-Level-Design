import Service.Hotel;
import Service.HotelKeeper;
import Service.Impl.HotelKeeperImpl;
import Service.Impl.VegRestaurant;
import Service.Menu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeperImpl();
        Menu vegMenu = hotelKeeper.getVegRestaurant();
        System.out.println(vegMenu.getListOfItems());
    }
}