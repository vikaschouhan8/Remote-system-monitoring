import java.rmi.*;
interface Sum extends Remote
{
void shutdown()throws RemoteException;
public byte[] getDesktop() throws RemoteException;
void sendMsg(String s)throws RemoteException;
} 
