
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;



public class StudentDetails extends JFrame implements ActionListener{
    Choice crollno;
    JTable table;
    JButton search,print,update,add,cancel;

    StudentDetails() {
        getContentPane().setBackground(Color.WHITE);
        setSize(900,650);
         setLocation(350,50);
         
         setLayout(null);
         
         
        //heading
        JLabel heading=new JLabel("Search By Roll No:");
        heading.setBounds(20, 20, 190, 20);
        heading.setFont(new Font("serif",Font.BOLD,20));
        add(heading);
        
        crollno=new Choice();
        crollno.setBounds(210,20,150,20);
        add(crollno);
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            while(rs.next()){
               crollno.add(rs.getString("rollno"));
            }
        }catch(Exception e){
            e.printStackTrace();
            
        }
        table =new JTable();
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
            
        }
        search=new JButton("Search");
        search.setBounds(20,60,80,20);
        search.setBackground(Color.black);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        add(search);
        
        print=new JButton("Print");
        print.setBounds(120,60,80,20);
        print.setBackground(Color.black);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        add(print);
        
        update=new JButton("Update");
        update.setBounds(220,60,80,20);
        update.setBackground(Color.black);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        add(update);
        
        add=new JButton("Add");
        add.setBounds(320,60,80,20);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(420,60,80,20);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,100,900,650);
        add(jsp);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==search){
           String query="select * from student where rollno='"+crollno.getSelectedItem()+"'";
           try{
               Conn c=new Conn();
               ResultSet rs=c.s.executeQuery(query);
               table.setModel(DbUtils.resultSetToTableModel(rs));
               
           }catch(Exception e){
               e.printStackTrace();
           }
           
       } else if(ae.getSource()==print){
           try{
               table.print();
           }catch(Exception e){
               e.printStackTrace();
           }
       }else if(ae.getSource()==add){
           setVisible(false);
           new AddStudent();
           
       }else if(ae.getSource()==update){
           setVisible(false);
           new UpdateStudent();
           //new updateStudent();
           
       }else if (ae.getSource()==cancel){
           try{
               setVisible(false);
               
               
           }catch(Exception e){
               e.printStackTrace();
           }
       }
        
    }
    
    public static void main(String[] args) {
        new StudentDetails();
    }
    
    
}
