package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.io.IOException;

public class searchController {

    @FXML
    private Button homeBtn;

    @FXML
    private ListView<?> searchList;

    @FXML
    void goHome(ActionEvent event) throws IOException {
        main.showMainMenu();
    }

}

