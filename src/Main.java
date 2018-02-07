package Model;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;

public class Main extends Application {
    private static ActionEvent ae;

    public static DatabaseConnection database;

    @Override
    public void start(Stage stage) throws Exception {

        database = new DatabaseConnection("Songs.db");

      //  BorderPane root = new BorderPane();
        TableView table = new TableView<>();


        Scene scene = new Scene(table, 1024, 768, Color.RED);
        stage.setTitle("Music Library");
        stage.setScene(scene);
        scene.getStylesheets().add("resources/stylesheet.css");

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(true);




        ObservableList<SongsView> song = FXCollections.observableArrayList(
                new SongsView("Duck SONG", "2/01/2011"),
                new SongsView("help", "23/12/2019")
        );

       // TableView table = new TableView<>();
        table.setPrefSize(400, 300);
        table.setItems(song);

        TableColumn songNameColumn = new TableColumn<>("Song Name");
        songNameColumn.setCellValueFactory(new PropertyValueFactory<>("songName"));
        table.getColumns().add(songNameColumn);

        TableColumn songDateAddedColumn = new TableColumn<>("Date Added");
        songDateAddedColumn.setCellValueFactory(new PropertyValueFactory<>("songDateAdded"));
        table.getColumns().add(songDateAddedColumn);

   //     root.getChildren().add(table);


        stage.setOnCloseRequest((WindowEvent we) -> exitPrompt(we));
        stage.show(); //shows the scene


        /*VBox leftPane = new VBox(20);
        Button leftButton1 = new Button("I am left.");
        leftButton1.setOnAction((ActionEvent ae) -> doSomething(ae));
        leftPane.getChildren().add(leftButton1);
        Button leftButton2 = new Button("I am left again.");
        leftButton2.setOnAction((ActionEvent ae) -> doSomething(ae));
        leftPane.getChildren().add(leftButton2);
        root.setLeft(leftPane);
        leftPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(leftPane, Pos.CENTER_LEFT);

        VBox rightPane = new VBox(20);
        Button rightButton1 = new Button("I am right.");
        rightButton1.setOnAction((ActionEvent ae) -> doSomething(ae));
        rightPane.getChildren().add(rightButton1);
        Button rightButton2 = new Button("I am right again.");
        rightButton2.setOnAction((ActionEvent ae) -> doSomething(ae));
        rightPane.getChildren().add(rightButton2);
        root.setRight(rightPane);
        rightPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(rightPane, Pos.CENTER_RIGHT);

        VBox topPane = new VBox(20);
        Button topButton1 = new Button("I am top.");
        topButton1.setOnAction((ActionEvent ae) -> doSomething(ae));
        topPane.getChildren().add(topButton1);
        Button topButton2 = new Button("I am top again.");
        topButton2.setOnAction((ActionEvent ae) -> doSomething(ae));
        topPane.getChildren().add(topButton2);
        root.setTop(topPane);
        topPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(topPane, Pos.TOP_CENTER);*/

        /*VBox bottomPane = new VBox(20);
        Button bottomButton1 = new Button("I am bottom.");
        bottomButton1.setOnAction((ActionEvent ae) -> doSomething(ae));
        bottomPane.getChildren().add(bottomButton1);
        Button bottomButton2 = new Button("open import stage");
        bottomButton2.setOnAction((ActionEvent ae) -> openImportStage(root));
        bottomButton2.getStyleClass().add("bottom");
        bottomPane.getChildren().add(bottomButton2);
        root.setBottom(bottomPane);
        bottomPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(bottomPane, Pos.BOTTOM_CENTER);*/

        /*VBox centerPane = new VBox(20);
        Button centerButton1 = new Button("open song table.");
        centerButton1.setOnAction((ActionEvent ae) -> openSongTable(root));
        centerPane.getChildren().add(centerButton1);
        Button centerButton2 = new Button("I am centre again.");
        centerButton2.setOnAction((ActionEvent ae) -> doSomething(ae));
        centerPane.getChildren().add(centerButton2);
        root.setCenter(centerPane);
        centerPane.setAlignment(Pos.CENTER);
        BorderPane.setAlignment(centerPane, Pos.CENTER);*/




    }

    public static void openImportStage(Pane parent) {
        importStage newStage = new importStage(parent);
    }

    /*public static void openSongTable(Pane parent) {
        songTable newStage = new songTable(parent);
    }*/


    public static void main(String[] args) {
        launch(args);
    }


    public void action(ActionEvent ae) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("alertt");
        alert.setHeaderText("Header");
        alert.setContentText("nothing here yet :))");
        alert.showAndWait();
    }

    public static void doSomething(ActionEvent ae) {
        Main.ae = ae;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText(null);
        alert.setContentText("eh");
        alert.showAndWait();
    }


    public static void exitPrompt(WindowEvent we) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm");
        alert.setHeaderText("Confirm to exit");
        alert.setContentText("Click yes to close the program");

        Optional result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            System.exit(0);
        } else {
            we.consume();
        }

    }
}
