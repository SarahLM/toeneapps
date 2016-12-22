package rmi.mitarbeiter;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import rmi.interfaces.Toene;


public class Server {
	
	
	public Server() {
		try {
			LocateRegistry.createRegistry(1099);
		} catch (RemoteException e1) {
			
			e1.printStackTrace();
		}
		try {
			Toene a = new ToeneImpl();
			Naming.rebind("rmi://localhost:1099/ToeneService", a);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

	public static void main(String args[]) {
		new Server();
		
		}

}
