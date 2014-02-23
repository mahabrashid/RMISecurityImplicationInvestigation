package rmiServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmiFunc.Hello;
import rmiFunc.HelloInterface;

public class HelloServer2 {
	static Registry rmiRegistry;

	/**
	   * Server program for the "Hello, world!" example.
	   * @param argv The command line arguments which are ignored.
	   */
	  public static void main (String[] argv) {
	    try {
//	      rmiRegistry = LocateRegistry.getRegistry("192.168.0.1", 1099);//connection refused exception
	      rmiRegistry = LocateRegistry.getRegistry();
	      
	      Hello hello2 = new Hello("Hello World two");
	      
	      HelloInterface stub = (HelloInterface) UnicastRemoteObject.exportObject(hello2, 0);
	      /*
	       * The static UnicastRemoteObject.exportObject method exports the supplied remote object 
	       * so that it can receive invocations of its remote methods from remote clients. 
	       * The second argument, an int, specifies which TCP port to use to listen for incoming 
	       * remote invocation requests for the object. It is common to use the value zero, 
	       * which specifies the use of an anonymous port. 
	       * The actual port will then be chosen at runtime by RMI or the underlying operating system. 
	       * However, a non-zero value can also be used to specify a specific port to use for listening. 
	       * Once the exportObject invocation has returned successfully, 
	       * the Hello remote object is ready to process incoming remote invocations.
	       */
	      
//	      rmiRegistry.rebind("Hello2", hello);
	      rmiRegistry.rebind("Hello2", stub);
	      System.out.println ("Hello Server2 is ready.");
	    } catch (Exception e) {
	      System.out.println ("Hello Server failed: " + e);
	      e.getStackTrace();
	      System.exit(-1);
	    }
	  }
}
