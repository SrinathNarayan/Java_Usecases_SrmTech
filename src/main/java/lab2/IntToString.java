package lab2;

import java.util.Scanner;

public class IntToString {
	
	 public static void main(String[] args) {
		 int num ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Days");
			num = sc.nextInt();
	       
	        
	        String msg = String.format("There are %s DaYs Left", num);
	        
	        System.out.println(msg);             
	    }
}
