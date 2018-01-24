package Model;

import javafx.beans.property.SimpleStringProperty;

public class SongsView {
    private int id;
    private final SimpleStringProperty name;
    private final SimpleStringProperty manufacturer;
    public SongsView (int id, String name, String manufacturer) {
        this.id = id;
        this.name = new SimpleStringProperty(name);
        this.manufacturer = new SimpleStringProperty(manufacturer);
    }
    public int getId() { return id; };
    public String getName() { return name.get(); }
    public String getManufacturer() { return manufacturer.get(); }
}
