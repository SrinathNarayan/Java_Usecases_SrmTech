package AirProcess;
import java.util.Scanner;
import java.util.logging.Logger;



public class Search extends ViewAllRecords{
	static Logger log = Logger.getLogger(Search.class.getName());
 public void searchfilter() {
	 	FilterOpertaion f = new FilterOpertaion();
		Scanner sc = new Scanner(System.in);
		String custName ;
		String phoneNumber;
		Integer custid;
		
			log.info("-------------------------------------------------------------------------------------------------------------------");
			log.info("Enter How Many Records you Need To print");
			log.info("-------------------------------------------------------------------------------------------------------------------");
			int n = sc.nextInt();
			if(n >= 10)
			{
				log.info("------------------------------------------------------------------------------------------------------------------");
				log.info("Printing Minimal Amount of data");
				log.info("----------------------------------------------------------------------------------------------------------------");
				f.getFirstTenRecords(allrecords(), 10);
				log.info("--------------------------------------------------------------------------------------------------------------");
			}
			else
			{
				log.info("------------------------------------------------------------------------------------------------------------------");
				log.info("Display The Data");
				log.info("----------------------------------------------------------------------------------------------------------------");
				f.getFirstTenRecords(allrecords(), n);
				log.info("---------------------------------------------------------------------------------------------------------------");
			}
		log.info("Enter The Customer Name");
		log.info("=============================================================================================================="); 
		custName = sc.next();
		log.info("---------------------------------------------------------------------------------------------------------------");
		log.info("Enter The Customer Phone Number");
		log.info("==============================================================================================================="); 
		phoneNumber = sc.next();
		log.info("------------=-----------------------------------------------------------------------------------------------------");
		log.info("Sort By Name And Phone Number");
		f.searchByCustNameAndPhoneNumber(allrecords(), custName, phoneNumber);
		log.info("-----------=------------------------------------------------------------------------------------------------------");
		log.info("Sort By Customer Country");
		f.searchByCountry(allrecords());
		log.info("-----------------------------------------------------------------------------------------------------------------");
		log.info("Sort By Customer Code");
		log.info("Enter The Customer id");
		log.info("==============================================================================================================="); 
		custid= sc.nextInt();
		f.printByCustomerId(custList,custid);
		log.info("-----------------------------------------------------------------------------------------------------------------");
		sc.close();	
 }
}
