package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class FactorialUsingRecursive {
	static Logger log = Logger.getLogger(FactorialUsingRecursive.class.getName());
	public static long factorial(int i) {
	      if(i <= 1) {
	         return 1;
	      }
	      return i * factorial(i - 1);
	   }
	   public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	     log.info("Enter the number");
	      int i = sc.nextInt();
	      log.info("Factorial of the given number is ::"+ factorial(i));
		  sc.close();
			   }

}
