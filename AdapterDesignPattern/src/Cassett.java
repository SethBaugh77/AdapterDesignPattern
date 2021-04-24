import java.util.ArrayList;

/**
 * Class to represent a Cassett Player.
 * @author Seth Baugh
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    /**
     * Constructor that creates the object.
     * @param song1 first song to go into the arrayList.
     * @param song2 second song to go into the arrayList.
     * @param song3 third song to go into the arrayList.
     * @param song4 fourth song to go into the arrayList.
     * @param song5 fifth song to go into the arrayList.
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs = new ArrayList<String>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);

    }

    /**
     * Method that plays the current song.
     * @return String that says what happened in the method. 
     */
    public String play() {
        int num = currentIndex + 1;
        if (currentIndex == 5)
            return "At the end of the cassett you need to rewind";
        currentIndex++;
        return "Playing song " + num + ": " + songs.get(currentIndex - 1);
    }

    /**
     * Method that rewinds one song. 
     * @return String that says what happened in the method. 
     */
    public String rewind() {

        int prevSong = currentIndex;
        currentIndex--;
        if (prevSong == -1)
            return "Fully Re-Wound";
        return "Rewinding to song " + prevSong;
    }

    /**
     * Method that fast forwards one song. 
     * @return String that says what happened in the method. 
     */
    public String ffwd() {

        int nextIndex = currentIndex + 1;
        if (nextIndex == 4) {
            currentIndex++;
            return "Forwarded to the end of the cassett";
        }
        if (nextIndex == 5)
            return "At the end of the cassett you need to rewind";
        currentIndex = currentIndex + 1;
        nextIndex++;
        return "Forwarding to song " + nextIndex;

    }

    /**
     * Method that pauses the current song.
     * @return String that says what happened in the method. 
     */
    public String pause() {
        return "pausing...";
    }

    /**
     * Method that stops the Cassett and ejects the album.
     * @return String that says what happened in the method. 
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";

    }
}
