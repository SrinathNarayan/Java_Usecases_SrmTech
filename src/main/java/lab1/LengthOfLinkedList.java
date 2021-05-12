package lab1;

import java.util.LinkedList;
import java.util.logging.Logger;

public class LengthOfLinkedList {
    static Logger log = Logger.getLogger(LengthOfLinkedList.class.getName());
	public static void main(String args[])
    {
  
   
        LinkedList<String> list = new LinkedList<>();
  
        
        list.add("Shri");
        list.add("kishore");
        list.add("lokesh");
        list.add("latta");
        list.add("gokul");
  

       log.info("LinkedList:" + list);
          
       
       log.info("The size of the linked list is: " 
                                                + list.size());
    }

}
