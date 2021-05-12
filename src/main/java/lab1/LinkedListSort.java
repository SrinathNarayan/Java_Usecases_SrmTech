package lab1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.logging.Logger;

public class LinkedListSort {
    static Logger log = Logger.getLogger(LinkedListSort.class.getName());
	public static void main(String[] args) 
    {
        LinkedList<String> listOfNames = new LinkedList<>();
        
        listOfNames.add("D");
        listOfNames.add("A");
        listOfNames.add("Z");
        listOfNames.add("Y");
        listOfNames.add("X");
        
      log.info("Before sorting: "+ listOfNames);
        listOfNames.sort(new MyComparator());
       log.info("After sorting: "+ listOfNames);
    }
}
class MyComparator implements Comparator<String>
{
    public int compare(String string1, String string2) 
    { 
        return string1.compareTo(string2); 
    } 
}
