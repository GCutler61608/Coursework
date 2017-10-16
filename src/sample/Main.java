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

        stage.setTitle("Hello World");
        stage.setScene(scene);
        scene.getStylesheets().add("stylesheet.css");
        scene.setFill(Color.rgb(89, 89, 89));


        stage.setOnCloseRequest((WindowEvent we) -> exitPrompt(we));

        stage.show(); //THIS IS WHEN THE STAGE IS LAUNCHED

        VBox leftPane = new VBox(20);
        Button leftButton1 = new Button("I am left.");
        leftButton1.getStyleClass().add("funky_button");
        leftPane.getChildren().add(leftButton1);
        Button leftButton2 = new Button("I am left again.");
        leftButton2.getStyleClass().add("funky_button");
        leftPane.getChildren().add(leftButton2);
        root.setLeft(leftPane);
        leftPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(leftPane, Pos.CENTER_LEFT);

        VBox rightPane = new VBox(20);
        Button rightButton1 = new Button("I am right.");
        rightButton1.getStyleClass().add("funky_button");
        rightPane.getChildren().add(rightButton1);
        Button rightButton2 = new Button("I am right again.");
        rightButton2.getStyleClass().add("funky_button");
        rightPane.getChildren().add(rightButton2);
        root.setRight(rightPane);
        rightPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(rightPane, Pos.CENTER_RIGHT);

        VBox topPane = new VBox(20);
        Button topButton1 = new Button("I am top.");
        topButton1.getStyleClass().add("funky_button");
        topPane.getChildren().add(topButton1);
        Button topButton2 = new Button("I am top again.");
        topButton2.getStyleClass().add("funky_button");
        topPane.getChildren().add(topButton2);
        root.setTop(topPane);
        topPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(topPane, Pos.TOP_CENTER);

        HBox bottomPane = new HBox(20);
        Button backwardsButton = new Button("Backwards");
        backwardsButton.getStyleClass().add("funky_button");
        bottomPane.getChildren().add(backwardsButton);
        Image playButtonImage = new Image("play-button.jpg");

        Button playPause = new Button("Pause/Play", new ImageView(playButtonImage));
        playPause.getStyleClass().add("funky_button");
        playPause.setOnAction((ActionEvent ae) -> nothing(ae));
        bottomPane.getChildren().add(playPause);

        Button forwardsButton = new Button("Forwards");
        forwardsButton.getStyleClass().add("funky_button");
        forwardsButton.setOnAction((ActionEvent ae) -> nothing(ae));


        bottomPane.getChildren().add(forwardsButton);
        root.setBottom(bottomPane);
        bottomPane.setAlignment(Pos.CENTER_LEFT);
        BorderPane.setAlignment(bottomPane, Pos.BASELINE_CENTER);

        VBox centerPane = new VBox(20);
        Button centerButton1 = new Button("I am centre.");
        centerButton1.getStyleClass().add("funky_button");
        centerButton1.setOnAction((ActionEvent ae) -> nothing(ae));
        centerPane.getChildren().add(centerButton1);

        Button centerButton2 = new Button("I am centre again.");
        centerPane.getChildren().add(centerButton2);

        root.setCenter(centerPane);
        centerPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(centerPane, Pos.CENTER);

        /*HBox boxOfButtons = new HBox(10);
        Button[] myButtons = new Button[5];

        myButtons[0] = new Button("Button number one");
        myButtons[0].setPrefSize(200, 50);
        myButtons[0].setOnAction((ActionEvent ae) -> onion(ae));

        myButtons[1] = new Button("Button number two");
        myButtons[1].setPrefSize(200, 50);
        myButtons[1].setOnAction((ActionEvent ae) -> nothing(ae));
        myButtons[1].setStyle( "-fx-border-color: transparent;" +
                "-fx-border-width: 0;" +
                "-fx-background-radius: 0;" +
                "-fx-background-color: navy;" +
                "-fx-font-size: 10;" +
                "-fx-font-family: monospace;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: white;");

        myButtons[2] = new Button("Button number three");
        myButtons[2].setPrefSize(200, 50);
        myButtons[2].setOnAction((ActionEvent ae) -> onion(ae));

        myButtons[3] = new Button("Button number four");
        myButtons[3].setPrefSize(200, 50);
        myButtons[3].setOnAction((ActionEvent ae) -> onion(ae));

        myButtons[4] = new Button("Button number five");
        myButtons[4].setPrefSize(200, 50);
        myButtons[4].setOnAction((ActionEvent ae) -> onion(ae));
        myButtons[4].getStyleClass().add("funky_button");


        boxOfButtons.getChildren().addAll(myButtons);





        root.getChildren().add(boxOfButtons);*/
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