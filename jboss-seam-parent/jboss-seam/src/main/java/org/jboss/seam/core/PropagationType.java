package org.jboss.seam.core;

/**
 * Various options controlling how a conversation is propagated.
 *  
 * @author Shane Bryzak
 */
public enum PropagationType
{
   BEGIN,
   JOIN,
   NESTED,
   NONE,
   END,
   ENDROOT
}
