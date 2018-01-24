package Model;

public class Artists {

    private int artistID;
    private int genreID;
    private String artistName;

    public Artists(int artistID, int genreID, String artistName) {
        this.artistID = artistID;
        this.genreID = genreID;
        this.artistName = artistName;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public int getGenreID() {
        return genreID;
    }

    public void setGenreID(int genreID) {
        this.genreID = genreID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
