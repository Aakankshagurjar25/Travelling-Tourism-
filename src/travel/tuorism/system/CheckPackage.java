package travel.tuorism.system;

import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {
   
    CheckPackage(){
     setBounds(290,110,800,600);
     
     String[] package1 = {"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only","package1.jpg"};
     String[] package2 = {"SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only","package2.jpg"};
     String[] package3 = {"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & others", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only","package3.jpg"};
     JTabbedPane tab = new JTabbedPane();
     JPanel p1 = CreatePackage(package1);
     tab.addTab("Package 1", null, p1);
     
     JPanel p2 = CreatePackage(package2);
     tab.addTab("Package 2", null, p2);
     
     JPanel p3 = CreatePackage(package3);
     tab.addTab("Package 3", null, p3);
     
     add(tab);
     
     setVisible(true);
    }
   
    public JPanel CreatePackage(String[] pack)
    {
     JPanel p1 = new JPanel();
     p1.setLayout(null);
     p1.setBackground(new Color(222 ,254 ,255));
     
     JLabel l1 = new JLabel(pack[0]);
     l1.setBounds(30,10,390,70);
     l1.setForeground(Color.YELLOW);
     l1.setFont(new Font("Bell MT",Font.BOLD,40));
     p1.add(l1);
     
     JLabel l2 = new JLabel(pack[1]);
     l2.setBounds(30,80,400,70);
     l2.setForeground(new Color(51 ,204 ,255));
     l2.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l2);
     
     JLabel l3 = new JLabel(pack[2]);
     l3.setBounds(30,120,400,70);
     l3.setForeground(new Color(51 ,204 ,255));
     l3.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l3);
     
     JLabel l4 = new JLabel(pack[3]);
     l4.setBounds(30,160,400,70);
     l4.setForeground(new Color(51 ,204 ,255));
     l4.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l4);
     
     JLabel l5 = new JLabel(pack[4]);
     l5.setBounds(30,200,400,70);
     l5.setForeground(new Color(51 ,204 ,255));
     l5.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l5);
     
     JLabel l6 = new JLabel(pack[5]);
     l6.setBounds(30,240,400,70);
     l6.setForeground(new Color(51 ,204 ,255));
     l6.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l6);
     
     JLabel l7 = new JLabel(pack[6]);
     l7.setBounds(30,280,400,70);
     l7.setForeground(new Color(51 ,204 ,255));
     l7.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l7);
     
     JLabel l8 = new JLabel(pack[7]);
     l8.setBounds(30,320,400,70);
     l8.setForeground(new Color(51 ,204 ,255));
     l8.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,20));
     p1.add(l8);
     
     JLabel l9 = new JLabel(pack[8]);
     l9.setBounds(60,380,400,70);
     l9.setForeground(Color.RED);
     l9.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,25));
     p1.add(l9);
     
     JLabel l10 = new JLabel(pack[9]);
     l10.setBounds(60,420,400,70);
     l10.setForeground(Color.BLACK);
     l10.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,25));
     p1.add(l10);
     
     JLabel l11 = new JLabel(pack[10]);
     l11.setBounds(510,460,400,70);
     l11.setForeground(Color.BLACK);
     l11.setFont(new Font("Segoe UI Variable Display Light",Font.PLAIN,25));
     p1.add(l11);
     
     ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
     Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
     ImageIcon i3 = new ImageIcon(i2);
     JLabel l12 = new JLabel(i3);
     l12.setBounds(370, 60, 500, 300);
     p1.add(l12);  
     
     return p1;
    }
 
    public static void main(String Args[]){
       new CheckPackage();
    }
}
