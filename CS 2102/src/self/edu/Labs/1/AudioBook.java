package Labs;

/**
 * @author Stephen Andrews
 */
public class AudioBook extends MediaItem implements Published {

    private int duration;

    private String publisher;

    private int release;

    public AudioBook(String title, int duration, String publisher, int release) {
        super(title);
        this.duration = duration;
        this.publisher = publisher;
        this.release = release;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public int getRelease() {
        return release;
    }
}
