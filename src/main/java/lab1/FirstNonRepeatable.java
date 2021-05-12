package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class FirstNonRepeatable {
	static Logger log = Logger.getLogger(FirstNonRepeatable.class.getName());
	public static void main(String[] args) {
		  String str1 ;
		  Scanner sc = new Scanner(System.in);
	    log.info("Enter the String :");
	       str1 = sc.nextLine();
		log.info("The given string is: " + str1);
		  for (int i = 0; i < str1.length(); i++) {
		   boolean unique = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		  log.info("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }sc.close();
		 }
}
