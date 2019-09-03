
package view.login;

import coltrol.ControlaDadosCadastro;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
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
    private TextField txtUsuario;

    @FXML
    private TextField txtSenha;
    
    @FXML
    void login(ActionEvent event) throws ClassNotFoundException {
        boolean inseriu = false;
        System.out.println("Caguei!");
        try{
            inseriu = ctrlCadastro.login(this.txtUsuario.getText(), this.txtSenha.getText());
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        if(inseriu){
            System.out.println("Caguei!");
        }
    }
    
}
