package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringPremutation {
	static Logger log = Logger.getLogger(StringPremutation.class.getName());
	public static void main(String[] args) {
		String mystr = "";
		Scanner sc = new Scanner(System.in);
	    log.info("Enter the String :");
	      mystr = sc.nextLine();
		  permutationWithRepeation(mystr);
		  sc.close();
		 }

		 private static void permutationWithRepeation(String mystr) {
		log.info("The given string is: "+ mystr);
		log.info("The permuted strings are:");
		  showPermutation(mystr, "");
		 }

		 private static void showPermutation(String mystr, String NewStringToPrint) {

		  if (NewStringToPrint.length() == mystr.length()) {
		 log.info(NewStringToPrint);
		   return;
		  }
		  for (int i = 0; i < mystr.length(); i++) {

		   showPermutation(mystr, NewStringToPrint + mystr.charAt(i));
		  }
		 }
}
