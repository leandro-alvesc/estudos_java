package horadosistemafx;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class FXMLController implements Initializable {
    @FXML
    private Label lblMsg;
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event){
        System.out.println("Clicou!");
        Date data = new Date();
        lblMsg.setText(data.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
