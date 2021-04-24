/**
 * Class to represent the adaptor between the Cassett and the CD.
 * @author Seth Baugh
 */
public class AnalogAdapter implements AnalogAlbum {

    private DigitalAlbum album;
    /**
     * Constructor to create the object.
     * @param album instance of album to be set equal to this.album.
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * Method that calls to instance albums method nextSong.
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * Method that calls to instance albums method prevSong.
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Method that calls to instance albums method nextSong.
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Method that calls to instance albums method pause
     */
    public String pause() {
        return album.pause();
    }

    /**
     * Method that calls to instance albums method stop.
     */
    public String stopEject() {
        return album.stop();
    }
}
