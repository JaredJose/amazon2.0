package Control;

import View.main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class clothesCategoryController implements Initializable {

    int productType = 0;

    @FXML
    private Button homeBtn;

    @FXML
    private Label productLbl;

    @FXML
    private Button loadBtn;

    @FXML
    private ListView<String> productList;


    ObservableList<String> items = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        productList.setItems(items);
        items.add("Die");
    }

    @FXML
    void goHome(ActionEvent event) throws IOException {
        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/mainUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

    @FXML
    void loadProducts(ActionEvent event) {

    }


    @FXML
    void Load(ActionEvent event) {

    }
}

