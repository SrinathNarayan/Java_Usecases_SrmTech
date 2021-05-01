package AbcFruitShop;

import java.util.Scanner;

import SalesReport.Products;

public class UserMainFrame {
	public static void main(String[] arg) 
    { 
		System.out.println("\t\t\t\t\tOnline Super Market");
		System.out.println(	"\t\t\t\t\t    Since 1978");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\tChoose your Shop:");
		int i,J = 0,k = 0, h=0;
		System.out.println("\t\t\t\t\t    1.Fruits \n \t\t\t\t\t    2.Grocery");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\t  Enter your option");
		 i=sc.nextInt();
		System.out.println("==================================================================================================================");
		shops shop = new shops();
		if(i==1) {
			shop.fruitshop();
			System.out.println("\t\t\t\t\tEnter Fruit Details:");
			 Fruitshop Aproduct = new Fruitshop();
			 Aproduct.fruits();
			 
    }
		if(i==2) {
			shop.groceryshop();
			System.out.println("\t\t\t\t\tChoose your Product:");
			GroceryShp Aproduct = new GroceryShp();
			 Aproduct.grocery();
	
}
    }
}
