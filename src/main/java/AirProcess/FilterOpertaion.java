package AirProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;



public class FilterOpertaion {
	static Logger log = Logger.getLogger(FilterOpertaion.class.getName());
	public void getFirstTenRecords(ArrayList<CustomerDetails> cust,int n)
	{
		cust.stream().limit(n).collect(Collectors.toSet())
        .forEach(System.out::println);
		
	}

	
	
	public void searchByCountryCon(ArrayList<CustomerDetails> cust
			)
	{
		cust.stream().filter(c-> c.baseCountry.equals("South Africa") && c.description.equals("Prepaid") && c.isActive == true)
		.map(c->c)
		.forEach(System.out::println);
	}
	
	public void sortByBaseNumber(ArrayList<CustomerDetails> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Germany") && c.phoneNumber.startsWith(c.phoneNumber, 61) && c.is4g.equals("yes"))
		.map(c->c)
		.forEach(System.out::println);
	}
	
	public void searchByCustNameAndPhoneNumber(ArrayList<CustomerDetails> cust, String custName ,String phonenumber)
	{
		cust.stream().filter(c-> c.customerName.equals(custName) && c.phoneNumber.equals(phonenumber))
		.map(c->c)
		.forEach(System.out::println);
		}
	public void printByCustomerId(ArrayList<CustomerDetails> cust , Integer custid)
	{

List<CustomerDetails> list = cust.stream().filter(c-> c.customerId.equals(custid)).collect(Collectors.toList());
		
		if(list.isEmpty())
		{
			System.out.println("No Record Found");
		}
		else
		{
			System.out.println("Customers with matching id found");
			System.out.println(list);
		}
	}
	public void sortByBaseNumber2(ArrayList<CustomerDetails> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Canada") && c.phoneNumber.startsWith(c.phoneNumber, 56))
		.map(c -> c.customerName.toUpperCase())
		.forEach(System.out::println);
	}

	public void searchByCountry(ArrayList<CustomerDetails> cust) {
		cust.stream().filter(c-> c.baseCountry.equals("Germany") && c.description.equals("Postpaid"))
        .collect(Collectors.toSet())
        .forEach(System.out::println);
		
	}




}
