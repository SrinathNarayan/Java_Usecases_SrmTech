package lab1;

import java.util.Scanner;
import java.util.logging.Logger;

public class ReverseString {
	static Logger log = Logger.getLogger(ReverseString.class.getName());
	public static void main(String args[])  
	{  
	String s;  
	Scanner sc=new Scanner(System.in);         
	log.info("Enter a String: ");  
	s=sc.nextLine();  
	log.info(" reverse string is: ");  
	int i=s.length();                   
	while(i>0)  
	{  
	log.info( "" +s.charAt(i-1));                 
	i--;                                
	}  
	sc.close();
}
}
