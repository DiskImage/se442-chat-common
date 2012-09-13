/*
 * Copyright 1999 by dreamBean Software,
 * All rights reserved.
 */
package chat.interfaces;

import java.io.IOException;
import java.rmi.Remote;
import java.util.Collection;
import java.rmi.RemoteException;

/**
 *   This is the remote interface for Topics.  
 *      
 *   @see masteringrmi.chat.server.TopicImpl
 *   @author Rickard Öberg (rickard@dreambean.com)
 *   @version $Revision:$
 */
public interface Topic
   extends Remote
{
   // Public --------------------------------------------------------
   public void publishMessage(Message message)
      throws RemoteException;
      
   public Collection getListenerInfos()
      throws RemoteException;
}
