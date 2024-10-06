package Controller;

import Enums.City;
import Models.Theatre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {

    Map<City, List<Theatre>> cityVsTheatres;
    List<Theatre> allTheatres;

    public TheatreController(){
        cityVsTheatres = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre theatre){
        allTheatres.add(theatre);
        List<Theatre> theatres = cityVsTheatres.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityVsTheatres.put(city, theatres);
    }
}
