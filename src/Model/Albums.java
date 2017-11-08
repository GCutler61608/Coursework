package Model;

public class Albums {

    private int id;
    private int artist_ID;
    private String art_blob;

    public Albums(int id, int artist_ID, String art_blob) {
        this.id = id;
        this.artist_ID = artist_ID;
        this.art_blob = art_blob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArtist_ID() {
        return artist_ID;
    }

    public void setArtist_ID(int artist_ID) {
        this.artist_ID = artist_ID;
    }

    public String getArt_blob() {
        return art_blob;
    }

    public void setArt_blob(String art_blob) {
        this.art_blob = art_blob;
    }
}
