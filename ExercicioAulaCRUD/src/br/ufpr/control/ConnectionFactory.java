
package br.ufpr.control;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    private static final String SERVER = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "POO"; //Schema
    private static final String USER = "admin";
    private static final String PASSWORD = "12345678";
    private static final String DATABASE_URL = "jdbc:mysql://" +
        SERVER + ":" + PORT + "/" + DATABASE;
    
    public static Connection createConnectionToMySQL() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            return connection;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) throws Exception{
        Connection con = createConnectionToMySQL();
        if(con != null){
            System.out.println("Conexão realizada com sucesso! " + con);
            con.close();
        }
    }
    

}
