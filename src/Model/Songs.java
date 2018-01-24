package Model;

public class Songs {
    private int songID;
    private int albumID;
    private int songDuration;
    private String songName;
    private int featureID;
    private int songDateAdded;

    public Songs(int songID, int albumID, int songDuration, String songName, int featureID, int songDateAdded) {
        this.songID = songID;
        this.albumID = albumID;
        this.songDuration = songDuration;
        this.songName = songName;
        this.featureID = featureID;
        this.songDateAdded = songDateAdded;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public void setSongDuration(int songDuration) {
        this.songDuration = songDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getFeatureID() {
        return featureID;
    }

    public void setFeatureID(int featureID) {
        this.featureID = featureID;
    }

    public int getSongDateAdded() {
        return songDateAdded;
    }

    public void setSongDateAdded(int songDateAdded) {
        this.songDateAdded = songDateAdded;
    }
}
