package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

// fxml: odpowiada za wyglad
// controller: cala logika programu
// main: tylko uruchamia

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 312, 467));
        primaryStage.show();

        // blokowanie resize
        primaryStage.setResizable(false);

        // ikona
        primaryStage.getIcons().add(new Image("images/icon.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}