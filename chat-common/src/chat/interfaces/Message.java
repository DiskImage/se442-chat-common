/*
 * Copyright 1999 by dreamBean Software,
 * All rights reserved.
 */
package chat.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *   This is the Message object. A Message is the core object in the chat system.
 *   The system can be extended by introducing new message types. Since the content
 *   is an Object it can be anything including images. You must also extend the ChatGUI
 *   if you want to present new types Messages in the user interface.
 *      
 *   @author Rickard Öberg (rickard@dreambean.com)
 *   @version $Revision:$
 */
public final class Message
   implements java.io.Externalizable
{
   // Constants -----------------------------------------------------
   private static final long serialVersionUID = 1L;
   
   // Pre-defined name for messages sent from the system
   public static final String SYSTEM = "System";
   
   // Pre-defined types of messages
   // This is the most common type: a text message
   public static final String TEXT = "Text"; 
      
   // Pre-defined types for control messages
   public static final String TOPIC_CREATED = "TopicCreated";
   public static final String TOPIC_REMOVED = "TopicRemoved";
   
   public static final String USER_JOINED = "UserJoined";
   public static final String USER_LEFT = "UserLeft";
   
   public static final String GREETING  = "Greeting";
   
   // Attributes ----------------------------------------------------
   String sender;
   String type;
   Object content;
   
   // Constructors --------------------------------------------------
   public Message()
   {
      // Used by Externalizable
   }
   
   public Message(String sender, String type, Object content)
   {
      this.sender = sender;
      this.type = type;
      this.content = content;
   }
   
   // Public --------------------------------------------------------
   public String getSender() 
   { 
      return sender; 
   }
   
   public String getType() 
   { 
      return type; 
   }
   
   public Object getContent() 
   { 
      return content; 
   }
   
   // Private -------------------------------------------------------
   // We use externalization instead of serialization since it is 
   // significantly faster in this case, and we are not worried about
   // inheritance hierarchies
   public void writeExternal(java.io.ObjectOutput out)
      throws java.io.IOException
   {
      out.writeUTF(sender);
      out.writeUTF(type);
      out.writeObject(content);
   }
   
   public void readExternal(java.io.ObjectInput in)
      throws java.io.IOException, ClassNotFoundException
   {
      sender = in.readUTF();
      type   = in.readUTF();
      content = in.readObject();
   }
}
