import java.util.ArrayList;

/**
 * Class that represents a CD player.
 * @author Seth Baugh
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructor to create the CD object. 
     * @param song1 first song to go into the arrayList.
     * @param song2 second song to go into the arrayList.
     * @param song3 third song to go into the arrayList.
     * @param song4 fourth song to go into the arrayList.
     * @param song5 fifth song to go into the arrayList.
     */
    CD(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

    }

    /**
     * Method that plays the album starting from the beginning.
     * @return String that represents what happened.
     */
    public String playFromBeginning() {
        currentIndex = 1;
        return "Playing song 1: " + songs.get(0);

    }

    /**
     * Plays the song that is inputted as a parameter.
     * @param num song number to be played.
     * @return String that represents what happened.
     */
    public String playSong(int num) {
        if (num < 0 || num >= 5)
            return "Not a valid song number";

        currentIndex++;
        return "Playing song " + num + ": " + songs.get(num - 1);

    }

    /**
     * Plays the previous song.
     * @return String that represents what happened.
     */
    public String prevSong() {
        if (currentIndex != 0)
            currentIndex--;
        else
            currentIndex = 3;

        return "Skipping back and playing: " + songs.get(currentIndex - 1);

    }

    /**
     * Plays the next song.
     * @return String that represents what happened.
     */
    public String nextSong() {
        currentIndex++;
        int num = currentIndex;

        if (currentIndex == 6) {
            currentIndex = 0;
            num = 1;
        }

        return "Playing " + num + ": " + songs.get(num - 1);
    }

    /**
     * Stops the album and ejects it.
     * @return String that represents what happened.
     */
    public String stop() {
        return "Stopping cassett and ejecting";
    }

    /**
     * Pauses the current song.
     * @return String that represents what happened.
     */
    public String pause() {
        return "Pausing...";
    }

}
