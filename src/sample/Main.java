package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("DictionaryScene.fxml"));
        primaryStage.setTitle("Từ Điển");
        primaryStage.setScene(new Scene(root, 600, 380));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
