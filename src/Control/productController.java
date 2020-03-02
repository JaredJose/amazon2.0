package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class productController {

    @FXML
    private Button homeBtn;

    @FXML
    private Label productLbl;

    @FXML
    private ImageView imageBox;

    @FXML
    private Label priceLbl;

    @FXML
    private Label descLbl;

    @FXML
    void goHome(ActionEvent event) throws IOException {
        main.showMainMenu();
    }

}