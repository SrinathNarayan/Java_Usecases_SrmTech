package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class PrimeorNot {
	static Logger log = Logger.getLogger(PrimeorNot.class.getName());
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		log.info("Enter the number");
		num= sc. nextInt();
		
		
	    boolean isprime = false;
	    for (int i = 2; i <= num / 2; ++i) {
	     
	      if (num % i == 0) {
	    	  isprime = false;
	        break;
	      }
	    }

	    if (!isprime)
	     log.info( "Given Number "+num + " is a  prime number.");
	    else {
	     log.info("Given Number "+num + " is not a prime number.");
	  }
sc.close();
	}
	}


