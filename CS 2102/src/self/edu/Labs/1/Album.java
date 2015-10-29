package Labs;

/**
 * @author Stephen Andrews
 */
public class Album extends MediaItem implements Published {

    private String artist;

    private Collection<Song> songs;

    private String publisher;

    private int release;

    public Album(String title, Collection<Song> songs, String publisher, int release) {
        super(title);
        this.songs = songs;
        this.publisher = publisher;
        this.release = release;
    }

    public Collection<Song> getSongs() {
        return songs;
    }

    @Override
    public int getDuration() {
        int albumDuration = 0;
        for (Song song : songs.getCollection()) {
            albumDuration += song.getDuration();
        }

        return albumDuration;
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
