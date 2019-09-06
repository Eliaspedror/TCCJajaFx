
package view.login;

import coltrol.ControlaDadosCadastro;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author gabri
 */
public class ViewLoginController implements Initializable {
    
    ControlaDadosCadastro ctrlCadastro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ctrlCadastro = new ControlaDadosCadastro();
    }
    
   
    @FXML
    private Button btnEntrar;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtSenha;
    
    @FXML
    private Button btnIrcadastro;
    
    @FXML
    void login(ActionEvent event) throws ClassNotFoundException {
        boolean inseriu = false;
        try{
            inseriu = ctrlCadastro.login(this.txtUsuario.getText(), this.txtSenha.getText());
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        if(inseriu){
            System.out.println("bem vindo!");
        }
    }
    
    @FXML
    void vaiTelaCadastro(ActionEvent event) throws Exception {
         
    }

}
