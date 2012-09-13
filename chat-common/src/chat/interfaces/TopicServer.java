/*
 * Copyright 1999 by dreamBean Software,
 * All rights reserved.
 */
package chat.interfaces;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 *   This is the remote interface for the chat server.
 *      
 *   @author Rickard Öberg (rickard@dreambean.com)
 *   @version $Revision:$
 */
public interface TopicServer
   extends Remote
{
   // Public --------------------------------------------------------
   public Collection getTopicInfos()
      throws RemoteException;
      
   public void addListener(ListenerInfo info, MessageListener callBack)
      throws RemoteException;
      
   public void removeListener(ListenerInfo info)
      throws RemoteException;
      
   public Topic subscribe(TopicInfo topic, ListenerInfo info)
      throws RemoteException;
      
   public void unsubscribe(TopicInfo topic, ListenerInfo info)
      throws RemoteException;
}
