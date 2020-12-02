package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        GridPane p1 = new GridPane();
        Button button = new Button("Add students");
        Button button2 = new Button("Add students");
        p1.add(button, 1, 0, 1, 1);
        Scene scene = new Scene(p1);
        stage.setScene(scene);
        stage.setMinHeight(300);
        stage.setMinWidth(400);
        stage.setTitle("Attendence");
        stage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
