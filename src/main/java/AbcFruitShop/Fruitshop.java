package AbcFruitShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Fruitshop {
	public void fruits(){
	
	List<FruitsInfo> fd = new ArrayList<FruitsInfo>();	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no.of.Fruits Records : ");
	int n=sc.nextInt();
	for (int i=0;i<n;i++) {
		
		System.out.println("Enter the Fruit Name:");
		
		String fruitName= sc.next();
		System.out.println("Enter the Fruit Type:");
		String fruitType= sc.next();
		System.out.println("Enter the Fruit Weight[In Numbers]:");
		double fruitWeightr= sc.nextDouble();
		System.out.println("Enter the Distributor Name:");
		String Distributor= sc.next();
		System.out.println("Enter the Fruit Category:");
		String fruitcategory= sc.next();
		System.out.println("Enter Your Location:");
		String location= sc.next();
		System.out.println("Enter the ExpiryDate:[Must Be Date]");
		String expiryDate= sc.next();
		System.out.println("Enter the Quantity:");
		int quantity= sc.nextInt();
		System.out.println("Enter the Cost:[In Numbers]");
		double cost= sc.nextDouble();
		
		fd.add(new FruitsInfo(fruitName, fruitType,  Distributor,fruitWeightr, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
	}
	
	FruitsOperation fo=new FruitsOperation();
	fo.getDetails((ArrayList<FruitsInfo>)fd);
	fo.findByDis((ArrayList<FruitsInfo>)fd,"Ram");
	fo.findByName((ArrayList<FruitsInfo>)fd,"mango");
	fo.findByloc((ArrayList<FruitsInfo>)fd,"Pune");
	}
}

