package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class loginPageController implements Initializable
{

    @FXML
    private TextField password;

    @FXML
    private TextField login;

    public void paymentPage(javafx.event.ActionEvent actionEvent) throws IOException {

        if(login.getText() != null && !login.getText().isEmpty() && !password.getText().isEmpty() && password.getText() != null) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/Payment.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Payment");
                stage.setResizable(false);
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        else
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/errorMessage.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Invalid ID");
            stage.setResizable(false);
            stage.setScene(new Scene(root2));
            stage.show();
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void createAccount(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/CreateAccount.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Create an Account");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }
}
