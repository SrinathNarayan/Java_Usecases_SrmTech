package lab1;

import java.util.LinkedList;
import java.util.logging.Logger;

public class MiddleElement {

	static Logger log = Logger.getLogger(MiddleElement.class.getName());	
	public static void main(String[] args)
	  {
	    // create a linked list using the LinkedList class
	    LinkedList<Integer> ll = new LinkedList<>();
	    // Add elements to LinkedList
	    ll.add(2);
	    ll.addFirst(3);
	    ll.addLast(5);
	    ll.addLast(6);
	    ll.addLast(8);
	    ll.addLast(13);
	    ll.addLast(18);
	   log.info("LinkedList: " + ll);
	    // access middle element
	    int middle = ll.get(ll.size()/2);
	   log.info("Middle Element: " + middle);
	    }

}
