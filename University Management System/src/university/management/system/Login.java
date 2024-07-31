
package university.management.system;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
    JButton login,cancel;
    JTextField fusername,fpassword;
    Login() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //username
        JLabel username=new JLabel("Username");
        username.setBounds(40,40,100,30);
        add(username);
        
        fusername=new JTextField();
        fusername.setBounds(150,40,150,30);
        add(fusername);
        //password
        JLabel password=new JLabel("Password");
        password.setBounds(40,100,100,30);
        add(password);
        
        fpassword=new JPasswordField();
        fpassword.setBounds(150,100,150,30);
        add(fpassword);
        //login
        login=new JButton("Login");
        login.setBounds(40,200,100,30);
        login.addActionListener(this);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.setFont(new Font("Tahoma",getFont().BOLD,15));
        add(login);
        
        //cancel
        cancel=new JButton("Cancel");
        cancel.setBounds(200,200,100,30);
        cancel.addActionListener(this);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma",getFont().BOLD,15));
        add(cancel);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("UMS/login.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,40,200,200);
        add(image);
        
        
                
                
        setSize(600,400);
        setLocation(400,250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
            String username=fusername.getText();
            String password=fpassword.getText();
            String query="select * from login where username='"+username+"'and password='"+password+"'";
            try{
                Conn c =new Conn();
                ResultSet rs=c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid uername or password");
                    setVisible(false);
                }
                
                    
            }catch(Exception e){
             e.printStackTrace();
            }
            
        }else if(ae.getSource()==cancel){
            setVisible(false);
            
        }
        
        
    }
    
    public static void main(String[] args) {
        Login l=new Login();
    }
    
}
