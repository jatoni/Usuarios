package controller;

import models.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewTable {
    
    ConnectionDB connection = new ConnectionDB();
    private String sql = "SELECT * FROM usuario;";
    ResultSet result = null;
    JTable usuarios;
    String [] dato = new String[7];
    public JTable table(){
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nombre");
        dtm.addColumn("Apellido Paterno");
        dtm.addColumn("Apellido Materno");
        dtm.addColumn("Usuario");
        dtm.addColumn("Correo");
        dtm.addColumn("Password");
        usuarios = new JTable();
        usuarios.setBounds(0,0,20,20);
        usuarios.setModel(dtm);
        try{            
           result = connection.getStatement().executeQuery(sql);
            while( result.next()){
                dato[0] = result.getString(1);
                dato[1] = result.getString(2);
                dato[2] = result.getString(3);
                dato[3] = result.getString(4);
                dato[4] = result.getString(5);
                dato[5] = result.getString(6);
                dato[6] = result.getString(7);
                dtm.addRow(dato);
           }
        }catch(SQLException e){
            System.err.println(e);
        }
        return usuarios;
    }
        
    }
