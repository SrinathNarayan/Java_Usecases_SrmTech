package AbcFruitShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    

public class GroceryShp {
	
	public void grocery(){

		List<GroceryInfo> fd = new ArrayList<GroceryInfo>();	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of.Grocery Records : ");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			
			System.out.println("Enter the Grocery Product Name:");
			String GroceryName= sc.next();
			System.out.println("Enter the Grocery Type");
			String GroceryType= sc.next();
			System.out.println("enter the Grocery weight:[In Numbers]");
			double GroceryWeight= sc.nextDouble();
			System.out.println("Enter the Distributor Name:");
			String Distributor= sc.next();
			System.out.println("Enter the Grocery Category:");
			String Grocerycategory= sc.next();
			System.out.println("Enter Your Location:");
			String location= sc.next();
			System.out.println("Enter the ExpiryDate[Must Be Date]:");
			String expiryDate= sc.next();
			System.out.println("Enter the Quantity:[In Numbers]");
			int quantity= sc.nextInt();
			System.out.println("Enter the Cost:");
			double cost= sc.nextDouble();
			fd.add(new GroceryInfo(GroceryName, GroceryType,Distributor,GroceryWeight, Grocerycategory, location, expiryDate, quantity, cost,quantity*cost));
		}
		GroceryOperation go=new GroceryOperation();
		go.getDetails((ArrayList)fd);
		go.findByDis((ArrayList)fd,"Mohan");
		go.sortByDistAndGroceryType((ArrayList)fd);
		go.SortByCostAndExpiry((ArrayList)fd);
		
		
	}
}
