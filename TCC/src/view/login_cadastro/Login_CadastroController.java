package view.login_cadastro;

import com.jfoenix.controls.JFXButton;
import java.awt.Frame;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.swing.JFrame;
import view.TCC;

/**
 * FXML Controller class
 *
 * @author gabri
 */
public class Login_CadastroController implements Initializable {

 
    
    @FXML
    private Button btnIrcadastro;

    @FXML
    private Button btnEntrar;

    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtSenha;

    @FXML
    private Button btnCadastrar;
    
    @FXML
    private AnchorPane paneLogin;
    
    @FXML
    private AnchorPane paneCadastro;
    
    @FXML
    private JFXButton btnVoltaLogin;
    
    @FXML
    private JFXButton btnExit;

    @FXML
    void login(ActionEvent event) {

    }

    @FXML
    void vaiTelaCadastro(ActionEvent event) {
        paneLogin.setVisible(false);
        paneCadastro.setVisible(true);
        paneCadastro.toFront();
    }
    
    @FXML
    void vaiTelaLogin(ActionEvent event) {
        paneCadastro.setVisible(false);
        paneLogin.setVisible(true);
        paneLogin.toFront();
    }
    
    @FXML
    void exit(ActionEvent event) throws IOException {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
