package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class gamesCategoryController {

    int productType = 0;

    @FXML
    private Button homeBtn;

    @FXML
    private Label productLbl;

    @FXML
    private ListView<?> productList;

    @FXML
    void goHome(ActionEvent event) throws IOException {
        main.showMainMenu();
    }



}

