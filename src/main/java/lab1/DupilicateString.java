package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class DupilicateString {
	static Logger log = Logger.getLogger(DupilicateString.class.getName());

	 public static void main(String args[]) {
	      String str ;
	      
			Scanner sc = new Scanner(System.in);
			log.info("Enter the string");
			str = sc.nextLine();
	      char[] carray = str.toCharArray();
	      log.info("The string is:"+ str);
	      log.info("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++) {
	         for (int j = i + 1; j < str.length(); j++) {
	            if (carray[i] == carray[j]) {
	            log.info(carray[j]+ " ");
	               break;
	            }
	         }
	      }
		  sc.close();
	   }

}
