package lab2;

import java.util.HashMap;
import java.util.logging.Logger;

public class RemovingKeyValueInhashmap {
	static Logger log = Logger.getLogger(RemovingKeyValueInhashmap.class.getName());
	public static void main(String[] args) {
        
	   
	    HashMap<Integer, String> hashmap = new HashMap<>();
	  
	   
	    hashmap.put(10, "Ram");
	    hashmap.put(15, "Sham");
	    hashmap.put(20, "Ravi");
	    hashmap.put(25, "Latta");
	    hashmap.put(30, "Sun");
	  
	    
	   log.info("Initial Mappings are: " + hashmap); 
	  
	    
	    String returnedvalue = (String)hashmap.remove(20);
	  
	  
	   log.info("Returned value is: "+ returnedvalue);
	  
	    
	   log.info("New map is: "+ hashmap);
	}
}
