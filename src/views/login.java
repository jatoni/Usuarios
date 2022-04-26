package views;

import controller.loginController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class login extends JFrame implements ActionListener{
     Font font;
        LineBorder lineBorder = new LineBorder(Color.white, 5, true);
        protected JLabel labelSubtitulo, labelRegistro;
        protected JTextField user_email;
        protected JPasswordField password;
        protected JButton btnRegistro, btnlogin;
        protected JPanel panel;


        public login(){
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(300,400);
            this.setLocationRelativeTo(null);
            this.setLayout(null);
            this.setResizable(false);
            this.setTitle("Login");
            add(panel());
        }
        public JPanel panel(){
            JPanel panel = new JPanel();
            panel.setSize(300, 400);
            panel.setBackground(Color.black);
            add(JLabel());
            add(txtuser());
            add(password());
            add(LogIn());
            add(Registrarse());
            return panel;
        }
        public JLabel JLabel(){
          // TODO document why this method is empty
          labelSubtitulo = new JLabel();
          labelSubtitulo.setBounds(60, 0, 200, 80);
          labelSubtitulo.setBackground(Color.BLUE);
          labelSubtitulo.setText("Login");
          font = new Font("serif", Font.CENTER_BASELINE, 50);
          labelSubtitulo.setFont(font);
          return labelSubtitulo;
        }
        public JTextField txtuser(){
            //All document about your textField
            user_email = new JTextField();
            user_email.setBounds(0, 135, 300, 30);
            user_email.setBackground(Color.GRAY);
            user_email.setBorder(lineBorder);
            font = new Font("serif", Font.CENTER_BASELINE, 15);
            user_email.setFont(font);
            user_email.setForeground(Color.WHITE);
            user_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            return user_email;
        }
        public JPasswordField password(){
            //All code about your textfiel
            password = new JPasswordField();
            password.setBounds(0, 190, 300, 30);
            password.setBorder(lineBorder);
            font = new Font("serif", Font.CENTER_BASELINE, 15);
            password.setFont(font);
            password.setForeground(Color.white);
            password.setBackground(Color.GRAY);
            password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
            return password;
        }
        public JButton LogIn(){
            btnlogin = new JButton();
            btnlogin.setBounds(0, 255, 300, 30);
            btnlogin.setText("L O G I N");
            btnlogin.setBorder(lineBorder);
            font = new Font("serif", Font.CENTER_BASELINE, 15);
            btnlogin.setFont(font);
            btnlogin.setForeground(Color.white);
            btnlogin.setBackground(Color.GRAY);
            btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            btnlogin.addActionListener(this);
            return btnlogin;
        }
        public JLabel Registrarse(){
            labelRegistro = new JLabel();
            labelRegistro.setBounds(0, 320, 300, 30);
            labelRegistro.setText("Registrarse");
            font = new Font("serif", Font.CENTER_BASELINE, 15);
            labelRegistro.setFont(font);
            labelRegistro.setForeground(Color.white);
            labelRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            labelRegistro.addMouseListener(new MouseAdapter() {
                 public void mouseClicked(MouseEvent e) {
                     Registro res = new Registro();
                    }  
            });
            return labelRegistro;
            
        }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnlogin)){
            loginController bk = new loginController();
            String usuario = user_email.getText();
            String pass = password.getText();
            if(usuario.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Input user or email");
            }else if(pass.equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "Input password");
            }else{
                if(bk.validarUser(usuario) && bk.validarPassword(pass)){
                    inicio index = new inicio();
                    user_email.setText("");
                    password.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario "+usuario+" no existe o password incorrecto");
                    user_email.setText("");
                    password.setText("");
                }
            }
        }
    }
}
