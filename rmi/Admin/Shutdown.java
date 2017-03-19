import java.util.*;
import java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
import java.io.*;
import java.rmi.*;

public class Shutdown extends JFrame implements ActionListener 
{
  JButton b1,b2,b3,b4;
  JLabel l2,l3,l4,l5,l6; 
  JTextField t2,t3,t4;
  Shutdown()
  {
    //To bring panel in center.
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenDim = kit.getScreenSize();
    int screenWidth = screenDim.width;
    int screenHeight = screenDim.height;
    //System.out.print(screenWidth);
    setLocation((screenWidth - getWidth()) / 3, (screenHeight - getHeight()) / 3);

   setSize(350,300);
   setTitle("Turn off computer");
   setLayout(null);
   setResizable(false);


     l2=new JLabel("IP Address");
     add(l2);
     l2.setBounds(30,30,100,25);
     l2.setForeground(Color.WHITE);

     t2=new JTextField();
     add(t2);
     t2.setBounds(100,30,150,25);   

     b1=new JButton ("");
     b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/shutdown.PNG")));
     add(b1);
     b1.setBounds(270,25,34,34);
     b1.setBackground(Color.RED);
     b1.setForeground(Color.BLUE);
     b1.addActionListener(this);
  
     l3=new JLabel("OR");
     add(l3);
     l3.setBounds(170,60,100,25);
     l3.setForeground(Color.WHITE);
     
     l5=new JLabel("Specify time in seconds");
     add(l5);
     l5.setBounds(120,80,150,25);
     l5.setForeground(Color.WHITE);

     l4=new JLabel("IP Address");
     add(l4);
     l4.setBounds(30,110,100,25);
     l4.setForeground(Color.WHITE);
      
     t3=new JTextField();
     add(t3);
     t3.setBounds(100,110,150,25);   

     l6=new JLabel("Say Seconds");
     add(l6);
     l6.setBounds(30,140,150,25);
     l6.setForeground(Color.WHITE);
     
     t4=new JTextField();
     add(t4);
     t4.setBounds(100,140,50,25);   
     
     b4=new JButton ("");
     b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/shutdown.PNG")));
     add(b4);
     b4.setBounds(260,115,44,44);
     b4.setBackground(Color.RED);
     b4.setForeground(Color.BLUE);
     b4.addActionListener(this);
  
     b2=new JButton("Cancel");
     add(b2);
     b2.setBounds(70,170,100,25);
     b2.setBackground(Color.RED);
     b2.setBackground(Color.WHITE);
     b2.addActionListener(this);

     b3=new JButton("Back");
     add(b3);
     b3.setBounds(180,170,100,25);
     b3.setBackground(Color.RED);
     b3.setBackground(Color.WHITE);
     b3.addActionListener(this);
  


   Container cp=getContentPane();
   JPanel k=new JPanel();
   setLayout(null);
   cp.add(k);
   k.setBounds(0,1,400,300);
   k.setBackground(new Color(0,153,255));
   setVisible(true);
   
   }
 

public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b2)
  {
    dispose();
  }
    if(e.getSource()==b3)
  {
    Rdc kk=new Rdc();
    dispose();
  }
    if(e.getSource()==b1)
  {
    String s1=t2.getText();
    try 
    {
      Sum s=(Sum)Naming.lookup("rmi://"+s1+"/xyz");   
      s.shutdown();
    }
    catch (Exception ew)
    {
      JOptionPane.showMessageDialog(null, ew.toString());
      ew.printStackTrace();
      dispose();
    }
  }
  if(e.getSource()==b4)
  {
    String s2=t3.getText();
    String s3=t4.getText();
    //int t = Integer.parseInt(s3);
    try 
    {
      System.out.print(s3);
      System.out.print(s2);
      Sum sss=(Sum)Naming.lookup("rmi://"+s2+"/xyz");   
      sss.shutdown(100);
    }
    catch (Exception ew)
    {
      JOptionPane.showMessageDialog(null, ew.toString());
      ew.printStackTrace();
      dispose();
    }
  }
} 
  public static void main(String args[])
 {
     Shutdown ee=new Shutdown();
 }
}

  