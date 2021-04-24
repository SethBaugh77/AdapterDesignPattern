/**
 * Interface that CD implements from.
 */
public interface DigitalAlbum {
    /**
     * Method that plays the songs starting from the first song.
     * @return String that represents what happened.
     */
    public String playFromBeginning();

    /**
     * Method that plays the song that is inputted as a parameter.
     * @param num song to be played.
     * @return String that represents what happened.
     */
    public String playSong(int num);

    /**
     * Method that plays the previous song.
     * @return String that represents what happened.
     */
    public String prevSong();

    /**
     * Method that plays the next Song.
     * @return String that represents what happened.
     */
    public String nextSong();

    /**
     * Method that stops the CD player.
     * @return String that represents what happened.
     */
    public String stop();

    /**
     * Method that pauses the current song.
     * @return String that represents what happened.
     */
    public String pause();
}
