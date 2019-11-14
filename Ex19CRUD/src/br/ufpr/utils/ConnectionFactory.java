package br.ufpr.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String SERVER = "localhost";
    private static final String PORT = "3306";
    private static final String DATABASE = "POO";
    private static final String USER = "admin";
    private static final String PASSWORD = "12345678";
    private static final String DATABASE_URL = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DATABASE;

    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection;
        try {
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void closeConnectionToMySQL(Connection con) throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public static PreparedStatement prepareStmt(Connection con, String sql) throws SQLException {
        PreparedStatement pstmt = null;
        pstmt = con.prepareStatement(sql);
        return pstmt;
    }
    
    public static void closePstmt(PreparedStatement pstmt) throws SQLException {
        if (pstmt != null) {
            pstmt.close();
        }
    }

    public static void main(String[] args) throws Exception {

        Connection con = createConnectionToMySQL();

        if (con != null) {
            System.out.println("Conexão realizada com sucesso! " + con);
            closeConnectionToMySQL(con);
        }
    }
}
