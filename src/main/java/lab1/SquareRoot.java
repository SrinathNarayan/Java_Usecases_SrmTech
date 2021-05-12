package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class SquareRoot {
	static Logger log = Logger.getLogger(SquareRoot.class.getName());
	public static double squareRoot(int number) {
		double temp;

		double sr = number / 2;

		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	    }

	    public static void main(String[] args)  
	    { 
		log.info("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); 
		scanner.close();

		log.info("Square root of "+ num+ " is: "+squareRoot(num));
	    } 
}
