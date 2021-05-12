package SalesReport;

import java.util.logging.Logger;

public class FinalPayment {
	public static final String T1 = "Order Summary ";
	public static final String T2 = "Product Willbe Delivered Next day" ;
	public static final String T3 = "Only Cash On Delivary Available";
	public static final String T4 = "=============";

	static Logger log = Logger.getLogger(FinalPayment.class.getName());
	public void cocolapay() {
		log.info(" ");
		log.info(T1);
	     log.info(T4);
	     Products aproduct = new Products();
	     aproduct.cocorate();
	     log.info(T2);
	     log.info(T3);
	}
	
	public void pepsipay() {
		log.info(" ");
		log.info(T1);
	    log.info(T4);
	     Products aproduct = new Products();
	     aproduct.pepsirate();
		 log.info(T2);
	     log.info(T3);
	}
	
	public void tomatopay() {
		log.info(" ");
		log.info(T1);
		log.info(T4);
	     Products product = new Products();
	     product.tomatorate();
	     log.info(T2);
	     log.info(T3);
	}
	
	public void potatopay() {
		log.info(" ");
		log.info(T1);
		log.info(T4);
	     Products product = new Products();
	     product.potatorate();
	     log.info(T2);
	     log.info(T3);
	}
	public void ricepay() {
		log.info(" ");
		log.info(T1);
		log.info(T4);
	     Products product = new Products();
	     product.ricerate();
	     log.info(T2);
	     log.info(T3);
	}
	
	public void attapay() {
		log.info(" ");
		log.info(T1);
		log.info(T4);
	     Products product = new Products();
	     product.attarate();
	     log.info(T2);
	     log.info(T3);
	}
	 
}
