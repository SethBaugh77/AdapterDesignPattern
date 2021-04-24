/**
 * Interface that contains method that Cassett and Analog Adaptor implement from. 
 */
public interface AnalogAlbum {
    /**
     * Method that plays the song.
     * @return String that represents what is being done.
     */
    public String play();

    /**
     * Method that rewinds the album.
     * @return String that represents what is being done.
     */
    public String rewind();

    /**
     * Method that fast forwards the album.
     * @return String that represents what is being done.
     */
    public String ffwd();

    /**
     * Method that pauses the song.
     * @return String that represents what is being done.
     */
    public String pause();

    /**
     * Method that stops and ejects the song.
     * @return String that represents what is being done.
     */
    public String stopEject();

}
