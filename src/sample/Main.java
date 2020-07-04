package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// fxml odpowiada za wyglad
// controller to cala logika programu
// main tylko uruchamia

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator v1");
        primaryStage.setScene(new Scene(root, 350, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}