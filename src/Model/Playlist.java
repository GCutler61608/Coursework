package Model;

public class Playlist {

    private int id;
    private int song_ID;
    private String art_blob;
    private String name;
    private String desc;
    private String creationDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSong_ID() {
        return song_ID;
    }

    public void setSong_ID(int song_ID) {
        this.song_ID = song_ID;
    }

    public String getArt_blob() {
        return art_blob;
    }

    public void setArt_blob(String art_blob) {
        this.art_blob = art_blob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Playlist(int id, int song_ID, String art_blob, String name, String desc, String creationDate) {
        this.id = id;
        this.song_ID = song_ID;
        this.art_blob = art_blob;
        this.name = name;
        this.desc = desc;
        this.creationDate = creationDate;


    }
}
