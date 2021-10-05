package A_Z_zad_4;

import java.util.ArrayList;
import java.util.HashMap;

// doraditi nisam dovrsia

public class DB_Movies {
    private HashMap<Movie, ArrayList<Actor>> movies;

    public DB_Movies() {

    }

    public void putMovie2DB(Movie mov) {
        movies.put(mov, mov.getActors());
    }

    public void listAllMovies4Actor(Actor act) {

    }

}
