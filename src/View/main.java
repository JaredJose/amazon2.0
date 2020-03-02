package View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    private static AnchorPane mainLayout;
    //private AnchorPane mainLayout;
    private static Stage primaryStage;


    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Amazon");
        showMainMenu();


    }

    public static void showMainMenu() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(main.class.getResource("/View/mainUI.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void Main(String[] args) {

        launch(args);
    }

    public static void showProduct() throws IOException{
        primaryStage.hide();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(main.class.getResource("/View/productUI.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }




}