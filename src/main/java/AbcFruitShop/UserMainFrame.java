package AbcFruitShop;

import java.util.Scanner;
import java.util.logging.Logger;



public class UserMainFrame {
	static Logger log = Logger.getLogger(UserMainFrame.class.getName());
	public static void main(String[] arg) 
    { 
		Scanner scc = new Scanner(System.in);
		String name;
		
		log.info("\t\t\t\t\tOnline E Market");
		log.info(	"\t\t\t\t\t    Since 1978");
		log.info("------------------------------------------------------------------------------------------------------------------");
		log.info("Enter Your Name");
	    log.info("------------------------");
	    name= scc.next();
	    log.info("===================================================================================================================");;
	    log.info("=========================");
	    log.info("Welcome To  Emart ");
	    log.info("===================================================================================================================");
	    log.fine("Welcome" +name);
	   
	   
	    log.info("----------------------------------------------------------------------------------------------------------------"); 
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("\t\t\t\t\tChoose your Shop:");
		int i;
		
		log.info("\t\t\t\t\t    1.Fruits \n \t\t\t\t\t    2.Grocery");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		log.info("\t\t\t\t\t  Enter your option");
		 i=sc.nextInt();
		log.info("==================================================================================================================");
		shops shop = new shops();
		if(i==1) {
			shop.fruitshop();
			log.info("\t\t\t\t\tEnter Fruit Details:");
			 Fruitshop Aproduct = new Fruitshop();
			 Aproduct.fruits();
			 
    }
		if(i==2) {
			shop.groceryshop();
			log.info("\t\t\t\t\tChoose your Product:");
			GroceryShp Aproduct = new GroceryShp();
			 Aproduct.grocery();
	
}
scc.close();
sc.close();
    }
}
