import java.rmi.*;
import java.io.*;
interface Sum extends Remote
{
void shutdown()throws RemoteException;
void shutdown(int s)throws RemoteException;
public byte[] getDesktop() throws RemoteException;
void sendMsg(String s)throws RemoteException;
File[] showDrives()throws RemoteException;
} 