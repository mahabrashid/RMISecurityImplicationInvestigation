package rmiClient;

import java.rmi.Naming;

import rmiFunc.HelloInterface;

public class HelloClient {
	/**
	   * Client program for the "Hello, world!" example.
	   * @param argv The command line arguments which are ignored.
	   */
	  public static void main (String[] argv) {
	    try {
	      HelloInterface hello = 
	        (HelloInterface) Naming.lookup ("//127.0.0.1:1099/Hello2");
	      System.out.println (hello.say());
	    } catch (Exception e) {
	      System.out.println ("HelloClient exception: " + e);
	      e.printStackTrace();
	    }
	  }
}
