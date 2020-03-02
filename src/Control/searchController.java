package Control;

import View.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class searchController {

    @FXML
    private Button homeBtn;

    @FXML
    private ListView<?> searchList;

    @FXML
    void goHome(ActionEvent event) throws IOException {
        Parent freshViewParent = FXMLLoader.load(getClass().getResource("/View/mainUI.fxml"));
        Scene freshViewScene = new Scene(freshViewParent);

        //This line gets scene info
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(freshViewScene);
        window.show();
    }

}

