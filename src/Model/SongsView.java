package Model;
import javafx.beans.property.SimpleStringProperty;

public class SongsView {

    private final SimpleStringProperty songName;
    private final SimpleStringProperty songDateAdded;
    //private final int songDuration;

    public SongsView (String songName, String songDateAdded) {
        this.songName = new SimpleStringProperty(songName);
        this.songDateAdded = new SimpleStringProperty(songDateAdded);
       // this.songDuration =  new songDuration;
    }

    public String getSongName() { return songName.get(); }
    public void setSongName(String songName) { this.songName.set(songName); }

    public String getSongDateAdded() { return songDateAdded.get(); }
    public void setSongDateAdded(String songDateAdded) { this.songDateAdded.set(songDateAdded); }

    /*public int getSongDuration() { return songDuration.get(); }
    public void setSongDuration(int songDuration) { this.songDuration = songDuration; }*/
}
