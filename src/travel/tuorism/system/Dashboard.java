
package travel.tuorism.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Dashboard extends JFrame implements ActionListener {
   String username;
   JButton  addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkPackages, bookPackages,viewPackages, viewhotels, destinations,bookhotels;
   JButton viewbookedhotels, payments, calculators, about;
   Dashboard(String username){
       
       this.username = username;
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       setLayout(null);
       
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(new Color(0, 0, 102));
       p1.setBounds(0, 0, 1533, 65);
       add(p1);
       
//       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
//       Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
//       ImageIcon i3 = new ImageIcon(i2);
//       JLabel icon = new JLabel(i3);
//       icon.setBounds(5, 0, 70, 70);
//       p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(60, 10, 300, 40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Times New Roman", Font.BOLD, 30));
        p1.add(heading);
       
       JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBackground(new Color(0, 0, 102));
       p2.setBounds(0, 65, 300, 775);
       add(p2);
       
       addPersonalDetails = new JButton("Add Personal Details");
       addPersonalDetails.setBounds(0, 0, 300, 50);
       addPersonalDetails.setBackground(new Color(0, 0, 102));
       addPersonalDetails.setForeground(Color.white);
       addPersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
       addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
       addPersonalDetails.addActionListener(this);
       p2.add( addPersonalDetails);
       
       updatePersonalDetails = new JButton("Update Personal Details");
       updatePersonalDetails.setBounds(0, 50, 300, 50);
       updatePersonalDetails.setBackground(new Color(0, 0, 102));
       updatePersonalDetails.setForeground(Color.white);
       updatePersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
       updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
       updatePersonalDetails.addActionListener(this);
       p2.add(updatePersonalDetails);
       
       viewPersonalDetails = new JButton("View Details");
       viewPersonalDetails.setBounds(0, 100, 300, 50);
       viewPersonalDetails.setBackground(new Color(0, 0, 102));
       viewPersonalDetails.setForeground(Color.white);
       viewPersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
       viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
       viewPersonalDetails.addActionListener(this);
       p2.add(viewPersonalDetails);
       
       JButton deletePersonalDetails = new JButton("Delete Personal Details");
       deletePersonalDetails.setBounds(0, 150, 300, 50);
       deletePersonalDetails.setBackground(new Color(0, 0, 102));
       deletePersonalDetails.setForeground(Color.white);
       deletePersonalDetails.setFont(new Font("Times New Roman", Font.BOLD, 20));
       deletePersonalDetails.setMargin(new Insets(0, 0, 0, 40));
       p2.add(deletePersonalDetails);
       
       checkPackages = new JButton("Check Packages");
       checkPackages.setBounds(0, 200, 300, 50);
       checkPackages.setBackground(new Color(0, 0, 102));
       checkPackages.setForeground(Color.white);
       checkPackages.setFont(new Font("Times New Roman", Font.BOLD, 20));
       checkPackages.setMargin(new Insets(0, 0, 0, 110));
       checkPackages.addActionListener(this);
       p2.add(checkPackages);
       
       bookPackages = new JButton("Book Packages");
       bookPackages.setBounds(0, 250, 300, 50);
       bookPackages.setBackground(new Color(0, 0, 102));
       bookPackages.setForeground(Color.white);
       bookPackages.setFont(new Font("Times New Roman", Font.BOLD, 20));
       bookPackages.setMargin(new Insets(0, 0, 0, 110));
       bookPackages.addActionListener(this);
       p2.add(bookPackages);
       
       viewPackages = new JButton("View Booked Packages");
       viewPackages.setBounds(0, 300, 300, 50);
       viewPackages.setBackground(new Color(0, 0, 102));
       viewPackages.setForeground(Color.white);
       viewPackages.setFont(new Font("Times New Roman", Font.BOLD, 20));
       viewPackages.setMargin(new Insets(0, 0, 0, 70));
       viewPackages.addActionListener(this);
       p2.add(viewPackages);
       
       viewhotels = new JButton("View Hotels");
       viewhotels.setBounds(0, 350, 300, 50);
       viewhotels.setBackground(new Color(0, 0, 102));
       viewhotels.setForeground(Color.white);
       viewhotels.setFont(new Font("Times New Roman", Font.BOLD, 20));
       viewhotels.setMargin(new Insets(0, 0, 0, 140));
       viewhotels.addActionListener(this);
       p2.add(viewhotels);
       
       bookhotels = new JButton("Book Hotels");
       bookhotels.setBounds(0, 400, 300, 50);
       bookhotels.setBackground(new Color(0, 0, 102));
       bookhotels.setForeground(Color.white);
       bookhotels.setFont(new Font("Times New Roman", Font.BOLD, 20));
       bookhotels.setMargin(new Insets(0, 0, 0, 140));
       bookhotels.addActionListener(this);
       p2.add(bookhotels);
       
       viewbookedhotels = new JButton("View Booked Hotels");
       viewbookedhotels.setBounds(0, 450, 300, 50);
       viewbookedhotels.setBackground(new Color(0, 0, 102));
       viewbookedhotels.setForeground(Color.white);
       viewbookedhotels.setFont(new Font("Times New Roman", Font.BOLD, 20));
       viewbookedhotels.setMargin(new Insets(0, 0, 0, 70));
       viewbookedhotels.addActionListener(this);
       p2.add(viewbookedhotels);
       
       destinations = new JButton("View Destinations");
       destinations.setBounds(0, 500, 300, 50);
       destinations.setBackground(new Color(0, 0, 102));
       destinations.setForeground(Color.white);
       destinations.setFont(new Font("Times New Roman", Font.BOLD, 20));
       destinations.setMargin(new Insets(0, 0, 0, 90));
       destinations.addActionListener(this);
       p2.add(destinations);
       
       payments = new JButton("Payments");
       payments.setBounds(0, 550, 300, 50);
       payments.setBackground(new Color(0, 0, 102));
       payments.setForeground(Color.white);
       payments.setFont(new Font("Times New Roman", Font.BOLD, 20));
       payments.setMargin(new Insets(0, 0, 0, 155));
       payments.addActionListener(this);
       p2.add(payments);
       
       calculators = new JButton("Calculator");
       calculators.setBounds(0, 600, 300, 50);
       calculators.setBackground(new Color(0, 0, 102));
       calculators.setForeground(Color.white);
       calculators.setFont(new Font("Times New Roman", Font.BOLD, 20));
       calculators.setMargin(new Insets(0, 0, 0, 145));
       calculators.addActionListener(this);
       p2.add(calculators);
       
       about = new JButton("About Us");
       about.setBounds(0, 700, 300, 50);
       about.setBackground(new Color(0, 0, 102));
       about.setForeground(Color.white);
       about.setFont(new Font("Times New Roman", Font.BOLD, 20));
       about.setMargin(new Insets(0, 0, 0, 175));
       about.addActionListener(this);
       p2.add(about);
       
       ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
       Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
       ImageIcon i6 = new ImageIcon(i5);
       JLabel image = new JLabel(i6);
       image.setBounds(0, 0, 1600, 1000);
       add(image);
             
       JLabel text = new JLabel("WELCOME TO PRAVASA");
       text.setBounds(650, 70, 1200, 70);
       text.setForeground(Color.white);
       text.setFont(new Font("Railway", Font.PLAIN, 45));
       image.add(text);
       
       setVisible(true);
       
    }
       
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() ==  addPersonalDetails){
           new AddCustomer(username);
        }else if(ae.getSource() == viewPersonalDetails ){
           new ViewCustomer(username);
        }else if(ae.getSource() == updatePersonalDetails ){
           new UpdateCustomer(username);
        }else if(ae.getSource() == checkPackages ){
           new CheckPackage();
        } else if(ae.getSource() == bookPackages){
            new BookPackage(username);
        }  else if(ae.getSource() == viewPackages){
            new ViewPackage(username);
        } else if (ae.getSource() ==  viewhotels){
            new CheckHotels();
        } else if (ae.getSource() == destinations){
            new Destinations();
        } else if (ae.getSource() == viewhotels){
            //new BookedHotel(username);
        } else if (ae.getSource() == viewbookedhotels){
            new ViewBookedHotel(username);
        } else if(ae.getSource() == payments){
            new Payment();
        } else if(ae.getSource() == calculators){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch (Exception e){
                e.printStackTrace();    
            }
        } else if (ae.getSource() == about){
            new About();
        } 
    }
   
    public static void main(String args[]) {
        new Dashboard("");
    }
}