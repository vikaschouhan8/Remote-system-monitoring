import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;


public class Rdc extends JFrame implements ActionListener
{
  JMenuItem m11;
  JButton jbutton1,jbutton2,jbutton3,jbutton4,jbutton5,jbutton6,jbutton7;

  Rdc()
  {
   setSize(300,600);
   setTitle("Network Monitoring Ver 1.0z");
   setLayout(null);
   setResizable(false);

//setIconImage(Toolkit.getDefaultToolkit().getImage("oo.jpg"));

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenDim = kit.getScreenSize();
        int screenWidth = screenDim.width;
        int screenHeight = screenDim.height;
        setLocation((screenWidth - getWidth()) / 2, (screenHeight - getHeight()) / 2);


   
   Container cp=getContentPane();
   cp.setLayout(new GridLayout(1,1));
   JPanel k=new JPanel();
   k.setLayout(null);
    cp.add(k);
   //k.setBounds(0,1,400,400);
   k.setBackground(Color.BLACK);
   
   jbutton1=new JButton("ShutDown");
   jbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/shutdown.PNG")));
   jbutton1.setMargin(new java.awt.Insets(0, -22, 2, 14));
   k.add(jbutton1);
   jbutton1.setBounds(45,150+30,200,45);
   
   jbutton2=new JButton("Send Message");
   jbutton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/msg.PNG")));
   jbutton2.setMargin(new java.awt.Insets(0, 1, 2, 14));
   k.add(jbutton2);
   jbutton2.setBounds(45,75+30,200,45);
   
   jbutton3=new JButton("Desktop Capturing");
   jbutton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/desktop_capture.PNG")));
   jbutton3.setMargin(new java.awt.Insets(10, 20, 2, 14));
   k.add(jbutton3);
   jbutton3.setBounds(45,30,200,45);
   
   jbutton4=new JButton("Show Drives");
   jbutton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/drive.PNG")));
   jbutton4.setMargin(new java.awt.Insets(0, -10, 2, 14));
   k.add(jbutton4);
   jbutton4.setBounds(45,225+30,200,45);
   
   jbutton5=new JButton("Keyboard Blocking");
   jbutton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/lock.PNG")));
   jbutton5.setMargin(new java.awt.Insets(0, 22, 2, 14));
   k.add(jbutton5);
   jbutton5.setBounds(45,300+30,200,45);
   
   jbutton6=new JButton("Website Blocker");
   jbutton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/blocker.PNG")));
   k.add(jbutton6);
   jbutton6.setBounds(45,375+30,200,45);
   
   jbutton7=new JButton("PC Configuration");
   jbutton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/remote_system_monitoring/config.PNG")));
   jbutton3.setMargin(new java.awt.Insets(0, -1, 2, 14));
   k.add(jbutton7);
   jbutton7.setBounds(45,450+30,200,45);
   
   jbutton1.addActionListener(this);
   jbutton2.addActionListener(this);
   jbutton3.addActionListener(this);
   jbutton4.addActionListener(this);
   jbutton5.addActionListener(this);
   jbutton6.addActionListener(this);
   jbutton7.addActionListener(this);

    setVisible(true);
   }
    public void actionPerformed(ActionEvent e)
    {
   
    if(e.getSource()==jbutton1)
  {
  Shutdown ee=new Shutdown();
  dispose();
  }

    if(e.getSource()==jbutton2)
  {
  SendMsg ee=new SendMsg();
  dispose();
  }


    if(e.getSource()==jbutton3)
  {
    try
       {
         DesktopClient f=new DesktopClient();
	       f.setVisible(true);
	       f.setSize(600,500);
       }
      catch(Exception ew)
       {
        System.out.println(ew);
       }
  }

    if(e.getSource()==jbutton4)
  {
    Showdrives ee=new Showdrives();
    dispose();
  }

    if(e.getSource()==jbutton5)
  {

  }

    if(e.getSource()==jbutton6)
  {

  }

   if(e.getSource()==jbutton7)
  {

  }
}
   public static void main(String args[])
   {
      Rdc kk=new Rdc();
   }
  }

  