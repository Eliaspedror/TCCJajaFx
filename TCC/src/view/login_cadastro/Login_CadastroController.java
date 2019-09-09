package view.login_cadastro;

import coltrol.ControlaDadosCadastro;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.CheckBox;
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

    ControlaDadosCadastro controle = new ControlaDadosCadastro();
   
    
    @FXML
    private AnchorPane paneCadastro;

    @FXML
    private JFXButton btnExit1;

    @FXML
    private Button btnCadastrar;

    @FXML
    private CheckBox checkbox;

    @FXML
    private JFXButton btnVoltaLogin;

    @FXML
    private JFXTextField txtNome;

    @FXML
    private JFXTextField txtUsuarioCa;

    @FXML
    private JFXTextField txtEmail;

    @FXML
    private JFXPasswordField txtSenha1;

    @FXML
    private JFXPasswordField txtSenha2;

    @FXML
    private JFXTextField txtTelefone;

    @FXML
    private AnchorPane paneLogin;

    @FXML
    private Button btnIrcadastro;

    @FXML
    private Button btnEntrar;

    @FXML
    private JFXButton btnExit;

    @FXML
    private JFXPasswordField txtSenha;

    @FXML
    private JFXTextField txtUsuario;
    
    
    
    
    @FXML
    void login(ActionEvent event) throws SQLException, ClassNotFoundException {
        boolean inseriu = false;
        
        try{
            inseriu = controle.login(this.txtUsuario.getText(), this.txtSenha.getText());
            if(inseriu){
                TCC.telaRootHome();
                
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
    void cadastrar(ActionEvent event){

        if(verificaCampos()){
            boolean cadastro = false;
            try{
                cadastro = controle.insereCadastro(txtUsuario.getText(), txtSenha1.getText(), txtNome.getText(), txtEmail.getText(), txtTelefone.getText());
            }catch(Exception ex){
                ex.printStackTrace();
            }
            if(cadastro){
                Alert alert = new Alert(AlertType.WARNING);
                alert.setTitle("");
                alert.setHeaderText("Cadastro efetuado com sucesso!");
                alert.showAndWait();
            }
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
    
    
    
    
    
    //Verifica se os campos foram preenchidos coretamente
    private boolean verificaCampos(){
        if(txtNome.getText().trim().isEmpty() || txtUsuarioCa.getText().trim().isEmpty() || txtEmail.getText().trim().isEmpty() ||
                txtSenha1.getText().trim().isEmpty() || txtSenha2.getText().trim().isEmpty()|| txtTelefone.getText().trim().isEmpty()){
            
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("Obrigatorio o preenchimento de todos os campos!");
            alert.setContentText("Preencha todos os campos!");
            alert.showAndWait();
            return false;
        /*}else if(){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("");
            alert.setHeaderText("Nome de usuário já existente!");
            alert.showAndWait();
            return false;*/   
        }else if(!txtSenha1.getText().equals(txtSenha2.getText())){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText("Senhas incompatíveis!");
            alert.showAndWait();
            return false;  
        }else if(txtSenha1.getText().length() < 4){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText("Senha muito pequena!");
            alert.setContentText("mínimo 4 caracteres");
            alert.showAndWait();
            return false;
        }else if(txtSenha1.getText().length() > 10){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText("Senha muito extensa!");
            alert.setContentText("máximo 10 caracteres");
            alert.showAndWait();
            return false;
        }
        
        int maiusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        
        for(int i = 0; i < txtSenha1.getText().length(); i++){
            if((txtSenha1.getText().charAt(i) >= 'a' && txtSenha1.getText().charAt(i) <= 'z')){
                minusculas++;
            }else if((txtSenha1.getText().charAt(i) >= 'A' && txtSenha1.getText().charAt(i) <= 'Z')){
                maiusculas++;
            }else if((txtSenha1.getText().charAt(i) >= '0') && txtSenha1.getText().charAt(i) <= '9'){
                numeros++;
            }
        }
        if(maiusculas < 1 || minusculas < 1){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText("É necessário no mínimo um caractere maiusculo e minusculo!");
            alert.showAndWait();
            return false;
        }else if(numeros < 2){
            Alert alert = new Alert(AlertType.WARNING);
            alert.setHeaderText("É necessário no mínimo um caractere númerico!");
            alert.showAndWait();
            return false;
        }

        return true;
    }
}
