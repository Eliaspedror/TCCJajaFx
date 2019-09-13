package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageViewBuilder;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class TCC extends Application {
    
    private static Scene rootHomeR;
    private static Scene rootAgendaR;
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
    
        
        this.stage = stage;
        
        //View login/cadastro
        Parent root = FXMLLoader.load(getClass().getResource("login_cadastro/Login_Cadastro.fxml"));
        Scene scene = new Scene(root); 
        
        //Home
        Parent rootHome = FXMLLoader.load(getClass().getResource("home/ViewHome.fxml"));
        rootHomeR = new Scene(rootHome, 1023, 521);
         
        //Agenda 
        Parent rootAgenda = FXMLLoader.load(getClass().getResource("agenda/Agenda.fxml"));
        rootAgendaR = new Scene(rootAgenda, 1023, 521);
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    //Métodos para a troca de Scene
    public static void telaRootHome(){
        stage.setScene(TCC.rootHomeR);
        stage.centerOnScreen();
    }
    
    public static void telaRootAgenda(){
        stage.setScene(TCC.rootAgendaR);
        stage.centerOnScreen();
    }
    
    
    
    
    //Métodos minímizar, maximizar efechar
    
    public static void minimizar(){
        stage.setIconified(true);
    }
    
    public static void maximizar(){
        
   
        if(stage.getHeight() <= 521){
            stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
            stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
            stage.centerOnScreen();
        }else{
            stage.setHeight(521);
            stage.setWidth(1023);
            stage.centerOnScreen();
        } 
    }
    
    public static void fechar(){
        stage.close();
    }
  
    //Main
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
