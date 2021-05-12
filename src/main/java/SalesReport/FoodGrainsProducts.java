package SalesReport;

import java.util.logging.Logger;

public class FoodGrainsProducts {

	protected int pid;
	protected int qty;
	protected int rate;
	protected int gst;
	protected int totalAmt;
	protected String brand;
	public static final String T1 = "Products Details";
	public static final String T2 = "-----------------";
	static Logger log = Logger.getLogger(FoodGrainsProducts.class.getName());

	public FoodGrainsProducts(int pid, int qty, int rate, int gst, int totalAmt, String brand) {
		super();
		this.pid = pid;
		this.qty = qty;
		this.rate = rate;
		this.gst = gst;
		this.totalAmt = totalAmt;
		this.brand = brand;
	}

	public void showattadetails() {
		log.info(T1);
		log.info(T2);
		log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid
				+ "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand + "\nProduct_GST = " + this.gst
				+ "%" + "\nQty = " + this.qty + "\nTotalPrice = " + this.qty * this.rate + " Rs");
		this.totalAmt = this.rate * this.qty;
	}

	public void showriceproductdetails() {
		log.info(T1);
		log.info(T2);
		log.info("ProductDetails:\n------------------------------------------\nProduct Id = " + this.pid
				+ "\nProduct Price = " + this.rate + "\nProduct Brand = " + this.brand + "\nProduct_GST = " + this.gst
				+ "%" + "\nQty = " + this.qty + "\nTotalPrice = " + this.qty * this.rate + " Rs");
		this.totalAmt = this.rate * this.qty;
	}

	public void riceprice() {
		log.info(T1);
		
		log.info("[Total Price * Gst Charged/100 ]");
		log.info(T2);
		log.info(
				"Product Price: = " + this.totalAmt * this.gst / 100 + " Rs" + "\nGst Charged = " + this.gst + "%");
	}

	public void attaprice() {
		log.info(T1);
		
		log.info("[Total Price * Gst Charged/100 ]");
		log.info(T2);
		log.info(
				" " + "Product Price: = " + this.totalAmt * this.gst / 100 + " Rs" + "\nGst Charged = " + this.gst + "%");

	}

}
