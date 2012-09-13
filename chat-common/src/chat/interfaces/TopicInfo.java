/*
 * Copyright 1999 by dreamBean Software,
 * All rights reserved.
 */
package chat.interfaces;

/**
 *   TopicInfo objects contain information about topics 
 *      
 *   @see Topic
 *   @author Rickard Öberg (rickard@dreambean.com)
 *   @version $Revision:$
 */
public class TopicInfo
   implements java.io.Serializable
{
   // Attributes ----------------------------------------------------
   String name;
   String description;
   
   // Constructors --------------------------------------------------
   public TopicInfo(String name, String description)
   {
      this.name = name;
      this.description = description;
   }
   
   // Public --------------------------------------------------------
   public String getName() 
   { 
      return name; 
   }
   
   public String getDescription() 
   { 
      return description; 
   }
   
   public String toString() 
   { 
      return name; 
   }
   
   public boolean equals(Object obj)
   {
      return ((TopicInfo)obj).getName().equals(name);
   }
   
   public int hashCode()
   {
      return name.hashCode();
   }
}
