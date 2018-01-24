package Model;

public class Features {

    private int featureID;
    private int artistID;

    public Features(int featureID, int artistID) {
        this.featureID = featureID;
        this.artistID = artistID;
    }

    public int getFeatureID() {
        return featureID;
    }

    public void setFeatureID(int featureID) {
        this.featureID = featureID;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }
}
