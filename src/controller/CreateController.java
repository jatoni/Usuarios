package controller;

import java.awt.List;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.ConnectionDB;
import models.Usuarios;

public class CreateController {
    ConnectionDB connection = new ConnectionDB();
    Statement stmt = null;
    String insertar = "INSERT INTO usuario (usuario, nombre, apellidopaterno, apellidomaterno, correo, password) VALUES(?,?,?,?,?,?)";
    public void insertUser(Usuarios user){
        try{
            connection.getStatement();
            String insert = "INSERT INTO usuario (usuario, nombre, apellidopaterno, apellidomaterno, correo, password) VALUES ("+user.getUsuario()+","+user.getNombre()+","+user.getApellidoP()+","+user.getApellidoM()+","+user.getCorreo()+","+user.getPassword()+");";
            ResultSet result = connection.getStatement().executeQuery(insert);
            
            connection.getStatement().executeUpdate(insert);
            connection.CloseConnection();
        }catch(SQLException e){
            System.err.print(e);
        }
    }
}
