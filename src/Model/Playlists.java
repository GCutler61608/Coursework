package Model;

public class Playlists {

    private int playlistID;
    private int songID;
    private String playlistArtBlob;
    private String playlistName;
    private String playlistDescription;
    private String playlistDateCreated;

    public Playlists(int playlistID, int songID, String playlistArtBlob, String playlistName, String playlistDescription, String playlistDateCreated) {
        this.playlistID = playlistID;
        this.songID = songID;
        this.playlistArtBlob = playlistArtBlob;
        this.playlistName = playlistName;
        this.playlistDescription = playlistDescription;
        this.playlistDateCreated = playlistDateCreated;
    }

    public int getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(int playlistID) {
        this.playlistID = playlistID;
    }

    public int getSongID() {
        return songID;
    }

    public void setSongID(int songID) {
        this.songID = songID;
    }

    public String getPlaylistArtBlob() {
        return playlistArtBlob;
    }

    public void setPlaylistArtBlob(String playlistArtBlob) {
        this.playlistArtBlob = playlistArtBlob;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public String getPlaylistDescription() {
        return playlistDescription;
    }

    public void setPlaylistDescription(String playlistDescription) {
        this.playlistDescription = playlistDescription;
    }

    public String getPlaylistDateCreated() {
        return playlistDateCreated;
    }

    public void setPlaylistDateCreated(String playlistDateCreated) {
        this.playlistDateCreated = playlistDateCreated;
    }
}
