package Control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import View.main;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

public class categoryController {

    @FXML
    private TextField txtField;

    @FXML
    private Button searchBtn;

    @FXML
    private Button cartBtn;

    @FXML
    private Button freshBtn;

    @FXML
    private Button clothesBtn;

    @FXML
    private Button gamesBtn;

    @FXML
    private Button nextLeftBtn;

    @FXML
    private Button nextRightBtn;

    @FXML
    private Button productBtn1;

    @FXML
    private Button productBtn2;

    @FXML
    private Button productBtn3;

    @FXML
    private Button productBtn4;

    @FXML
    private ImageView productBtn5;

    @FXML
    private Label productLabel;

    @FXML
    void clothesOpen(ActionEvent event) {
        Stage clothesStage = new Stage();
        try {
            startClothes(clothesStage);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @FXML
    void moveListLeft(ActionEvent event) {

    }

    @FXML
    void moveListRight(ActionEvent event) {

    }

    @FXML
    void openCart(ActionEvent event) {

    }

    @FXML
    void openFresh(ActionEvent event) {

    }

    @FXML
    void openGames(ActionEvent event) {

    }

    @FXML
    void openProduct(ActionEvent event) {

    }


    public void startClothes(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("categoryUI.fxml"));
        primaryStage.setTitle("Clothing");
        primaryStage.setScene(new Scene(root,600,400));
        productLabel.setText("Clothing");
        primaryStage.show();


    }
}

