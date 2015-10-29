package Labs;

import tester.Tester;

import java.util.Arrays;
import java.util.List;

/**
 * @author Stephen Andrews
 */
public class Examples {

    private MediaItem coolAlbum = new Album("Mixtape", new Collection<Song>() {
        @Override
        public List<Song> getCollection() {
            return Arrays.asList(new Song("Rock", "Paint it Black", 300),
                                 new Song("Rap", "Labs.Song", 190));
        }
    }, "A Guy", 2005);

    private void testDuration(Tester t) {
        t.checkExpect(coolAlbum.getDuration(), 490);
    }

}
