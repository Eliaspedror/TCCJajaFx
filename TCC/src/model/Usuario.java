package model;

import java.awt.image.BufferedImage;

/**
 *
 * @author Elais Pedro
 */
public class Usuario {
    //Atributos
    private int codigo;
    private String nome;
    private String usuario;
    private String email;
    private String senha;
    private String telefone;
    private BufferedImage foto;
    
    //Construtores
    public Usuario(int codigo, String nome, String usuario, String email, String senha, String telefone, BufferedImage foto){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setUsuario(usuario);
        this.setEmail(email);
        this.setSenha(senha);
        this.setTelefone(telefone);
        this.setFoto(foto);
    }

    //Métodos getters e setters
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public BufferedImage getFoto() {
        return foto;
    }
    public void setFoto(BufferedImage foto) {
        this.foto = foto;
    }
}

