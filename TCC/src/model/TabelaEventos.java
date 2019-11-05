package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.css.SimpleStyleableIntegerProperty;

/**
 *
 * @author Pedror
 */
public class TabelaEventos {
    
    private SimpleStringProperty titulo;

    //Countrutor
    
   
    
    public TabelaEventos(String titulo){  
        this.titulo = new SimpleStringProperty(titulo);
    }

    public String getTitulo() {
        return titulo.get();
    }

    public void setTitulo(String titulo) {
        this.titulo.set(titulo);
    }
    
    
    
    

   
    
    

}
