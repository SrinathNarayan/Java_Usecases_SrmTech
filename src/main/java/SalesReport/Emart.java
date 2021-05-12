package SalesReport;

import java.util.Scanner;
import java.util.logging.Logger;
public class Emart {
	static Logger log = Logger.getLogger(Emart.class.getName());
	public static void main(String[] args) {

		log.info("\t\t\t\t\tEmart Super Market");
		log.info(	"\t\t\t\t\t    Since 1978");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("\t\t\t\t\tChoose your Catogory:");
		int i;
		int j = 0;
		int k = 0;
		int  h=0;
		log.info("\t\t\t\t\t    1.Bevrages \n \t\t\t\t\t    2.Vegetables \n \t\t\t\t\t    3.Foodgrains");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		log.info("\t\t\t\t\t  Enter your option");
		 i=sc.nextInt();
		log.info("==================================================================================================================");
		Catogories types= new Catogories();
		if(i==1) {
			types.beverages();
			log.info("\t\t\t\t\tChoose your Product:");
			 j=sc.nextInt();
			 Products product = new Products();
			if(j==1) {
				product.beveragecocoorder();
				}
				if(j==2) {
					product. beveragepepsiorder();
				}
			}
		if(i==2) {
			types.vegetables();
			log.info("\t\t\t\t\tChoose your Product:");
		   k=sc.nextInt();
		   Products aproduct = new Products();
			if(k==1) {
				aproduct.vegetablesTomatoProducts();
				}
				if(k==2) {
					aproduct. vegetablesPotatoProducts();
				}
				
				
			}
		if(i==3) {
			types.foodgrains();
			log.info("\t\t\t\t\t Choose your Product:");
		   h=sc.nextInt();
		   Products aproduct = new Products();
			if(h==1) {
				aproduct.foodGrainAttaProducts();
				}
				if(h==2) {
					aproduct. foodGrainsRiceProducts();
				}
				
			}
		log.info("\n------------------------------------------\n");
		log.info("Willing to Place the order (Yes/No):");
		
	   
        if(i== 1 && j == 1) {
        	FinalPayment pay = new FinalPayment();
      pay.cocolapay();
        } else if (i== 1 && j == 2) {
    	  FinalPayment pay = new FinalPayment();
  	     pay.pepsipay();
        }
  	   else if (i== 2 && k == 1) {
  		 FinalPayment pay = new FinalPayment();
  		     pay.tomatopay();
  		     
  			}else if (i== 2 && k == 2) {
  				FinalPayment pay = new FinalPayment();
  			     pay.potatopay();
  			}
  			else if (i== 3 && h == 1) {
  		  		 FinalPayment pay = new FinalPayment();
  		  		     pay.ricepay();
  		  		     
  		  			}else if (i== 3 && h == 2) {
  		  				FinalPayment pay = new FinalPayment();
  		  			     pay.attapay();
  		  			}
  	     sc.close();
  	}
       
} 

	


