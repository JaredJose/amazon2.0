package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
        main.showCart();
    }

    @FXML
    void openClothes(ActionEvent event) throws IOException {
        main.showClothes();
    }

    @FXML
    void openFresh(ActionEvent event) throws IOException {
        main.showFresh();
    }

    @FXML
    void openGames(ActionEvent event) throws IOException {
        main.showGames();
    }

    @FXML
    void searchClicked(ActionEvent event) throws IOException {
        String searchterm = searchBar.getText();
        main.showSearch();
    }

}

