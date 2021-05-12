package AbcFruitShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;


public class Fruitshop {
	static Logger log = Logger.getLogger(Fruitshop.class.getName());
	public void fruits(){
	
	List<FruitsInfo> fd = new ArrayList<>();	
	Scanner sc = new Scanner(System.in);
	log.info("Enter the no.of.Fruits Records : ");
	int n=sc.nextInt();
	for (int i=0;i<n;i++) {
		
		log.info("Enter the Fruit Name:");
		
		String fruitName= sc.next();
		log.info("Enter the Fruit Type:");
		String fruitType= sc.next();
		log.info("Enter the Fruit Weight[In Numbers]:");
		double fruitWeightr= sc.nextDouble();
		log.info("Enter the Distributor Name:");
		String distributor= sc.next();
		log.info("Enter the Fruit Category:");
		String fruitcategory= sc.next();
		log.info("Enter Your Location:");
		String location= sc.next();
		log.info("Enter the ExpiryDate:[Must Be Date]");
		String expiryDate= sc.next();
		log.info("Enter the Quantity:");
		int quantity= sc.nextInt();
		log.info("Enter the Cost:[In Numbers]");
		double cost= sc.nextDouble();
		
		fd.add(new FruitsInfo(fruitName, fruitType,  distributor,fruitWeightr, fruitcategory, location, expiryDate, quantity, cost,quantity*cost));
	}
	
	FruitsOperation fo=new FruitsOperation();
	fo.getDetails((ArrayList<FruitsInfo>)fd);
	fo.findByDis((ArrayList<FruitsInfo>)fd,"Ram");
	fo.findByName((ArrayList<FruitsInfo>)fd,"mango");
	fo.findByloc((ArrayList<FruitsInfo>)fd,"Pune");
	sc.close();
	}
}

