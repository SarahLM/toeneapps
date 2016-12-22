package rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Toene extends Remote{
	
	String ton(String a) throws RemoteException;
	
	

}
