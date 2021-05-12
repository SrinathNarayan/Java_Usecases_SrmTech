package lab2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class IterateInHashSet {
	static Logger log = Logger.getLogger(IterateInHashSet.class.getName());
	 public static void main(String args[])
	    {
	       
	        HashSet<String> set = new HashSet<>();
	  
	       
	        set.add("Gokul");
	        set.add( "Latha");
	        set.add( "Srinath");
	        set.add( "Sumathy");
	        set.add( "Kishore");
	        set.add( "Lokesh");
	  
	        
	      log.info("HashSet: " + set);
	  
	        
	        Iterator<String> value = set.iterator();
	  
	        
	      log.info("The iterator values are: ");
	        while (value.hasNext()) {
	          log.info(value.next());
	        }
	    }
}
