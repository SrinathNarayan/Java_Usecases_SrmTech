package SalesReport;

import java.util.logging.Logger;

public class BeveragesProducts {
	 protected int pid ;
	 protected int Qty; 
	 protected int rate; 
	protected int Gst;
	protected int TotalAmt ;
	 protected  String brand;
	public static final String T1 = "Products Details";
	static Logger log = Logger.getLogger(BeveragesProducts.class.getName());
	
	public BeveragesProducts(int pid, int qty, int rate, int gst, int totalAmt, String brand) {
		super();
		this.pid = pid;
		this.Qty = qty;
		this.rate = rate;
		this.Gst = gst;
		this.TotalAmt = totalAmt;
		this.brand = brand;
	}
	
	public void showcocoladetails() {
	log.info(T1);
		log.info("------------------");
		   log.info(  " " + "ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = " + this.rate + " Rs"   + "\nProduct Brand = " + this.brand +
			        		"\nProduct_GST = " + this.Gst + "%" +"\nQty = " +  this.Qty+ "\nTotalPrice = "  +  this.Qty*this.rate + " Rs"  );
		    this.TotalAmt= this.rate*this.Qty;
			 }

	public void showPepsidetails() {
	log.info(T1);
		log.info("-------------------");
		log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid  + "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand +
		    		"\nProduct_GST = " + this.Gst + "%" +"\nQty = " +  this.Qty+ "\nTotalPrice = "  +  this.Qty*this.rate + " Rs"  );
		    this.TotalAmt= this.rate*this.Qty;
			 }
			    
	public void cocoprice() {
	
		 log.info(T1);
		log.info("[Total Price * Gst Charged/100 ]");
		 log.info("----------------");
		 log.info("Product Price: = " + this.TotalAmt*this.Gst/100
		 		+ " Rs"  + "\nGst Charged = " + this.Gst + "%");
			 }
	
		
		 
			 

	public void pepsiprice() {
	log.info(T1);
	log.info("[Total Price * Gst Charged/100 ]");
	 log.info("-----------------");
	 log.info("Product Price: = " + this.TotalAmt*this.Gst/100
	 		+ " Rs"  + "\nGst Charged = " + this.Gst + "%");
		
	}
}
