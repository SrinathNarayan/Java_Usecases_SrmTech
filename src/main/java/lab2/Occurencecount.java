package lab2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Occurencecount {
	static Logger log = Logger.getLogger(Occurencecount.class.getName());
	static void countEachChar(String str) 
	   { 
		
		int counter[] = new int[256]; 

		
		int len = str.length(); 
		for (int i = 0; i < len; i++) 
			counter[str.charAt(i)]++; 
		char array[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
		   array[i] = str.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 

			
			if (str.charAt(i) == array[j])  
				flag++;                 
		   } 

		   if (flag == 1)  
		     log.info("Occurrence of char " + str.charAt(i)
			 + " in the String is:" + counter[str.charAt(i)]);             
		} 
	   } 
	   public static void main(String[] args) 
	   {  
		   
		String str ; 
		Scanner sc = new Scanner(System.in);
		log.info("Enter the string");
		str = sc.nextLine();
			
		countEachChar(str); 
		sc.close();
	 }

}
