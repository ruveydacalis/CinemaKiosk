package sample;

import java.awt.*;
import java.io.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CreateAccountController {

    @FXML
    private TextField surname;

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Button complete;

        public void complete(ActionEvent actionEvent) {

           /* try
            {
                File file=new File("src/User.txt");    //creates a new file instance
                FileReader fr=new FileReader(file);   //reads the file
                BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream
                StringBuffer sb=new StringBuffer();    //constructs a string buffer with no characters
                String line;
                while((line=br.readLine())!=null)
                {
                    String [] userInfo = line.split(" ");
                    if(userInfo[3].equals(email.getText().toString()) )
                    {
                        System.err.println("Error");
                        break;
                    }
                }
                fr.close();    //closes the stream and release the resources
                System.out.println(sb.toString());   //returns a string that textually represents the object
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }*/

            int i=1;
            try {
                FileWriter writer = new FileWriter("src/User.txt", true);
                writer.write(i + ". "+ name.getText().toString() + " " + surname.getText().toString() + " " +
                        email.getText().toString() + " "+ password.getText().toString());
                writer.write("\r\n");	// write new line
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;


    }


}
