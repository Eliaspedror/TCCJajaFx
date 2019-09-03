/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coltrol;

import java.sql.SQLException;
import model.bean.DadosCadastro;
import model.dao.DadosCadastroDao;

/**
 *
 * @author 
 */
public class ControlaDadosCadastro {
    public boolean insereCadastro(String usuario, String senha, int usuario_id, String nome, String email, String telefone) throws SQLException, ClassNotFoundException{
        DadosCadastro dC = new DadosCadastro(usuario, senha, usuario_id, nome, email, telefone);
        DadosCadastroDao dCDAO = new DadosCadastroDao();
        boolean inseriu = dCDAO.inserir(dC);
        return inseriu;
    }
    public boolean login(String usuario, String senha) throws SQLException, ClassNotFoundException{
        DadosCadastroDao userDAO = new DadosCadastroDao();
        boolean inseriu = userDAO.login(usuario, senha);
        return inseriu; 
    }
}
