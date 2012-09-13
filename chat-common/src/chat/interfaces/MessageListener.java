/*
 * Copyright 1999 by dreamBean Software,
 * All rights reserved.
 */
package chat.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *   A MessageListener is a remote object that can receive Message objects.
 *   This interface is implemented by both the client and server.
 *      
 *   @author Rickard Öberg (rickard@dreambean.com)
 *   @version $Revision:$
 */
public interface MessageListener
   extends Remote
{
   // Public --------------------------------------------------------
   public void messagePublished(Message message)
      throws RemoteException;
      
   public void messagePublished(Collection messages)
      throws RemoteException;
}
