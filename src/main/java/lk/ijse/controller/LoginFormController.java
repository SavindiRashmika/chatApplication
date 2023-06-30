package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.regex.Pattern;

public class LoginFormController{
    @FXML
    private AnchorPane pane;

    @FXML
    private TextField txtName;

    public void loginOnAction(ActionEvent event) throws IOException {
      clientLogin();
    }

    public void clientLogin()  throws IOException {
        if (Pattern.matches("^[a-zA-Z\\s]+", txtName.getText())) {
            Parent root = FXMLLoader.load(getClass().getResource("/ChatForm.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) pane.getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }else {
            Alert alert= new Alert(Alert.AlertType.ERROR,"please enter your name!");
            alert.show();
        }
    }
}