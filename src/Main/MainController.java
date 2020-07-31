package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private Button firstPageButton;

    @FXML
    private Button secondPageButton;

    @FXML
    private Button thirdPageButton;

    @FXML
    private StackPane stack;

    @FXML
    void buttonsHandler(ActionEvent event) throws IOException {
        if (event.getSource().toString().contains("firstPageButton")) {
            stack.getChildren().clear();
            stack.getChildren()
                    .add((AnchorPane) FXMLLoader.load(getClass().getResource("/main/first.fxml")));
        } else if (event.getSource().toString().contains("secondPageButton")) {
            stack.getChildren().clear();
            stack.getChildren()
                    .add((AnchorPane) FXMLLoader.load(getClass().getResource("/main/second.fxml")));
        } else if (event.getSource().toString().contains("thirdPageButton")) {
            stack.getChildren().clear();
            stack.getChildren()
                    .add((AnchorPane) FXMLLoader.load(getClass().getResource("/main/third.fxml")));
        }
    }

}
