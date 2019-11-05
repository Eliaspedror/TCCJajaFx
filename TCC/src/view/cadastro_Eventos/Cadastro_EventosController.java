
package view.cadastro_Eventos;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.jfoenix.controls.JFXTextField;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.Endereco;
import static view.TCC.telaRootAgenda;

/**
 * FXML Controller class
 *
 * @author Pedror
 */
public class Cadastro_EventosController implements Initializable {

    
    
    @FXML
    private JFXTextField txtCEP;
    
    @FXML
    private JFXTextField txtEndereco;
    
    
    
    
    
    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    //Vai para a Scene agenda
    @FXML
    void mudaTelaAgenda(ActionEvent event) {
        telaRootAgenda();
    }
    
    
    
    //Faz a busca do endereço pelo CEP
    @FXML
    void buscaEndereco(ActionEvent event){
        URL rest;
        
        try{
            rest = new URL("https://viacep.com.br/ws/" + txtCEP.getText().replace("-", "") + "/json");
            HttpURLConnection conexao = (HttpURLConnection) rest.openConnection();
            
            StringBuilder retorno = new StringBuilder();
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String linha;
            
            while((linha = entrada.readLine()) != null){
                retorno.append(linha);
            }
            entrada.close();
            conexao.disconnect();
            
            Gson gson = new Gson();

            String concatenar = "{\"dados\":[" + retorno.toString() + "]}";
            JsonObject jso = gson.fromJson(concatenar, JsonObject.class);
            JsonArray jsonArray = jso.getAsJsonArray("dados");

            
            ArrayList<Endereco> endereco = null;
            
            Type enderecoListaType = new TypeToken<ArrayList<Endereco>>(){}.getType();
            endereco =  gson.fromJson(jsonArray, enderecoListaType);
            
            
            txtEndereco.setText(endereco.get(0).getLogradouro() + " - " + endereco.get(0).getBairro() + " - " + endereco.get(0).getLocalidade());                  
            txtEndereco.setEditable(false);
  
        }catch(MalformedURLException ex){
            System.out.println("ERRO: " + ex);
        }
        catch(IOException ex){
            System.out.println("ERRO: " + ex);
        }
    }
    
    
    //faz o cadastro de eventos
    @FXML
    void cadastrarEventos(ActionEvent event) {
        //cadastra o endereço e busca o código
        
         
        
        
        
        
        
    }
    
    
    
    
}
