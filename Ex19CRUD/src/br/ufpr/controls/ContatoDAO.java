
package br.ufpr.controls;

import br.ufpr.models.Contatos;
import br.ufpr.utils.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContatoDAO {

    public void save(Contatos contato) throws SQLException {
        
        String sql = "INSERT INTO contatos(nome,telefone,email) VALUES(?,?,?)";
 
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try{
            con = ConnectionFactory.createConnectionToMySQL();
            pstmt = ConnectionFactory.prepareStmt(con, sql);
            
            pstmt.setString(1, contato.getNome());
            pstmt.setString(2, contato.getTelefone());
            pstmt.setString(3, contato.getEmail());
            
            pstmt.execute();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnectionToMySQL(con);
            ConnectionFactory.closePstmt(pstmt);
        }
    
    }

    public void update(Contatos contato) throws SQLException {
        
        String sql = "UPDATE contatos SET nome = ?, telefone = ?, email = ? WHERE id = ?";
 
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try{
            con = ConnectionFactory.createConnectionToMySQL();
            pstmt = ConnectionFactory.prepareStmt(con, sql);
            
            pstmt.setString(1, contato.getNome());
            pstmt.setString(2, contato.getTelefone());
            pstmt.setString(3, contato.getEmail());
            pstmt.setInt(4, contato.getId());
            
            pstmt.execute();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnectionToMySQL(con);
            ConnectionFactory.closePstmt(pstmt);
        }
    }

    public void removeById(int id) throws SQLException {
        
        String sql = "DELETE FROM contatos WHERE id = ?";
 
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try{
            con = ConnectionFactory.createConnectionToMySQL();
            pstmt = ConnectionFactory.prepareStmt(con, sql);
            
            pstmt.setInt(1, id);
            
            pstmt.execute();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnectionToMySQL(con);
            ConnectionFactory.closePstmt(pstmt);
        }
    }

    public ArrayList<Contatos> getContatos() throws SQLException {
        
        String sql = "SELECT * FROM contatos";
        
        ArrayList<Contatos> contatos = new ArrayList<>();
        
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rset = null;
        
        try{
            con = ConnectionFactory.createConnectionToMySQL();
            pstmt = ConnectionFactory.prepareStmt(con, sql);

            rset = pstmt.executeQuery();
            
            while (rset.next()) {

                Contatos contato = new Contatos();
                contato.setId(rset.getInt("id"));
                contato.setNome(rset.getString("nome"));
                contato.setTelefone(rset.getString("telefone"));
                contato.setEmail(rset.getString("email"));

                contatos.add(contato);
            }        
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            ConnectionFactory.closeConnectionToMySQL(con);
            ConnectionFactory.closePstmt(pstmt);
            if(rset != null){
               rset.close();
            }
        }
        
        return contatos;
    }; 
    
    public void ListaContatos() throws SQLException{
        for (Contatos c : getContatos()) {
            System.out.println("NOME: " + c.getNome());
        }
    }

}
