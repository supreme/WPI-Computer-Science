package Labs;

/**
 * Created by sandrews on 10/28/15.
 */
public class Episode implements Categorizable {

    private String title;

    private int duration;

    private String genre;

    public Episode(String title, int duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }
}
