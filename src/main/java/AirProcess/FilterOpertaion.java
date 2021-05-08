package AirProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class FilterOpertaion {
	public void getFirstTenRecords(ArrayList<CustomerDetails> cust,int n)
	{
		cust.stream().limit(n).collect(Collectors.toSet())
        .forEach(System.out::println);
		
	}

	
	
	public void SearchByCountryCon(ArrayList<CustomerDetails> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("South Africa") && c.description.equals("Prepaid") && c.isActive == true)
		.map(c->c)
		.forEach(System.out::println);
	}
	
	public void SortByBaseNumber(ArrayList<CustomerDetails> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Germany") && c.phoneNumber.startsWith(c.phoneNumber, 61) && c.is4g.equals("yes"))
		.map(c->c)
		.forEach(System.out::println);
	}
	
	public void SearchByCustNameAndPhoneNumber(ArrayList<CustomerDetails> cust, String custName ,String phonenumber)
	{
		cust.stream().filter(c-> c.customerName.equals(custName) && c.phoneNumber.equals(phonenumber))
		.map(c->c)
		.forEach(System.out::println);
	}
	public void PrintByCustomerId(ArrayList<CustomerDetails> cust , String custid)
	{
		List<CustomerDetails> l = cust.stream().filter(c-> c.customerId.equals(custid))
				.collect(Collectors.toList());
		if(l.isEmpty())
		{
			System.out.println("No Record Found");
		}
		else
		{
			System.out.println(l);
		}
		
	}
	public void SortByBaseNumber2(ArrayList<CustomerDetails> cust)
	{
		cust.stream().filter(c-> c.baseCountry.equals("Canada") && c.phoneNumber.startsWith(c.phoneNumber, 56))
		.map(c -> c.customerName.toUpperCase())
		.forEach(System.out::println);
	}

	public void SearchByCountry(ArrayList<CustomerDetails> cust) {
		cust.stream().filter(c-> c.baseCountry.equals("Germany") && c.description.equals("Postpaid"))
        .collect(Collectors.toSet())
        .forEach(System.out::println);
		
	}





}
