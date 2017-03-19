import java.util.*;
import java.awt.*;
import javax.swing.*;
import  java.awt.event.*;
import java.io.*;
class Login extends JFrame implements ActionListener
{

JButton b3,b1;
 
    JPasswordField p1;
   JTextField t1;
  Login()
  {
   setSize(400,280);
   setTitle("Login Form");
   setLayout(null);
   setResizable(false);
setLocation(200,150);
   setIconImage(Toolkit.getDefaultToolkit().getImage("oo.jpg"));
	try{	
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception e)
		{
		
		}
		
   JLabel l1=new JLabel("User Id");
   add(l1);
   l1.setBounds(30,30,100,25);
   //l1.setForeground(Color.GREEN);
   
   t1=new JTextField();
   add(t1);
   t1.setBounds(180,30,100,25);
   //t1.setBackground(Color.lightGray);
   
   JLabel l2=new JLabel("Password");
   add(l2);
   l2.setBounds(30,80,100,25);
   //l2.setForeground(Color.MAGENTA);
   
   p1=new JPasswordField();
   add(p1);
   p1.setBounds(180,80,100,25);
   //p1.setBackground(Color.lightGray);
   
    b1=new JButton ("OK");
   add(b1);
   b1.setBounds(70,170,100,25);
   //b1.setBackground(Color.ORANGE);
    //b1.setForeground(Color.BLUE);
    b1.addActionListener(this);
  
  
    b3=new JButton("CLOSE");
   add(b3);
   b3.setBounds(250,170,100,25);
   // b3.setBackground(Color.RED);
     //b3.setBackground(Color.GREEN);
     b3.addActionListener(this);
  
   Container cp=getContentPane();
   JPanel k=new JPanel();
   setLayout(null);
   cp.add(k);
   k.setBounds(0,1,400,300);
   //k.setBackground(Color.darkGray);
   setVisible(true);
   
   }
 

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b3)
dispose();

if(e.getSource()==b1)
{
   if(t1.getText().equals("admin") && p1.getText().equals("admin"))
    { Rdc kk=new Rdc();
   dispose();
 }
else
JOptionPane.showMessageDialog(this,"Sorry, Try Again :(");
}

 }
 
 public static void main(String args[])
   {
   Login d=new Login();
   }

   }

  