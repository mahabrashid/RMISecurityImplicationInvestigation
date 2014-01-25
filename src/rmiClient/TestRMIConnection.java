package rmiClient;

import java.net.MalformedURLException;
import java.rmi.AccessException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class TestRMIConnection {

	public static void main(String[] args) throws MalformedURLException {
        Registry registry;
        try {
            registry = LocateRegistry.getRegistry();
            registry.lookup("Hello");
            Naming.lookup("Hello");
        } catch (NotBoundException ex) {
        } catch (AccessException ex) {
        } catch (RemoteException ex) {
        }
//        try {
//            stub. insert("TestString");
//        } catch (RemoteException ex) {
//        }

	}
}
