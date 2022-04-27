package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.ConnectionDB;

public class loginController {
     private int contador = 0;
    private boolean existe = false;

    ConnectionDB connection = new ConnectionDB();
    private final String usuario_email = "SELECT usuario, correo FROM usuario";
    private final String password = "SELECT password FROM usuario";

    public boolean validarUser(String userEmail) {
        int contador = 0;
        try {
            ResultSet result = connection.getStatement().executeQuery(usuario_email);
            while(result.next()){
                String usuario = result.getString("usuario");
                String correo = result.getString("correo");
                existe = usuario.equals(userEmail) || correo.equals(userEmail);
                if(existe){
                    break;
                }
            }
            connection.CloseConnection();
            result.close();
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return existe;
    }
    
    public boolean validarPassword(String pass){
        try{
            ResultSet result = connection.getStatement().executeQuery(this.password);
            while(result.next()){
                String contra = result.getString("password");
                existe = contra.equals(pass);
                if(existe){
                    break;
                }
            }
        }catch(SQLException e){
            System.err.print(e);
        }
        return existe;
    }
}
