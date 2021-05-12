package AirProcess;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;



public class ViewAllRecords {
	static Logger log = Logger.getLogger(ViewAllRecords.class.getName());
	static ArrayList<CustomerDetails> custList = new ArrayList<CustomerDetails>();	
	FilterOpertaion f = new FilterOpertaion();
	Scanner sc = new Scanner(System.in);
public ArrayList<CustomerDetails> allrecords(){

	custList.add(new CustomerDetails(101, "Srinath", "South Africa", "No.203- Chennai",true, "9632587412", "10%", "yes", 3577, "Prepaid" ));
	custList.add(new CustomerDetails(189, "Kishore", "Africa", "No.208-Lincon Street",false, "32415698714", "52%", "no", 4500, "Postpaid" ));
	custList.add(new CustomerDetails(123, "Lokesh", "Londen", "No.1123-Baisl Street",true, "9845671234", "15%", "no", 6500, "Prepaid" ));
	custList.add(new CustomerDetails(178, "Latta", "Paris", "No.2634- Cross Street",true, "32169874562", "65%", "yes", 6900, "Postpaid" ));
	custList.add(new CustomerDetails(136, "Sumathy", "Pakistan", "No.2987-Gloden Circle Street",true, "9874563214", "15%", "yes", 1200, "Prepaid" ));
	custList.add(new CustomerDetails(123, "Guna", "India", "No.963-SouthPlus Street",false, "9511598746", "35%", "yes", 2011, "Postpaid" ));
	custList.add(new CustomerDetails(654, "Priya", "China", "No.258- Paw Street",true, "3219514698", "35%", "no", 3600, "Postpaid" ));
	custList.add(new CustomerDetails(894, "Shiney", "Japan", "No.321-Queens Street",false, "3214785265", "56%", "yes", 3044, "Postpaid" ));
	custList.add(new CustomerDetails(568, "Viji", "SriLanka", "No.951-Wood Street",false, "369785412", "85%", "no", 9500, "Postpaid" ));
	custList.add(new CustomerDetails(995, "Laxhimi", "Brazil", "No.159-Glss Cross Street",true, "321456987", "65%", "yes", 1200, "Prepaid" ));
	custList.add(new CustomerDetails(456, "Muthu", "NewYork", "No.852-Bliss Street",false, "3698521475", "45%", "no", 3698, "Prepaid" ));
	custList.add(new CustomerDetails(753, "ShiVa", "Canada", "No.2894- Gorgee Town",true, "565616987451", "78%", "yes", 1478, "Prepaid" ));
	custList.add(new CustomerDetails(987, "Mota", "Germany", "No.931-Hitler Street",false, "3214569874", "02%", "yes", 3698, "Postpaid" ));
	custList.add(new CustomerDetails(654, "Piyush", "Afganisthan", "No.863-Grid Twon",false, "3265987412", "36%", "no", 2136, "Prepaid" ));
	custList.add(new CustomerDetails(231, "Hakuna Matta", "Canada", "No.236-Beach Street",true, "347856912", "25%", "yes", 1598, "Prepaid" ));
	custList.add(new CustomerDetails(952, "Jk", "Koera", "No.569-Food Street",false, "9710526061", "20%", "yes", 1400, "Prepaid" ));

	return custList;
	
}
	void display()
	
	{
		log.info("\t\t\t\t\t Customer Compelete History");
		log.info("-----------------------------------------------------------------------------------------------------------------");
		Iterator<CustomerDetails> itr = allrecords().iterator();
		
		while(itr.hasNext())
		{
			log.info( "" +itr.next());
		}
		log.info("-----------------------------------------------------------------------------------------------------------------");
	}
}
