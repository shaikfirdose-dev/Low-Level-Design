package Controller;

import Enums.City;
import Models.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    Map<City, List<Movie>>  cityVsMovie;
    List<Movie> allMovies;

    public MovieController(){
        cityVsMovie = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    // add movie
    public void addMovie(City city, Movie movie){
         allMovies.add(movie);
         List<Movie> movies = cityVsMovie.getOrDefault(city,new ArrayList<>());
         movies.add(movie);
         cityVsMovie.put(city,movies);
    }

    public Movie getMovieByMovieName(String movieName){
        for(Movie movie: allMovies){
            if(movie.getName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city){
        return cityVsMovie.get(city);
    }

}
