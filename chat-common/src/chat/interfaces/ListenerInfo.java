/*
 * Copyright 1999 by dreamBean Software,
 * All rights reserved.
 */
package chat.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *   ListenerInfo objects encapsulate information about the chat client user 
 *      
 *   @see <related>
 *   @author Rickard Öberg (rickard@dreambean.com)
 *   @version $Revision:$
 */
public class ListenerInfo
   implements java.io.Serializable
{
   // Attributes ----------------------------------------------------
   String name;
   
   // Constructors --------------------------------------------------
   public ListenerInfo(String name)
   {
      this.name = name;
   }
   
   // Public --------------------------------------------------------
   public String getName() { return name; }
   
   public String toString() { return name; }
   
   public boolean equals(Object obj)
   {
      return ((ListenerInfo)obj).getName().equals(name);
   }
   
   public int hashCode()
   {
      return name.hashCode();
   }
}
