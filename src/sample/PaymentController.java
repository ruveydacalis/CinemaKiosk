package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;

public class PaymentController {

    @FXML
    private TextField cardNo;

    @FXML
    private TextField date;

    @FXML
    private TextField cvc;

    @FXML
    private Button complete;

    public void complete(ActionEvent actionEvent) throws IOException {

        if(!cardNo.getText().toString().isEmpty() && !date.getText().toString().isEmpty() && !cvc.getText().toString().isEmpty())
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/Complete.fxml"));
            Parent root2 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Purchase completed.");
            stage.setResizable(false);
            stage.setScene(new Scene(root2));
            stage.show();

            int i=1;
            try {
                FileWriter writer = new FileWriter("src/Seats.txt", true);
                writer.write(i + " ");
                writer.write("\r\n");	// write new line
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
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
}
