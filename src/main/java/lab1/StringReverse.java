package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringReverse {
	static Logger log = Logger.getLogger(StringReverse.class.getName());
	public static void main(String[] args) {
		String givenString, reverseString ="";
		log.info("Enter the String");
		Scanner sc = new  Scanner(System.in);
		givenString= sc.nextLine();
		int len= givenString.length();
		for( int i= len-1;i>=0;i--) {
			reverseString= reverseString +givenString.charAt(i);
		
		}
		log.info("============================");
		 log.info(reverseString);
		
		 sc.close();
	}


}
