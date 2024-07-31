
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;



public  class FacultyDetails extends JFrame implements ActionListener{
    Choice cEmpId;
    JTable table;
    JButton search,print,update,add,cancel;

    FacultyDetails() {
        getContentPane().setBackground(Color.WHITE);
        setSize(900,650);
         setLocation(350,50);
         
         setLayout(null);
         
         
        //heading
        JLabel heading=new JLabel("Search By Empolyee Id:");
        heading.setBounds(20, 20, 210, 20);
        heading.setFont(new Font("serif",Font.BOLD,20));
        add(heading);
        
        cEmpId=new Choice();
        cEmpId.setBounds(250,20,100,20);
        add(cEmpId);
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from faculty");
            while(rs.next()){
               cEmpId.add(rs.getString("empId"));
            }
        }catch(Exception e){
            e.printStackTrace();
            
        }
        table =new JTable();
        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from faculty");
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
           String query="select * from faculty where empid='"+cEmpId.getSelectedItem()+"'";
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
           new AddFaculty();
           
       }else if(ae.getSource()==update){
           setVisible(false);
            new UpdateFaculty();
           
       }else if (ae.getSource()==cancel){
           try{
               setVisible(false);
               
               
               
           }catch(Exception e){
               e.printStackTrace();
           }
       }
        
    }
    
    public static void main(String[] args) {
        new FacultyDetails();
    }
    
    
}

