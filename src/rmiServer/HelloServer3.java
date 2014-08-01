package rmiServer;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmiFunc.Hello;
import rmiFunc.HelloInterface;

public class HelloServer3 {

	public static void main(String[] args) {
		try {
			Hello hello3 = new Hello("Hello World three says hello!");

			Registry registry = LocateRegistry.createRegistry(1099); // starting
																		// registry
																		// within
																		// the
																		// code
			HelloInterface stub = (HelloInterface) UnicastRemoteObject
					.exportObject(hello3, 0);
			registry.rebind("Hello3", stub);

			System.out.println("HelloServer3 is ready.");
		} catch (RemoteException e) {
			System.out.println("Exception in HelloServer3.");
			e.printStackTrace();
		}

	}

}
