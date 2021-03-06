package rmiFunc;

import java.rmi.*;

/**
 * Remote Interface for the "Hello, world!" example.
 */
public interface HelloInterface extends Remote {
  /**
   * Remotely invokable method.
   * @return the message of the remote object, such as "Hello, world!".
   * @exception RemoteException if the remote invocation fails.
   */
  public String say() throws RemoteException;
}