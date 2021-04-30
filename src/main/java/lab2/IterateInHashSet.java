package lab2;

import java.util.HashSet;
import java.util.Iterator;

public class IterateInHashSet {
	 public static void main(String args[])
	    {
	       
	        HashSet<String> set = new HashSet<String>();
	  
	       
	        set.add("Gokul");
	        set.add( "Latha");
	        set.add( "Srinath");
	        set.add( "Sumathy");
	        set.add( "Kishore");
	        set.add( "Lokesh");
	  
	        
	        System.out.println("HashSet: " + set);
	  
	        
	        Iterator value = set.iterator();
	  
	        
	        System.out.println("The iterator values are: ");
	        while (value.hasNext()) {
	            System.out.println(value.next());
	        }
	    }
}