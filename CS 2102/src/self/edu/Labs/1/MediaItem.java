package Labs;

/**
 * @author Stephen Andrews
 */
public abstract class MediaItem {

    private String title;

    public MediaItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getDuration();
}
