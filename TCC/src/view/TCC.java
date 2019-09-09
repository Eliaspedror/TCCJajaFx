package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class TCC extends Application {
    
    private static Scene rootHomew;
    private static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        this.stage = stage;
        
        //View login/cadastro
        Parent root = FXMLLoader.load(getClass().getResource("login_cadastro/Login_Cadastro.fxml"));
        Scene scene = new Scene(root); 
        
        //Home
        Parent rootHome = FXMLLoader.load(getClass().getResource("home/ViewHome.fxml"));
        rootHomew = new Scene(rootHome, 800, 550);
         
        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    public static void telaRootHome(){
        stage.setScene(TCC.rootHomew);
        stage.centerOnScreen();
    }
    
    public static void minimizar(){
        stage.setIconified(true);
    }
    
    public static void maximizar(){
        
   
        if(stage.getHeight() <= 550){
            stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
            stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
            stage.centerOnScreen();
        }else{
            stage.setHeight(550);
            stage.setWidth(800);
            stage.centerOnScreen();
        } 
    }
    
    public static void fechar(){
        stage.close();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
