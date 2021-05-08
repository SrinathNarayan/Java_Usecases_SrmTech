package AirProcess;

import java.util.ArrayList;
import java.util.Scanner;



public class Search extends ViewAllRecords{
 public void searchfilter() {
	 	FilterOpertaion f = new FilterOpertaion();
		Scanner sc = new Scanner(System.in);
		String custName ;
		String phoneNumber;
		String custid;
		
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			System.out.println("Enter How Many Records you Need To print");
			System.out.println("-----------------------------------------------------------------------------------------------------------------");
			int n = sc.nextInt();
			if(n >= 10)
			{
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				System.out.println("Printing Minimal Amount of data");
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				f.getFirstTenRecords(allrecords(), 10);
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
			}
			else
			{
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				System.out.println("Display The Data");
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
				f.getFirstTenRecords(allrecords(), n);
				System.out.println("-----------------------------------------------------------------------------------------------------------------");
			}
		System.out.println("Enter The Customer Name");
		System.out.println("==============================================================================================================="); 
		custName = sc.next();
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter The Customer Phone Number");
		System.out.println("==============================================================================================================="); 
		phoneNumber = sc.next();
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Enter The Customer id");
		System.out.println("==============================================================================================================="); 
		custid= sc.next();
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Sort By Customer Country");
		f.SearchByCountry(allrecords());
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Sort By Customer Code");
		f.SearchByCountryCon(allrecords());
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Sort By Name And Phone Number");
		f.SearchByCustNameAndPhoneNumber(allrecords(), custName, phoneNumber);
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Sort By Base Number");
		f.SortByBaseNumber(allrecords());
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("Convert All Name to Uppercase");
		f.SortByBaseNumber2(allrecords());
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
 }
}
