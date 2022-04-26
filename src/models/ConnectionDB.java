package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
     private final String url = "jdbc:postgresql://127.0.0.1:5432/ProyectoUsuarios";
    private final String user = "postgres";
    private final String password = "admin";
    private Connection connection = null;
    private Statement stmt = null;
    ResultSet result=null;
    
    public Connection getConnect(){
        try{
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion exitosa");
        }catch(SQLException e){
            System.err.println(e);
        }
        return connection;
    }
    public Statement getStatement(){
        try {
            stmt = getConnect().createStatement();
        } catch (SQLException ex) {
           System.err.println(ex);
        }
        return stmt;
    }
    public void CloseConnection(){
        try{
            getConnect().close();
            getStatement().close();
        }catch(SQLException e){
            System.err.println(e);
        }
    }
}
