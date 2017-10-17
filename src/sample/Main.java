package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sun.plugin2.util.ColorUtil;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Optional;

public class Main extends Application {




    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();

        Scene scene = new Scene(root, 1024, 768, Color.rgb(89, 89, 89));

        stage.setTitle("ok hi");
        stage.setScene(scene);
        scene.getStylesheets().add("stylesheet.css");
        scene.setFill(Color.rgb(89, 89, 89));


        stage.setOnCloseRequest((WindowEvent we) -> exitPrompt(we));

        stage.show(); //THIS IS WHEN THE STAGE IS LAUNCHED


        VBox boxOfButtons = new VBox(10);

        Button[] myButtons = new Button[5];

        myButtons[0] = new Button("Button number one");
        myButtons[0].setPrefSize(200, 50);
        myButtons[0].setOnAction((ActionEvent ae) -> nothing());

        myButtons[1] = new Button("Button number two");
        myButtons[1].setPrefSize(200, 50);
        myButtons[1].setOnAction((ActionEvent ae) -> nothing());

        myButtons[2] = new Button("Button number three");
        myButtons[2].setPrefSize(200, 50);
        myButtons[2].setOnAction((ActionEvent ae) -> nothing());

        myButtons[3] = new Button("Button number four");
        myButtons[3].setPrefSize(200, 50);
        myButtons[3].setOnAction((ActionEvent ae) -> nothing());

        myButtons[4] = new Button("Button number five");
        myButtons[4].setPrefSize(200, 50);
        myButtons[4].setOnAction((ActionEvent ae) -> nothing());

        boxOfButtons.getChildren().addAll(myButtons);

        root.getChildren().add(boxOfButtons);

    }

    private void nothing(ActionEvent ae) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("alertt");
        alert.setHeaderText(null);
        alert.setContentText("nothing hear yet :))");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }


    public static void exitPrompt(WindowEvent we) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("ok bye");
        alert.setHeaderText("confirm to exit");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            we.consume();
        }

    }
}