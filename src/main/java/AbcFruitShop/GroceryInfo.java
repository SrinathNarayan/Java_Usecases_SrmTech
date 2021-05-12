package AbcFruitShop;

import java.util.logging.Logger;

public class GroceryInfo extends BaseModel {
	static Logger log = Logger.getLogger(GroceryInfo.class.getName());
	String groceryName;
	String groceryType;
	String distributor;
	double groceryWeight;
	String groceryCategory;
	String location;
	String expiryDate;
	int quantity;
	double cost;
	double totalcost;
	public GroceryInfo(String groceryName, String groceryType, String distributor, double groceryWeight,
			String groceryCategory, String location, String expiryDate, int quantity, double cost, double totalcost) {
		super();
		this.groceryName = groceryName;
		this.groceryType = groceryType;
		this.distributor = distributor;
		this.groceryWeight = groceryWeight;
		this.groceryCategory = groceryCategory;
		this.location = location;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
		this.cost = cost;
		this.totalcost = totalcost;
	}
	public double costDetails(String GroceryName)
	{
	switch(GroceryName)
	{
	case "rice":cost=50;
	totalcost=quantity*cost;
	break;
	case "dhal":cost=180;
	totalcost=quantity*cost;
	break;
	case "oil":cost=160;
	totalcost=quantity*cost;
	break;
	case "snacks":cost=60;
	totalcost=quantity*cost;
	break;
	case "beverage":cost=75;
	totalcost=quantity*cost;
	break;
	default: log.info("Grocery not available");
	}
	return totalcost;
	}
	@Override
	public String toString() {
		return "Grocerydetails [GroceryName=" + groceryName + ", GroceryType=" + groceryType + ", Distributor="
				+ distributor + ", GroceryWeight=" + groceryWeight + ", GroceryCategory=" + groceryCategory
				+ ", location=" + location + ", expiryDate=" + expiryDate + ", quantity=" + quantity + ", cost=" + cost
				+ ", totalcost=" + totalcost + "]";
	}


}
