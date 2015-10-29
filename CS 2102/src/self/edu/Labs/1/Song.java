package Labs;

/**
 * @author Stephen Andrews
 */
public class Song implements Categorizable {

    private String genre;

    private String title;

    private int duration;

    public Song(String genre, String title, int duration) {
        this.genre = genre;
        this.title = title;
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
