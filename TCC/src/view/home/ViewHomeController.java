package view.home;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import view.TCC;

/**
 *
 * @author gabri
 */
public class ViewHomeController implements Initializable {
    

    @FXML
    private JFXButton btnAdd;
    
    @FXML
    private AnchorPane addPane;
    
   @FXML
    private JFXButton btnRemove;
   
   @FXML
    private JFXButton btnMinimizar;

   @FXML
   private JFXButton btnMaximizar;

   @FXML
   private JFXButton btnFechar;
   
   
   
   
   @FXML
   void maximizar(ActionEvent event) {
       TCC.maximizar();
   }

   @FXML
   void minimizar(ActionEvent event) {
      TCC.minimizar();
   }
   
   @FXML
   void fechar(ActionEvent event) {
       TCC.fechar();
   } 
   
   @FXML
    void remove(ActionEvent event) {
        addPane.setVisible(false);
    }

    @FXML
    void handleButtonAction(ActionEvent event) {
        addPane.setVisible(true);
        addPane.toFront();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }     
}
