package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class StringConcatation {
	static Logger log = Logger.getLogger(StringConcatation.class.getName());
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        log.info("Enter Month Of Year ");
	        String month = sc.nextLine();
	        log.info("Enter  A Year : ");
	        String year = sc.nextLine();
	        log.info("Enter  Day of Month: ");
	        int day = sc.nextInt();
	        String dob = "Date Of Brith : " + day + " " + month + " "+year;

	        log.info(  dob);
	        sc.close();
	    }

}
