package Model;

public class Songs {

    private int id;
    private int duration;
    private String name;
    private int dateAdded;
    private int albumID;
    private String featuredArtistsID;


    public Songs(int id, int duration, String name, int dateAdded, int albumID, String featuredArtistsID) {
        this.id = id;
        this.duration = duration;
        this.name = name;
        this.dateAdded = dateAdded;
        this.albumID = albumID;
        this.featuredArtistsID = featuredArtistsID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getFeaturedArtistsID() {
        return featuredArtistsID;
    }

    public void setFeaturedArtistsID(String featuredArtistsID) {
        this.featuredArtistsID = featuredArtistsID;
    }
}
