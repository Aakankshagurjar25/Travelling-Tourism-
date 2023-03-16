package travel.tuorism.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener{
    
    JTextField tfusername, tfname, tfquestion,tfanswer,tfpassword;
    JButton search,retrieve, back;
    
    ForgetPassword()
    {
        setBounds(350, 200, 850, 380 );
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(570, 70, 200, 200);
        add(image);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 480, 280);
        add(p1);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,25);
        lblusername.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.add(lblusername);
        
        tfusername =  new JTextField();
        tfusername.setBounds(190, 25, 150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        search = new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(360, 25, 100,25);
        search.addActionListener(this);
        p1.add(search);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(40,60,100,25);
        lblname.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.add(lblname);
        
        tfname =  new JTextField();
        tfname.setBounds(190, 65, 150, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lblquestion = new JLabel("your Security Question");
        lblquestion.setBounds(40,100,150,25);
        lblquestion.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.add(lblquestion);
        
        tfquestion =  new JTextField();
        tfquestion .setBounds(190, 105, 150, 25);
        tfquestion .setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion );
        
        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setBounds(40,140,150,25);
        lblanswer.setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.add(lblanswer);
        
        tfanswer =  new JTextField();
        tfanswer .setBounds(190, 145, 150, 25);
        tfanswer .setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer );
        
        retrieve = new JButton("Retrieve");
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(360, 145, 100,25);
        retrieve.addActionListener(this);
        p1.add(retrieve);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword .setBounds(40,180,150,25);
        lblpassword .setFont(new Font("Times New Roman", Font.BOLD, 16));
        p1.add(lblpassword );
        
        tfpassword =  new JTextField();
        tfpassword .setBounds(190, 185, 150, 25);
        tfpassword .setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        back = new JButton("Back");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(150, 235, 100,25);
        back.addActionListener(this);
        p1.add(back);
        
        
        setVisible(true);
         
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            try {
                String query = "select * from account where username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                
              ResultSet rs = c.s.executeQuery(query);
              while(rs.next()){
                tfname.setText(rs.getString("name"));
                tfquestion.setText(rs.getString("security"));
              }
                
            } catch (Exception e){
                e.printStackTrace();
            } 
            
        } else if(ae.getSource() == retrieve){
             try {
                String query = "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'";
                Conn c = new Conn();
                
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()){
                tfpassword.setText(rs.getString("password"));
              }
                
            } catch (Exception e){
                e.printStackTrace();
            } 
            
        } else{
            setVisible(false);
            new Login();
        }
    }

   
    public static void main(String args[]) {
        new ForgetPassword();
    }
}
