package travel.tuorism.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    public void run()
    {
        try {
                for(int i=1;i<=100;i++)
                {
                    int max = bar.getMaximum(); //100
                    int value = bar.getValue();

                    if(value < max){
                        bar.setValue(bar.getValue()+1);
                    } else {
                       setVisible(false);
                       new Dashboard(username);
                    }
                    Thread.sleep(30);
                }
               
       
            } catch (Exception e)
            {
              e.printStackTrace();
            }  
    }
    Loading(String username)
            {
       
       this.username = username;
       t = new Thread(this);
       setBounds(450,200,650,400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel text  = new JLabel("Pravasa");
       text.setBounds(250, 20,600,40);
       text.setForeground(Color.GREEN);
       text.setFont(new Font("Bell MT",Font.ITALIC ,35));
       add(text);
       
       bar = new JProgressBar();
       bar.setBounds(160,100,300,20);
       bar.setStringPainted(true);
       add(bar);
       
       JLabel loading  = new JLabel("Loading ,Please wait...");
       loading.setBounds(235, 120,600,40);
       loading.setForeground(Color.BLACK);
       loading.setFont(new Font("Railway",Font.ITALIC ,15));
       add(loading);
       
       JLabel lblusername = new JLabel("Welcome "+username);
       lblusername.setBounds(20,310 ,400,40);
      lblusername.setForeground(Color.GREEN);
       lblusername.setFont(new Font("Railway",Font.ITALIC ,15));
       add(lblusername);
       
       t.start();
       setVisible(true);
    }
    public static void main(String[] args)
    {
       new Loading("").setVisible(true);
    }
}