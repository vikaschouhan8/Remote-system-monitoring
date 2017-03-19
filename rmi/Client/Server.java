import java.rmi.server.*;
import java.rmi.*;
public class Server
{
public static void main(String args[])throws RemoteException
{
try
{
System.setSecurityManager(new RMISecurityManager());
Sum s= new SumImpl();
Naming.rebind("xyz",s);
System.out.println("SERVER STARTED");
}
catch(Exception e)
{
System.out.println(e);
}
}}