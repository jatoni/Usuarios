package views;

import controller.CreateController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import models.Usuarios;

public class Registro extends JFrame implements ActionListener{
    private JLabel nombre, usuario, apellidoP, apellidoM, correo, password;
    private JTextField txtNombre, txtUsuario, txtApellidoP, txtApellidoM, txtCorreo, txtPassword;
    private JButton btnRegistrar, btnregresar;
    
   public Registro(){
        JFrame registro = new JFrame();
        registro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registro.setSize(800, 600);
        registro.setLocationRelativeTo(null);
        registro.setLayout(null);
        registro.setResizable(false);
        registro.setTitle("Registro");
        registro.setVisible(true);
        registro.add(panel());
    }
   
   public JPanel panel(){
       JPanel panel = new JPanel();
       panel.setSize(800,600);
       panel.setLayout(null);
       panel.setBackground(Color.BLACK);
       panel.add(nombre());
       panel.add(apellidoP());
       panel.add(apellidoM());
       panel.add(usuario());
       panel.add(correo());
       panel.add(password());
       panel.add(txtnombre());
       panel.add(txtapellidoP());
       panel.add(txtapellidoM());
       panel.add(txtUsuario());
       panel.add(txtCorreo());
       panel.add(txtPassword());
       panel.add(btnRegistrar());
       return panel;
   }
   
   public JLabel nombre(){
       nombre = new JLabel();
       nombre.setLocation(100, 50);
       nombre.setSize(300,30);
       nombre.setText("Nombre:");
       nombre.setForeground(Color.WHITE);
       return nombre;
   }
   public JLabel apellidoP(){
       apellidoP = new JLabel();
       apellidoP.setLocation(100, 100);
       apellidoP.setSize(300,30);
       apellidoP.setText("Apellido Paterno:");
       apellidoP.setForeground(Color.WHITE);
       return apellidoP;
   }
   public JLabel apellidoM(){
       apellidoM = new JLabel();
       apellidoM.setLocation(100, 150);
       apellidoM.setSize(300, 30);
       apellidoM.setText("Apellido Materno:");
       apellidoM.setForeground(Color.WHITE);
       return apellidoM;
   }
   public JLabel usuario(){
       this.usuario = new JLabel();
       this.usuario.setLocation(100, 200);
       this.usuario.setSize(300, 30);
       this.usuario.setText("Usuario");
       this.usuario.setForeground(Color.white);
       return this.usuario;
   }
   public JLabel correo(){
       correo = new JLabel();
       correo.setLocation(100, 250);
       correo.setSize(300,30);
       correo.setText("Correo:");
       correo.setForeground(Color.WHITE);
       return correo;
   }
   public JLabel password(){
       password = new JLabel();
       password.setLocation(100, 300);
       password.setSize(300, 30);
       password.setText("Password");
       password.setForeground(Color.white);
       return password;
   }
   public JTextField txtnombre(){
       txtNombre = new JTextField();
       txtNombre.setLocation(250,50);
       txtNombre.setSize(400, 30);
       txtNombre.setBackground(Color.black);
       txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       txtNombre.setForeground(Color.white);
       return txtNombre;
   }
   public JTextField txtapellidoP(){
       txtApellidoP = new JTextField();
       txtApellidoP.setLocation(250,100);
       txtApellidoP.setSize(400, 30);
       txtApellidoP.setForeground(Color.white);
       txtApellidoP.setBackground(Color.black);
       txtApellidoP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       return txtApellidoP;
   }
   public JTextField txtapellidoM(){
       txtApellidoM = new JTextField();
       txtApellidoM.setLocation(250,150);
       txtApellidoM.setSize(400, 30);
       txtApellidoM.setForeground(Color.white);
       txtApellidoM.setBackground(Color.black);
       txtApellidoM.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       return txtApellidoM;
   }
   public JTextField txtUsuario(){
       txtUsuario = new JTextField();
       txtUsuario.setLocation(250,200);
       txtUsuario.setSize(400, 30);
       txtUsuario.setForeground(Color.white);
       txtUsuario.setBackground(Color.black);
       txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       return txtUsuario;
   }
   public JTextField txtCorreo(){
       txtCorreo = new JTextField();
       txtCorreo.setLocation(250,250);
       txtCorreo.setSize(400, 30);
       txtCorreo.setForeground(Color.white);
       txtCorreo.setBackground(Color.black);
       txtCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       return txtCorreo;
   }
   public JTextField txtPassword(){
       txtPassword = new JTextField();
       txtPassword.setLocation(250,300);
       txtPassword.setSize(400, 30);
       txtPassword.setForeground(Color.white);
       txtPassword.setBackground(Color.black);
       txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
       return txtPassword;
   }
   public JButton btnRegistrar(){
       btnRegistrar = new JButton();
       btnRegistrar.setLocation(100,350);
       btnRegistrar.setSize(550, 30);
       btnRegistrar.setText("Registrar");
       btnRegistrar.setForeground(Color.white);
       btnRegistrar.setBackground(Color.black);
       btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
       btnRegistrar.addActionListener(this);
       return btnRegistrar;
   }
   public void vaciar(){
       txtNombre.setText("");
       txtApellidoP.setText("");
       txtApellidoM.setText("");
       txtCorreo.setText("");
       txtUsuario.setText("");
       txtPassword.setText("");
   }
   public boolean notVoid(){
       boolean not = false;
       not = txtNombre.getText().equals("") && txtUsuario.getText().equals("") && txtApellidoP.getText().equals("") && txtApellidoM.getText().equals("") && txtCorreo.getText().equals("") && txtPassword.getText().equals("");
       return not;
   }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnRegistrar)){
            if(notVoid()){
                JOptionPane.showMessageDialog(null, "No ha llenado un cuadro\nFavor de rellenar todos los cuadros");
            }else{
                String nombreh = txtNombre.getText();
                String apellidoPh = txtApellidoP.getText();
                String apellidoMh = txtApellidoM.getText();
                String correoh = txtCorreo.getText();
                String passwordh = txtPassword.getText();
                String usuarioh = txtUsuario.getText();
                Usuarios user = new Usuarios(usuarioh, nombreh, apellidoPh, apellidoMh, correoh, passwordh);
                CreateController create = new CreateController();
                create.insertUser(user);
                vaciar();
            }
            
        }
    }
}
