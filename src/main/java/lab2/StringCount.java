package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringCount {
	static Logger log = Logger.getLogger(StringCount.class.getName());
	  public static void main(String[] args) {    
		  Scanner a = new Scanner(System.in);
	        String sentence = a.nextLine();
	       log.info("Number of words in string is: " +count(sentence));
	        a.close();
	    }

	    static int count(String sen) {
	        if (sen == null || sen.isEmpty())
	            return 0;

	        int count = 0;
	        for (int i = 0; i < sen.length(); i++) {
	            if (sen.charAt(i)!= ' ') {
	                count++;

	                while(sen.charAt(i) != ' ' && i < sen.length() - 1) {
	                    i++;
	                }
	            }
	        }
	        return count;
	         
	    }    

}
