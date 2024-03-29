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
 * @author Alexandre/Elias/Elzio
 */
public class ViewHomeController implements Initializable {
    
    @FXML
    private AnchorPane panePai;

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
    private JFXButton btnOptions;
   
   @FXML
    private AnchorPane paneOptions;
   
   @FXML
    private AnchorPane paneHome;
   
   @FXML
    private JFXButton btnAgenda;
   
   
   //Métodos minímizar, maximizar e fechar
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
   
   // Vai para o paneHome e o addPane
   @FXML
    void remove(ActionEvent event) {
        addPane.setVisible(false);
        paneHome.setVisible(true);
        paneHome.toFront();
    }

    @FXML
    void addPane(ActionEvent event) {
        addPane.setVisible(true);
        addPane.toFront();
    }
    
    // Controla o paneOptons
    @FXML
    void options(ActionEvent event) {
        if(paneOptions.visibleProperty().getValue() == true){
            paneOptions.setVisible(false);
        }else{
            paneOptions.setVisible(true);
        } 
    }
    
    // Vai para a view Agenda
    @FXML
    void vaiViewAgenda(ActionEvent event) {
        TCC.telaRootAgenda();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }     
}
