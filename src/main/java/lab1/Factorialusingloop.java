package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Factorialusingloop {
    static Logger log = Logger.getLogger(Factorialusingloop.class.getName());

	public static void main(String[] args) {
		int num;
		log.info("Enter the Number:");
	    Scanner sc =  new Scanner(System.in);
		num = sc.nextInt();
		int factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            
            factorial *= i;
        }
        log.info("Factorial of"+ "  " + num +" = " + factorial);
        sc.close();
      }

}
