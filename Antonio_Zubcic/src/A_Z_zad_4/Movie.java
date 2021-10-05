package A_Z_zad_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Movie {
    private String movieTitle;
    private int id;
    private static int cnt = 0;
    private ArrayList<Actor> listOfActors = new ArrayList<>();
    private Date yearReleased;
    private Director director;

    public Movie(String title, String year, Director dir) {
        director = dir;
        movieTitle = title;
        try {
            yearReleased = new SimpleDateFormat("dd/MM/yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        id = cnt++;
    }

    public void addActor(Actor act) {
        listOfActors.add(act);
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return listOfActors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", id=" + id +
                ", Actors=" + listOfActors +
                ", yearReleased=" + yearReleased +
                ", director=" + director +
                '}';
    }
}
