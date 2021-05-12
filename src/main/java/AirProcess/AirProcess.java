
package AirProcess;

import java.util.Scanner;
import java.util.logging.Logger;


public class AirProcess {
	static Logger log = Logger.getLogger(AirProcess.class.getName());
	public static void main(String[] args) {

		log.info("\t\t\t\t\t Aircel AirProcess Services");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("\t\t\t\t\t    Choose your Services:");
		log.info("\t\t\t\t        =============================");
		int i;
		log.info("\t\t\t\t\t 1.View Compelete History   \n \t\t\t\t\t 2.Search Particular Customer History");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		log.info("\t\t\t\t\t    Select Your Service");
		log.info("\t\t\t\t       =============================");
		 i=sc.nextInt();
		log.info("==================================================================================================================");
		Services types= new Services();
		if(i==1) {
			
			types.display();
			}
		if(i==2) {
			types.searchfilter() ;
			
			}
			sc.close();
}
}