package views;

import controller.ViewTable;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class inicio {
    JPanel panel;
    JTable usuarios;    
    JScrollPane scroll;
    ViewTable date = new ViewTable();
    
    public inicio(){
        JFrame inicio = new JFrame();
        inicio.setSize(800, 600);
        inicio.setTitle("Usuario");
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
        inicio.add(panel());
    }
    public JPanel panel(){
        panel = new JPanel();
        panel.setSize(800, 600);
        panel.setBackground(Color.DARK_GRAY);
        panel.setVisible(true);
        panel.add(date.table());
        return panel;
    }
}
