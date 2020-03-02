package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

public class cartController {

    private main Main;

    @FXML
    private Button homeBtn;

    @FXML
    private ListView<?> cartList;

    @FXML
    void goHome(ActionEvent event) throws IOException {

        Main.showMainMenu();
    }



}
