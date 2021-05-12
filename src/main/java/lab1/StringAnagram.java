package lab1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class StringAnagram {
	static Logger log = Logger.getLogger(StringAnagram.class.getName());

	public static void main(String[] args) {
		 
	    Scanner input = new Scanner(System.in);

	   
	  log.info("Enter first String: ");
	    String str1 = input.nextLine();
	  log.info("Enter second String: ");
	    String str2 = input.nextLine();

	   	    if(str1.length() == str2.length()) {

	     
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();

	    
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	      log.info(str1 + " and " + str2 + " are anagram.");
	      }

	    }
	    else {
	    log.info(str1 + " and " + str2 + " are not anagram.");
	    }

	    input.close();
	  }

	}


