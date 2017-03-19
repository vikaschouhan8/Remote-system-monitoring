import java.rmi.*;
import java.rmi.server.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
public class SumImpl extends UnicastRemoteObject implements Sum
{
 public SumImpl() throws RemoteException
{
super();
}

public void shutdown()throws RemoteException
{
	 try
	{
	Runtime rt = Runtime.getRuntime();
	Process pr = rt.exec("cmd /c shutdown -l");
	}
 	catch (Exception ew)
	{
	ew.printStackTrace();
 	}
}

public void shutdown(int s)throws RemoteException
{
	 try
	{
	Runtime rt = Runtime.getRuntime();
	rt.exec("cmd /c shutdown -s -t 60");
	//System.out.println("shutdown -s -t "+s);
	}
 	catch (Exception ew)
	{
	ew.printStackTrace();
 	}
}

public void sendMsg(String s)throws RemoteException
{
     javax.swing.JOptionPane.showMessageDialog(null,s);
}

public byte[] getDesktop()
{
	try
	{
	GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
	GraphicsDevice screen=env.getDefaultScreenDevice();
	Robot robot=new Robot(screen);
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	BufferedImage img=robot.createScreenCapture(new Rectangle(0,0,d.width,d.height));
	ByteArrayOutputStream bytes = new ByteArrayOutputStream();
	ImageIO.write(img, "jpg", bytes );
	bytes.flush();
	byte[] data = bytes.toByteArray();
	bytes.close();
	return data;
	}
	catch(Exception ex)
	{
	System.out.println(ex);
	return null;	
	}	
}

public File[] showDrives()throws RemoteException
{
      File f[]=File.listRoots();   
         return f;
}

}