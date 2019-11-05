package model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import view.TCC;



/**
 *
 * @author Pedror
 */
public class EventPers {
    private int codigo;
    private String titulo;
    private String data_ini;
    private String data_fim;
    private String descricao;
    private int cod_user;
    private int cod_local;
    private String cor;  

    
    
    //Construtores
    public EventPers(int codigo, String titulo, String data_ini, String data_fim, String descricao, int cod_user, int cod_local, String cor){
        this.setCodigo(codigo);
        this.setTitulo(titulo);
        this.setData_ini(data_ini);
        this.setData_fim(data_fim);
        this.setDescricao(descricao);
        this.setCod_user(cod_user);
        this.setCod_local(cod_local);
        this.setCor(cor);
    }
    
    public EventPers(){   
    }
    
    public EventPers(String titulo){   
        this.setTitulo(titulo);
    }
    
    
    //Métodos Getter e Setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getData_ini() {
        return data_ini;
    }
    public void setData_ini(String data_ini) {
        this.data_ini = data_ini;
    }
    public String getData_fim() {
        return data_fim;
    }
    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getCod_user() {
        return cod_user;
    }
    public void setCod_user(int cod_user) {
        this.cod_user = cod_user;
    }
    public int getCod_local() {
        return cod_local;
    }
    public void setCod_local(int cod_local) {
        this.cod_local = cod_local;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
    //Método busca Eventos do usuario
    public ArrayList<EventPers> buscaEventosUsuario(){
        URL rest;
        TCC usuario = new TCC();
        ArrayList<EventPers> dadosEventos = null;
        
        try{
            rest = new URL("http://143.106.241.1/cl18463/tcc/api/eventPers/buscar/" + usuario.pegarCodigo());
            HttpURLConnection conexao = (HttpURLConnection) rest.openConnection();
            
            
            
            BufferedReader entrada = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder retorno = new StringBuilder();
            String linha;
            
            while((linha = entrada.readLine()) != null){
                retorno.append(linha);
            }
            entrada.close();
            conexao.disconnect();
            
            Gson gson = new Gson();
            JsonObject jso = gson.fromJson(retorno.toString(), JsonObject.class);
            JsonArray jsonArray = jso.getAsJsonArray("dados");
            

            Type typeDadosEventos = new TypeToken<ArrayList<EventPers>>(){}.getType();
            dadosEventos = gson.fromJson(jsonArray, typeDadosEventos);

        }catch(IOException ex){
            System.out.println("ERRO: " + ex);
        }
        
        return dadosEventos;
    }
    
}
