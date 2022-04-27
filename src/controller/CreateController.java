package controller;

import java.awt.List;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ConnectionDB;
import models.Usuarios;

public class CreateController {
    ConnectionDB connection = new ConnectionDB();
    Statement stmt = null;
    String insertar = "INSERT INTO usuario (usuario, nombre, apellidopaterno, apellidomaterno, correo, password) VALUES(?,?,?,?,?,?)";
    public void insertUser(Usuarios user){
        try{
            connection.getStatement().executeUpdate("INSERT INTO usuario (usuario, nombre, apellidopaterno, apellidomaterno, correo, password) VALUES ('"+user.getUsuario()+"','"+user.getNombre()+"','"+user.getApellidoP()+"','"+user.getApellidoM()+"','"+user.getCorreo()+"','"+user.getPassword()+"')");
            connection.CloseConnection();
            JOptionPane.showMessageDialog(null, "Usuario registrado con exito");
        }catch(SQLException e){
            System.err.println(e);
        }
    }
}
