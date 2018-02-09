package Model;
import javafx.beans.property.SimpleStringProperty;

public class SongsView {

    private final SimpleStringProperty songName;
    private final SimpleStringProperty songDateAdded;

    public SongsView (String songName, String songDateAdded) {
        this.songName = new SimpleStringProperty(songName);
        this.songDateAdded = new SimpleStringProperty(songDateAdded);
    }

    public String getSongName() { return songName.get(); }
    public void setSongName(String songName) { this.songName.set(songName); }

    public String getSongDateAdded() { return songDateAdded.get(); }
    public void setSongDateAdded(String songDateAdded) { this.songDateAdded.set(songDateAdded); }

}
