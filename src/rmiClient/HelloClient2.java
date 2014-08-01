package rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiFunc.HelloInterface;

public class HelloClient2 {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("192.168.0.5", 1099);
			HelloInterface hello = (HelloInterface) registry.lookup("Hello3");
			
			System.out.println(hello.say());
		} catch (Exception e) {
			System.out.println("Exception in HelloClient2.");
			e.printStackTrace();
		}
	}

}
