
package university.management.system;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class AddStudent extends JFrame implements ActionListener{
    JTextField tfname,tffname,tfaddress,tfphone,tfemail,tfx,tfxii,tfaadhar;
    JDateChooser dcdob;
    JComboBox cbcourse,cbbranch;
    JButton submit,cancel;
    JLabel labelrollno;
    
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

     AddStudent() {
         setSize(900,650);
         setLocation(350,50);
         
         setLayout(null);
         
         
        //heading
        JLabel heading=new JLabel("New Student Details");
        heading.setBounds(310, 20, 500, 70);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
        //name
        JLabel lblname=new JLabel("Name:");
        lblname.setBounds(80, 100, 500, 70);
        lblname.setFont(new Font("serif",Font.BOLD,25));
        add(lblname);
        //name field
        tfname=new JTextField();
        tfname.setBounds(230, 120,170, 40);
        tfname.setFont(new Font("serif",Font.BOLD,25));
        add(tfname);
        
        //fathers name
        JLabel lblfname=new JLabel("Father's Name:");
        lblfname.setBounds(430, 100, 500, 70);
        lblfname.setFont(new Font("serif",Font.BOLD,25));
        add(lblfname);
        
        //fathers name field
        tffname=new JTextField();
        tffname.setBounds(600, 120,170, 40);
        tffname.setFont(new Font("serif",Font.BOLD,25));
        add(tffname);
        
        //roll no
        JLabel lblrollno=new JLabel("Roll No:");
        lblrollno.setBounds(80, 170, 500, 70);
        lblrollno.setFont(new Font("serif",Font.BOLD,25));
        add(lblrollno);
        
        labelrollno=new JLabel("4SF21"+first4);
        labelrollno.setBounds(230, 185, 170, 40);
        labelrollno.setFont(new Font("serif",Font.BOLD,25));
        add(labelrollno);
        
        //date of birth
        JLabel lbldob=new JLabel("Date Of Birth:");
        lbldob.setBounds(430, 170, 500, 70);
        lbldob.setFont(new Font("serif",Font.BOLD,25));
        add(lbldob);
        
        dcdob=new JDateChooser();
        dcdob.setBounds(600, 180,170, 40);
         add(dcdob);
        
        //address
        JLabel lbladdress=new JLabel("Address:");
        lbladdress.setBounds(80, 240, 500, 70);
        lbladdress.setFont(new Font("serif",Font.BOLD,25));
        add(lbladdress);
        //addressfield
        tfaddress=new JTextField();
        tfaddress.setBounds(230, 250, 170, 40);
        tfaddress.setFont(new Font("serif",Font.BOLD,25));
        add(tfaddress);
        
        //phone
        JLabel lblphone=new JLabel("Phone No:");
        lblphone.setBounds(430, 240, 500, 70);
        lblphone.setFont(new Font("serif",Font.BOLD,25));
        add(lblphone);
        
        //phno field
        tfphone=new JTextField();
        tfphone.setBounds(600, 250,170, 40);
        tfphone.setFont(new Font("serif",Font.BOLD,25));
        add(tfphone);
        
        //email
        JLabel lblemail=new JLabel("Email:");
        lblemail.setBounds(80, 310, 500, 70);
        lblemail.setFont(new Font("serif",Font.BOLD,25));
        add(lblemail);
        //email filed
        tfemail=new JTextField();
        tfemail.setBounds(230, 320, 170, 40);
        tfemail.setFont(new Font("serif",Font.BOLD,25));
        add(tfemail);
        
        //10th marks
        JLabel lblx=new JLabel("X Class(%):");
        lblx.setBounds(430, 310, 500, 70);
        lblx.setFont(new Font("serif",Font.BOLD,25));
        add(lblx);
        
        //10th field
        tfx=new JTextField();
        tfx.setBounds(600, 320,170, 40);
        tfx.setFont(new Font("serif",Font.BOLD,25));
        add(tfx);
        
        //XII
        JLabel lblxii=new JLabel("XII Class(%):");
        lblxii.setBounds(80, 380, 500, 70);
        lblxii.setFont(new Font("serif",Font.BOLD,25));
        add(lblxii);
        
        //XII filed
        tfxii=new JTextField();
        tfxii.setBounds(230, 390, 170, 40);
        tfxii.setFont(new Font("serif",Font.BOLD,25));
        add(tfxii);
        
        //aadhar no
        JLabel lblaadhar=new JLabel("Aadhar No:");
        lblaadhar.setBounds(430,380, 500, 70);
        lblaadhar.setFont(new Font("serif",Font.BOLD,25));
        add(lblaadhar);
        
        //aadhar field
        tfaadhar=new JTextField();
        tfaadhar.setBounds(600,390,170, 40);
        tfaadhar.setFont(new Font("serif",Font.BOLD,25));
        add(tfaadhar);
        
         //course
        JLabel lblcourse=new JLabel("Course:");
        lblcourse.setBounds(80, 450, 500, 70);
        lblcourse.setFont(new Font("serif",Font.BOLD,25));
        add(lblcourse);
        
        String course[] = {"B.Tech","MBA","M.Tech"};
        cbcourse=new JComboBox(course);
        cbcourse.setBounds(230, 460, 170, 40);
        cbcourse.setBackground(Color.white);
        add(cbcourse);
        
        //branch
        JLabel lblbranch=new JLabel("Branch:");
        lblbranch.setBounds(430,450, 500, 70);
        lblbranch.setFont(new Font("serif",Font.BOLD,25));
        add(lblbranch);
        
        String branch[] = {"Computer Science","Information Science","AIML","Mechanical","Robotics","Electronics and Communication"};
        cbbranch=new JComboBox(branch);
        cbbranch.setBounds(600, 460, 170, 40);
        cbbranch.setBackground(Color.white);
        add(cbbranch);
        
        //submit
        submit=new JButton("Submit");
        submit.setBounds(550,550,100,30);
        submit.addActionListener(this);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma",getFont().BOLD,15));
        add(submit);
        
        //cancel
        cancel=new JButton("Cancel");
        cancel.setBounds(670,550,100,30);
        cancel.addActionListener(this);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Tahoma",getFont().BOLD,15));
        add(cancel);
        setVisible(true);
        
     }
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==submit){
             String name=tfname.getText();
             String fname=tffname.getText();
             String rollno=labelrollno.getText();
             String dob=((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
             String address=tfaddress.getText();
             String phone=tfphone.getText();
             String email=tfemail.getText();
             String x=tfx.getText();
             String xii=tfxii.getText();
             String aadhar=tfaadhar.getText();
             String course=(String) cbcourse.getSelectedItem();
             String branch=(String) cbbranch.getSelectedItem();
             
             try{
                 String query="Insert into student values( '"+name+"','"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+course+"','"+branch+"')";
                 Conn con=new Conn();
                 con.s.executeUpdate(query);
                 
                 JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                 setVisible(false);
             }catch(Exception e){
                 e.printStackTrace();
             }
             
             
     }else{
             setVisible(false);
         }
    
     }
    
    public static void main(String[] args) {
       AddStudent a= new AddStudent();
    }
    
}