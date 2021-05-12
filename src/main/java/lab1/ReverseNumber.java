package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseNumber {
	static Logger log = Logger.getLogger(ReverseNumber.class.getName());
	public static void main(String args[])
	   {
	      int num=0;
	      int reversenum =0;
	      log.info("Enter your number: ");
	    
	      Scanner in = new Scanner(System.in);
	    
	      num = in.nextInt();
	     
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          reversenum = reversenum + num%10;
	          num = num/10;
	      }

	      log.info("Reverse of specified number is: "+reversenum);
	  in.close();
	 }
}
