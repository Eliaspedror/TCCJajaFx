package model;

/**
 *
 * @author Elias Pedro
 * 
 */
public class Verifica {
    private boolean dados;
    
    public Verifica(boolean dados){
        this.setDados(dados);
    }

    public boolean isDados() {
        return dados;
    }
    public void setDados(boolean dados) {
        this.dados = dados;
    }
}
