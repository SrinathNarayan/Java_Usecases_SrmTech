package lab2;

import java.util.ArrayList;
import java.util.logging.Logger;


public class StringArrayToArrayList {
	static Logger log = Logger.getLogger(StringArrayToArrayList.class.getName());
	public static void main(String[] args) {

		
		ArrayList<String> friendsnames= new ArrayList<>();
		friendsnames.add("Ankur");
		friendsnames.add("Ajeet");
		friendsnames.add("Harsh");
		friendsnames.add("John");
		log.info("Before Conversion");
        log.info( ""+friendsnames);
        log.info("===========================");
		/*ArrayList to Array Conversion */
		String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);
		log.info("After Conversion");
		/*Displaying Array elements*/
		for(String k: frnames)
		{
			log.info(k);
		}
	}
}
