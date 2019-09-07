package view.login_cadastro;

import coltrol.ControlaDadosCadastro;
import com.jfoenix.controls.JFXButton;
import java.awt.Frame;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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

    ControlaDadosCadastro fazLogin = new ControlaDadosCadastro();
   
    
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
    void login(ActionEvent event) throws SQLException, ClassNotFoundException {
        boolean inseriu = false;
        
        try{
            inseriu = fazLogin.login(this.txtUsuario.getText(), this.txtSenha.getText());
            if(inseriu){

              TCC viewHome = new TCC();
              viewHome.telaRootHome();
                
                
            }else if(!inseriu){
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("");
                alert.setHeaderText("Usuário ou Senha inválido!");
                alert.setContentText("Tente Novamente!");

                alert.showAndWait();
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
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
        
    }    
    
}
