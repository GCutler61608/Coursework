package Model;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.scene.control.Button;

import static Model.Main.doSomething;

public class SongTable {

    static Pane parent;

    public songTable(Pane theParent) {

        Stage stage = new Stage();
        parent = theParent;
        parent.setDisable(true);
        start(stage);

    }

    public void start(Stage stage) {

        Pane root = new Pane();
        Scene scene = new Scene(root, 819, 614);
        scene.getStylesheets().add("resources/stylesheet.css");
        stage.setTitle("Import Music");
        stage.setScene(scene);
        stage.setOnCloseRequest((WindowEvent we) -> closeStage(stage));
        stage.show();

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);
        root.getChildren().add(scrollPane);

        TilePane tilePane = new TilePane();
        tilePane.prefWidthProperty().bind(root.widthProperty());
        tilePane.prefHeightProperty().bind(root.heightProperty());
        tilePane.setHgap(10);
        tilePane.setVgap(10);
        tilePane.setPadding(new Insets(20));
        scrollPane.setContent(tilePane);


        for (int i = 1; i <= 256; i++) {
            Button exampleButton = new Button(Integer.toString(i));
            exampleButton.setPrefSize(100, 100);
            exampleButton.setOnAction((ActionEvent ae) -> doSomething(ae));
            tilePane.getChildren().add(exampleButton);
        }

    }

    public void closeStage(Stage stage) {

        parent.setDisable(false);
        stage.close();

    }

}
