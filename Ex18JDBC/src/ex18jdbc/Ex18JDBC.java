/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author anderson
 */
public class Ex18JDBC {


public static void main(String[] args) {
        String sql;
        
        /*
         *	O driver JDBC do MySQL está disponível no seguinte endereço:
         *	http://dev.mysql.com/downloads/connector/j/5.0.html
         */

        // Configuração dos parâmetros de conexão
        String server = "localhost";
        String port = "3306";               // Porta TCP padrão do MySQL
        String database = "POO";

        
        // Configuração dos parâmetros de autenticação
        String user = "admin";
        String passwd = "12345678";

        try {
            String url = "jdbc:mysql://" + server + ":" + port + "/" + database;
               Class.forName("com.mysql.cj.jdbc.Driver");
            // Abre-se a conexão com o Banco de Dados
            Connection con = DriverManager.getConnection(url, user, passwd);

            // Cria-se Statement com base na conexão con
            Statement stmt = con.createStatement();

            // Exemplo: cria-se uma tabela no Banco de Dados de Teste
            sql = "CREATE TABLE `filmes` ("
                    + "`id` INT UNSIGNED NOT NULL AUTO_INCREMENT,"
                    + "`titulo` VARCHAR(80) NOT NULL,"
                    + "`ano` INT UNSIGNED,"
                    + "`diretor` VARCHAR(80),"
                    + "PRIMARY KEY (`id`))"
                    + "CHARACTER SET utf8";
            stmt.executeUpdate(sql);

            // Exemplo: inserindo dados na tabela de filmes
            sql = "INSERT INTO `filmes` (`titulo`, `ano`, `diretor`)"
                    + "VALUES ('The Matrix', 1999, 'Andy Wachowski & Larry Wachowski')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO `filmes` (`titulo`, `ano`, `diretor`)"
                    + "VALUES ('The Matrix Reloaded', 2003, 'Andy Wachowski & Larry Wachowski')";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO `filmes` (`titulo`, `ano`, `diretor`)"
                    + "VALUES ('The Matrix Revolutions', 2003, 'Andy Wachowski & Larry Wachowski')";
            stmt.executeUpdate(sql);


            // Exemplo: navegando e exibindo os dados dos filmes
            sql = "SELECT `titulo`,`ano` FROM `filmes`";

            // Executa-se a consulta dos campos titulo,ano da tabela de filmes
            ResultSet res = stmt.executeQuery(sql);
            
            int ano;
            String titulo;

            while (res.next()) {
                ano = res.getInt("ano");
                titulo = res.getString("titulo");
                System.out.println("ROW = " + titulo + ": " + ano);
            }

            // Exemplo: excluindo a tabela filmes do Banco de Dados de Teste
            //sql = "DROP TABLE `filmes`";
            //stmt.executeUpdate(sql);

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
