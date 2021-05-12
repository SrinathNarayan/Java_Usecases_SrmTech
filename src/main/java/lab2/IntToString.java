package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class IntToString {
	static Logger log = Logger.getLogger(IntToString.class.getName());
	
	 public static void main(String[] args) {
		 int num ;
		 Scanner sc = new Scanner(System.in);
		log.info("Enter the Days");
			num = sc.nextInt();
	       
	        
	        String msg = String.format("There are %s DaYs Left", num);
	        
	       log.info(msg);             
			sc.close();
		 }
}
