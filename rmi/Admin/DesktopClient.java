import java.rmi.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.naming.*;
import javax.swing.*;
import javax.imageio.*;
	public class DesktopClient extends JFrame
	{
	 String ip="";
     class ImageThreader extends Thread
	{
			public void run()
		{
			while(true)
	   	 {
			try
	  	   {
			byte[] data = obj.getDesktop();
			InputStream in = new ByteArrayInputStream(data);
			BufferedImage img = ImageIO.read(in);
			setIcon(img);
			Thread.sleep(2000);
	 	   }
			catch(Exception ex)
	  	   {
			System.out.println(ex);
	  	   }
	   	 }
		}
	}
	private JLabel lbl;
	private Sum obj;
	public DesktopClient()throws RemoteException,IOException
	{
		String i=JOptionPane.showInputDialog(this,"Enter IP Address");
     	ip=i;
		lbl=new JLabel();
		add(lbl);
		try{
 			obj=(Sum)Naming.lookup("rmi://"+ip+"/xyz");
		   }
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		ImageThreader th=new ImageThreader();
		th.start();
	}

	public void setIcon(BufferedImage img)
	{
		lbl.setIcon(new ImageIcon(img));
	}
	public static void main(String[] args)
	{
		try{
			DesktopClient f=new DesktopClient();
			f.setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}