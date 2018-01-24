package Model;

public class Albums {

    private int albumID;
    private int artistID;
    private String albumArtBlob;

    public Albums(int albumID, int artistID, String albumArtBlob) {
        this.albumID = albumID;
        this.artistID = artistID;
        this.albumArtBlob = albumArtBlob;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getAlbumArtBlob() {
        return albumArtBlob;
    }

    public void setAlbumArtBlob(String albumArtBlob) {
        this.albumArtBlob = albumArtBlob;
    }
}
