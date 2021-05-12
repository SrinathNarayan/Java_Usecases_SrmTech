package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Logger;

public class ArrayListInDescendingOrder {
	static Logger log = Logger.getLogger(ArrayListInDescendingOrder.class.getName());
	public static void main(String[] args)   
	{   
	
	ArrayList<String> list = new ArrayList<>();   
	  
	list.add("Data Science");   
	list.add("Testing");   
	list.add("C#");   
	list.add("Basic Language");   
	list.add("UML");   
	list.add("Algorithms ");   
	list.add("Computer Networks");  
	list.add("Python");  
	 
	log.info("Before Sorting: "+ list);   
	
	Collections.sort(list, Collections.reverseOrder());   
	
	log.info("After Sorting In Descending Order: "+ list);   
	}

}
