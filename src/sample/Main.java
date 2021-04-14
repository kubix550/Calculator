package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainDesign.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root, 370, 600));
        primaryStage.show();

        // blocking resize
        primaryStage.setScene(primaryStage.getScene());
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        // app icon
        primaryStage.getIcons().add(new Image("/resources/images/appBoldIcon.png"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}