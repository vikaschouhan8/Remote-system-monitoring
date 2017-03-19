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
Toolkit t=Toolkit.getDefaultToolkit();	
Dimension d=t.getScreenSize();
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


}