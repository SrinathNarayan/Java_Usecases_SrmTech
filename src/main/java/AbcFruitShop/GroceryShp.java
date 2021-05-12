package AbcFruitShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

    

public class GroceryShp {
	static Logger log = Logger.getLogger(GroceryShp.class.getName());
	public void grocery(){

		List<GroceryInfo> fd = new ArrayList<GroceryInfo>();	
		
		Scanner sc = new Scanner(System.in);
		log.info("Enter the No.of.Grocery Records : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			
			log.info("Enter the Grocery Product Name:");
			String groceryName= sc.next();
			log.info("Enter the Grocery Type");
			String groceryType= sc.next();
			log.info("enter the Grocery weight:[In Numbers]");
			double groceryWeight= sc.nextDouble();
			log.info("Enter the Distributor Name:");
			String distributor= sc.next();
			log.info("Enter the Grocery Category:");
			String grocerycategory= sc.next();
		log.info("Enter Your Location:");
			String location= sc.next();
			log.info("Enter the ExpiryDate[Must Be Date]:");
			String expiryDate= sc.next();
			log.info("Enter the Quantity:[In Numbers]");
			int quantity= sc.nextInt();
			log.info("Enter the Cost:");
			double cost= sc.nextDouble();
			fd.add(new GroceryInfo(groceryName, groceryType,distributor,groceryWeight, grocerycategory, location, expiryDate, quantity, cost,quantity*cost));
		}
		GroceryOperation go=new GroceryOperation();
		go.getDetails((ArrayList<GroceryInfo>)fd);
		go.findByDis((ArrayList<GroceryInfo>)fd,"Mohan");
		go.sortByDistAndGroceryType((ArrayList<GroceryInfo>)fd);
		go.SortByCostAndExpiry((ArrayList<GroceryInfo>)fd);
		
	sc.close();
	}
}
