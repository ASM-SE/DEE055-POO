
package br.ufpr.main;

import br.ufpr.controls.ContatoDAO;
import br.ufpr.models.Contatos;
import java.sql.SQLException;


public class Main {
    
    public static void main(String[] args) throws SQLException{
        ContatoDAO contatoDAO = new ContatoDAO();

        Contatos contato1 = new Contatos();
        contato1.setNome("Aureliano Tedesco");
        contato1.setTelefone("(44) 99922-2222");
        contato1.setEmail("aurelianotedesco@gmail.com");

        //Salva no banco
        contatoDAO.save(contato1);

        contatoDAO.ListaContatos();
        System.out.println("----");
      
        Contatos contato2 = new Contatos();
        contato2.setId(2);
        contato2.setNome("Aureliano Suassuna");
        contato2.setTelefone("(44) 99922-2222");
        contato2.setEmail("aurelianotedesco@gmail.com");

        //Atualiza do banco
        contatoDAO.update(contato2);

        contatoDAO.ListaContatos();        
        System.out.println("----");
        
        //Remove do banco
        contatoDAO.removeById(3);

        contatoDAO.ListaContatos();
    }


}
