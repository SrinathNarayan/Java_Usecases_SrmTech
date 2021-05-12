package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class RemoveWhiteSpace {
	static Logger log = Logger.getLogger(RemoveWhiteSpace.class.getName());
	public static void main(String[] args) {
		String line = "";
		Scanner sc =  new Scanner(System.in);
		log.info("Enter the line:");
		line= sc.nextLine();
		
		log.info(line.replace(" ",""));
		sc.close();
		}

}
