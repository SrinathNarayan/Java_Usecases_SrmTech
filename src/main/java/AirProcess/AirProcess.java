
package AirProcess;

import java.util.Scanner;


public class AirProcess {
	public static void main(String[] args) {

		System.out.println("\t\t\t\t\t Aircel AirProcess Services");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t    Choose your Services:");
		System.out.println("\t\t\t\t        =============================");
		int i;
		System.out.println("\t\t\t\t\t 1.View Compelete History   \n \t\t\t\t\t 2.Search Particular Customer History");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t\t    Select Your Service");
		System.out.println("\t\t\t\t       =============================");
		 i=sc.nextInt();
		System.out.println("==================================================================================================================");
		Services types= new Services();
		if(i==1) {
			
			types.display();
			}
		if(i==2) {
			types.searchfilter() ;
			
			}
}
}