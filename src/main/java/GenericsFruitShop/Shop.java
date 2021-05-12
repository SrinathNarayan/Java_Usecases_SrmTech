package GenericsFruitShop;


import java.util.Scanner;
import java.util.logging.Logger;



public class Shop {
	static Logger log = Logger.getLogger(Shop.class.getName());
	public static void main(String[] args) {

		log.info("\t\t\t\t\tEmart Fruit Market");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("\t\t\t\t\t What You Want Us To Do:");
		int i;
		
		log.info("\t\t\t\t\t1.View Compelete Product List \n \t\t\t\t\t2.View Our Rate List \n \t\t\t\t\t3.Search Products\n \t\t\t\t\t4.View Our Best Sellers(Sorting)");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		log.info("\t\t\t\t\t  Enter your option");
		 i=sc.nextInt();
		 
		log.info("==================================================================================================================");
		Options types= new Options();
		if(i==1) {
			
			
			
			types.compeletelist();
		
		}
		else if(i==2){
			types.ratelist();
			
		}else if(i==3){
			types.search();
		}
		else if(i==4){
			types.sort();
		}
		sc.close();
}
}
