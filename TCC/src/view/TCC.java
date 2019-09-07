package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class TCC extends Application {
    
    private Scene rootHomew;
    private Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        this.stage = stage;

        Parent root = FXMLLoader.load(getClass().getResource("login_cadastro/Login_Cadastro.fxml"));
        Parent rootHome = FXMLLoader.load(getClass().getResource("home/ViewHome.fxml"));
        
        rootHomew = new Scene(rootHome);
        
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public void telaRootHome(){
        stage.setScene(this.rootHomew);
    }
    
}
