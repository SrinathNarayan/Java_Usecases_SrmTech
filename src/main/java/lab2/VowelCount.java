package lab2;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args)
	       
	    {
		
	        String str;
	        Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string");
			str = sc.nextLine();
	            str = str.toLowerCase();
	  
	     
	        char[] chars = str.toCharArray();
	  
	        int count = 0;
	  
	        for (int i = 0; i < str.length(); i++)
	        {
	           
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u')
	            {
	               
	                count++;
	            }
	        }
	  
	       
	        System.out.println("Total no of vowels in string are: " + count);
	    }
}
