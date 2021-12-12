package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button button1;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button two;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button one;

    @FXML
    private Button three;

    @FXML
    private Button nine;

    @FXML
    private Button eight;

    @FXML
    private Button twelve;

    @FXML
    private Button eleven;

    @FXML
    private Button ten;

    @FXML
    private Button fourteen;

    @FXML
    private Button thirteen;



    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

    }

    public void one(javafx.event.ActionEvent actionEvent) {

    }

    public void loginPage(javafx.event.ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/loginPage.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Login Page");
            stage.setResizable(false);
            stage.setScene(new Scene(root1));
            stage.show();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }

    }

    public void turnRed(ActionEvent actionEvent) {
        one.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed1(ActionEvent actionEvent) {
        two.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed2(ActionEvent actionEvent) {
        three.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed3(ActionEvent actionEvent) {
        four.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed4(ActionEvent actionEvent) {
        five.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed5(ActionEvent actionEvent) {
        six.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed6(ActionEvent actionEvent) {
        seven.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed7(ActionEvent actionEvent) {
        eight.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed8(ActionEvent actionEvent) {
        nine.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed9(ActionEvent actionEvent) {
        ten.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed10(ActionEvent actionEvent) {
        eleven.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed11(ActionEvent actionEvent) {
        twelve.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed12(ActionEvent actionEvent) {
        thirteen.setStyle("-fx-background-color: #FF0000");
    }
    public void turnRed13(ActionEvent actionEvent) {
        fourteen.setStyle("-fx-background-color: #FF0000");
    }
}

