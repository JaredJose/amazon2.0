package View;

import Control.categoryController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("categoryUI.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }
    public void startClothes(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("categoryUI.fxml"));
        primaryStage.setTitle("Clothing");
        primaryStage.setScene(new Scene(root,600,400));

    }


    public static void main(String[] args) {
        launch(args);
    }
}