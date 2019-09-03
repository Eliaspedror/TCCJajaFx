package tccjava;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JFrame;

/**
 *
 * @author gabri
 */
public class TccJava extends Application {
    private static Scene fxmlCadastro;
    private static Scene main;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        //JFrame frame = new JFrame(); frame.setSize(800, 600); frame.setResizable(false); frame.setVisible(true);
        
        Parent root = FXMLLoader.load(getClass().getResource("/view/login/ViewLogin.fxml"));
        Scene scene = new Scene(root);
        



        
      
        
        
        //primaryStage.setTitle("Login");
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
