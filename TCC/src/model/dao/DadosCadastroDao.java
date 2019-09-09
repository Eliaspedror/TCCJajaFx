package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.DadosCadastro;

/**
 *
 * @author gabri
 */
public class DadosCadastroDao {
    private Connection con = null;
    public boolean inserir (DadosCadastro dC) throws SQLException, ClassNotFoundException{
        boolean inseriu = false;
    
        try{
            con  = (Connection) new Conexao().getConnection();
            String sql = "insert into login (usuario_id, nome, email, usuario, senha, telefone, data_cadastro) values (default, ?, ?, ?, md5(?), ?, now());";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, dC.getNome());
            stmt.setString(2, dC.getEmail());
            stmt.setString(3, dC.getUsuario());
            stmt.setString(4, dC.getSenha());
            stmt.setString(5, dC.getTelefone());
            stmt.execute();
            stmt.close();
            inseriu = true;  
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
        
        return inseriu;
    }
    public boolean login(String usuario, String senha) throws SQLException, ClassNotFoundException{
        boolean inseriu = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "select usuario, senha from login where usuario = ? and senha = md5(?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if(rs.next()){
                inseriu = true; 
            }
            stmt.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            con.close();
        }
              
        return inseriu;        
    }
    
}
