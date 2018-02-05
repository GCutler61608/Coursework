package Model;
import javafx.beans.property.SimpleStringProperty;

public class SongsView {

    private int songID;
    private int albumID;
    private int artistID;
    private int songDuration;
    private SimpleStringProperty songName;
    private int featureID;
    private int songDateAdded;
    public SongsView (int songID, int featureID, int songDateAdded, int albumID, int artistID, int songDuration, String songName) {
        this.songID = songID;
        this.albumID = albumID
        this.artistID = artistID;
        this.songDuration = songDuration;
        this.songDateAdded = songDateAdded;
        this.featureID = featureID;
        this.songName = new SimpleStringProperty(songName);
    }

    public int getSongID() { return songID; }
    public int getAlbumID() { return albumID; }
    public int getArtistID() { return artistID; }
    public int getSongDuration() { return songDuration; }
    public String getSongName() { return songName.get(); }
    public SimpleStringProperty songNameProperty() { return songName; }
    public int getFeatureID() { return featureID; }
    public int getSongDateAdded() { return songDateAdded; }
}
