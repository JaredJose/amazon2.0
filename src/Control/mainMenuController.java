package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class mainMenuController {

    @FXML
    private TextField searchBar;

    @FXML
    private Button searchBtn;

    @FXML
    private Button cartBtn;

    @FXML
    private Button freshBtn;

    @FXML
    private Button clothesBtn;

    @FXML
    private Button gameBtn;

    @FXML
    void getSearch(ActionEvent event) {

    }

    @FXML
    void openCart(ActionEvent event) throws IOException {
        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/cartUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

    @FXML
    void openClothes(ActionEvent event) throws IOException {

        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/clothesCategoryUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

    @FXML
    void openFresh(ActionEvent event) throws IOException {
        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/freshCategoryUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

    @FXML
    void openGames(ActionEvent event) throws IOException {

        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/gamesCategoryUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

    @FXML
    void searchClicked(ActionEvent event) throws IOException {
        String searchTerm = "";
        searchTerm = searchBar.getText();
        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/searchUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

}

