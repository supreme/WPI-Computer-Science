package Labs;

/**
 * @author Stephen Andrews
 */
public class Podcast extends MediaItem implements Published {

    /**
     * Represents the different intervals to check for new episodes.
     */
    enum UpdateFrequency {
        DAILY,
        WEEKLY,
        UNCHECKED;
    }

    private String publisher;

    private int release;

    private Collection<Episode> episodes;

    private UpdateFrequency updateFrequency;

    public Podcast(String title, String publisher, int release, Collection<Episode> episodes, UpdateFrequency updateFrequency) {
        super(title);
        this.publisher = publisher;
        this.release = release;
        this.episodes = episodes;
        this.updateFrequency = updateFrequency;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public int getRelease() {
        return release;
    }

    @Override
    public int getDuration() {
        int podcastDuration = 0;
        for (Episode episode : episodes.getCollection()) {
            podcastDuration += episode.getDuration();
        }

        return podcastDuration;
    }

    public Collection<Episode> getEpisodes() {
        return episodes;
    }

    public UpdateFrequency getUpdateFrequency() {
        return updateFrequency;
    }
}
