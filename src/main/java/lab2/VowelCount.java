package lab2;

import java.util.Scanner;
import java.util.logging.Logger;
public class VowelCount {
	static Logger log = Logger.getLogger(VowelCount.class.getName());
	public static void main(String[] args)
	       
	    {
		
	        String str;
	        Scanner sc = new Scanner(System.in);
			log.info("Enter the string");
			str = sc.nextLine();
	            str = str.toLowerCase();
	  
	     
	       
	        int count = 0;
	  
	        for (int i = 0; i < str.length(); i++)
	        {
	           
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u')
	            {
	               
	                count++;
	            }
	        }
	  
	       
	        log.info("Total no of vowels in string are: " + count);
			sc.close();
		 }
}
