package SalesReport;

import java.util.logging.Logger;

public class Catogories {
	public static final String T1 ="Welcome to Emart";
	static Logger log = Logger.getLogger(Catogories.class.getName());
	public void beverages() {

		log.info("\t\t\t\t\t "+ T1);
		log.info("\t\t\t\t\tWe Sell Beverages Too");
		log.info("\t\t\t\t\t    1.Cocola\n\t\t\t\t\t    2.Pepsi");
		
		
		
	}
	
	public void foodgrains() {

		log.info("\t\t\t\t\t Welcome to Emart");
		log.info("\t\t\t\tWe Sell Foodgrains Too");
		log.info("\t\t\t\t\t    1.Atta\n\t\t\t\t\t    2.Rice");
		
		
		
	}
	public void vegetables() {

		log.info("\t\t\t\t\t Welcome to Emart");
		log.info("\t\t\t\t\tWe Sell Best Vegetables Too");
		log.info("\t\t\t\t\t    1.Potato\n\t\t\t\t\t    2.Tomato");
		
		
	}
	
	

}
