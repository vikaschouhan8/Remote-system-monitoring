import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.rmi.*;

public class Showdrives extends JFrame implements ActionListener 
{
  JButton b1,b2,b3;
  JLabel l2,l3; 
  JTextField t2;
  Showdrives()
  {
      Toolkit kit = Toolkit.getDefaultToolkit();
      Dimension screenDim = kit.getScreenSize();
      int screenWidth = screenDim.width;
      int screenHeight = screenDim.height;
      //System.out.print(screenWidth);
      setLocation((screenWidth - getWidth()) / 3, (screenHeight - getHeight()) / 3);

      setSize(400,250);
      setTitle("Show Drives");
      setLayout(null);
      setResizable(false);

      try
      {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
  
      l2=new JLabel("IP Address");
      add(l2);
      l2.setBounds(30,30,100,25);
      l2.setForeground(Color.WHITE);

      t2=new JTextField();
      add(t2);
      t2.setBounds(150,30,150,30);

      b1=new JButton ("Show");
      add(b1);
      b1.setBounds(90,150,100,25);
      b1.setBackground(Color.WHITE);
      b1.setForeground(Color.BLACK);
      b1.addActionListener(this);
  
      b2=new JButton("Back");
      add(b2);
      b2.setBounds(200,150,100,25);
      b2.setForeground(Color.BLACK);
      b2.setBackground(Color.WHITE);
      b2.addActionListener(this);

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
      Rdc kk=new Rdc();
    }

      if(e.getSource()==b1)
    {
      String s1=t2.getText();

      try 
      {
        Sum s=(Sum)Naming.lookup("rmi://"+s1+"/xyz");
        int counter=0;
        File f[] = File.listRoots();
        for (int i=0;i< f.length ;i++ ) {
          counter++;
          System.out.print(f[i]+"\n");
        }
        System.out.print("No. Of Drives In The System Are "+counter);
      
      }
      catch(Exception ew)
      {
        JOptionPane.showMessageDialog(null, ew.toString());
        ew.printStackTrace();
        dispose();
      }
    }
} 
    public static void main(String args[])
  {
    Showdrives ee= new Showdrives();
  }
}

  