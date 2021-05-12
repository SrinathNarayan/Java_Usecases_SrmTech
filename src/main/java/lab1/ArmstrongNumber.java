package lab1;


import java.util.Scanner;
import java.util.logging.Logger;

public class ArmstrongNumber {

	static Logger log = Logger.getLogger(ArmstrongNumber.class.getName());

	 public static void main(String[] args) {

	        int number ; 
			int originalNumber; 
			int remainder; 
			int  result = 0;
	        Scanner sc =  new Scanner(System.in);
			log.info("Enter a Number :");
			number= sc.nextInt();
	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            log.info(number+ " is an Armstrong number.");
	        else
	            log.info(number+ " is not an Armstrong number.");
	    
sc.close();
		}
}
